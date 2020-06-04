package com.ObjetosVII.Ejercicio2;

import java.io.*;

public class Archivo extends Colegio {

    public void cargarArchivo() throws IOException {

        System.out.println("aca");
        String path = "C:\\Users\\Taller.MAKER\\Desktop\\ObjetosVII-master\\ArchivoDeAlumnos.txt";

        File archivo = new File(path);


        if (archivo.exists()) {
            System.out.println("Aca");
            FileOutputStream fos = new FileOutputStream(archivo);
            System.out.println("Aca2");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            System.out.println("Aca3");

            try {
                System.out.println("Aca");
                archivo.setWritable(true);
                System.out.println("Aca2");
                Alumno a = alumnos.get(2);
                System.out.println("Aca3");
                oos.writeObject(a);
                System.out.println("Aca4");
                oos.close();
                System.out.println("Aca5");

            } catch (IOException e) {
                System.out.println("Que no estudiaste vo?");
            } finally {
                oos.close();
            }
        }else
            System.out.println("Error el archivo no existe");
    }
}
