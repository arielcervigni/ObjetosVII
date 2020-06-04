package com.ObjetosVII.Ejercicio2;

import java.io.*;
import java.util.*;

public class Colegio implements Archivoo {

    // 4. Crea una clase colegio que almacene el listado de los alumnos (compuestos por su nombre y nacionalidad).
    ArrayList <Alumno> alumnos;
    ArrayList <String> nacionalidades;

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public Colegio() {
         this.alumnos = new ArrayList<>();
         this.nacionalidades = new ArrayList<>();
    }

    public ArrayList<String> getNacionalidades () { return nacionalidades; }

    //agregarAlumno(Alumno alumno): añade la nacionalidad de un nuevo alumno

    public void agregarAlumno (Alumno alumno) {
        try {
            validarAlumno(alumno);
        } catch (NullPointerException e){
            System.out.println("Error al cargar el alumno");
        }
    }
    /// Validacion de alumno
    private void validarAlumno (Alumno alumno) throws NullPointerException {
        if (alumno==null)
            throw new NullPointerException();
        else
            alumnos.add(alumno);
    }
    //verNacionalidad(String nacionalidad): Muestra la nacionalidad y el número de alumnos de esa nacionalidad

    public int verNacionalidad (String nacionalidad)
    {
        int rta = 0;
        if (!alumnos.isEmpty()) {
            for (Alumno a : this.alumnos) {
                if (a.getNacionalidad() == nacionalidad)
                    rta++;
            }
        }
        else
            System.out.println("No hay alumnos");

        return rta;
    }

    //cuantos(): Muestra cuántas nacionalidades diferentes existen en el colegio.
    public int cuantos ()
    {
        if (!alumnos.isEmpty()) {
            for (Alumno a : this.alumnos) {
                if (!nacionalidades.contains(a.getNacionalidad()))
                    nacionalidades.add(a.getNacionalidad());
            }
        }
        else {
            System.out.println("No hay alumnos cargados");
        }
        return nacionalidades.size();
    }

    //borrar(Alumno alumno): Elimina los datos insertados.

    public void borrar(Alumno alumno) {

        if (alumnos.contains(alumno))
            alumnos.remove(alumno);
        else
           System.out.println("El alunmo no existe");
    }

    //VerTodos(): Muestra las distintas nacionalidades y el número de alumnos que
    //existen por nacionalidad.

    public Map<String, Integer> verTodos ()
    {
        Map<String, Integer> mapNacionalidades = new TreeMap<>();

        for (Alumno a : alumnos)
            mapNacionalidades.put(a.getNacionalidad(),verNacionalidad(a.getNacionalidad()));

        return mapNacionalidades;
    }


    //Para todos estos métodos se deben generar distintas validaciones para prevenir
    //errores en la ejecución.
    //
    //Por ej: Que todos los alumnos tengan una nacionalidad que exista el alumno que se quiere borrar, etc.


    @Override
    public void crearArchivo() throws IOException {

        String path = "C:\\Users\\Taller.MAKER\\Desktop\\ObjetosVII-master\\ArchivoDeAlumnos.txt";
        File archivo = new File(path);

        if (archivo.exists()) {

            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            try {
                archivo.setWritable(true);
                Alumno a = alumnos.get(2);
                oos.writeObject(a);
                //oos.close();
            } catch (IOException e) {
                System.out.println("ERROR" + e.getMessage());
                e.printStackTrace();
            } finally {
                oos.close();
            }
        }else
            System.out.println("Error el archivo no existe");
    }

    @Override
    public void leerArchivo() throws IOException {
        String path = "C:\\Users\\Taller.MAKER\\Desktop\\ObjetosVII-master\\ArchivoDeAlumnos.txt";
        File archivo = new File(path);

        if (archivo.exists()) {

            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);

            try {
                archivo.setReadable(true);
                Alumno aux = (Alumno) ois.readObject();
                //ois.close();
                System.out.println(aux.toString());
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("ERROR" + e.getMessage());
                e.printStackTrace();
            } finally {
                ois.close();
            }
        } else
            System.out.println("Error el archivo no existe");


    }
}
