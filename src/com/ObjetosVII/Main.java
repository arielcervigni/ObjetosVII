package com.ObjetosVII;

import com.ObjetosVII.Ejercicio1.Pantalla;
import com.ObjetosVII.Ejercicio2.Alumno;
import com.ObjetosVII.Ejercicio2.Colegio;

public class Main {

    public static void main(String[] args)  {
        //ejercicio1();
        ejercicio2();

    }

    private static void  ejercicio1()
    {
        Pantalla pantalla = new Pantalla();
        pantalla.adivinar();
    }
    private static void ejercicio2() {
        Colegio colegio = new Colegio();
        Alumno a1 = null;
        Alumno a2 = new Alumno("Pepe Grillo", "Argentino");
        Alumno a3 = new Alumno("Pepita La Pistolera", "Argentino");
        Alumno a4 = new Alumno("Leroy Sane", "Aleman");
        Alumno a5 = new Alumno("Sadio Mane", "Argelia");
        Alumno a6 = new Alumno("Prueba", "Eliminar");


        colegio.agregarAlumno(a2);
        colegio.agregarAlumno(a3);
        colegio.agregarAlumno(a4);
        colegio.agregarAlumno(a5);
        colegio.agregarAlumno(a1);

        for (Alumno a : colegio.getAlumnos())
        {
            System.out.println(a.toString());
        }
        /*
        Map<String,Integer> nacionalidades = colegio.verTodos();

        for (Map.Entry<String, Integer> entry : nacionalidades.entrySet())
        {
            System.out.println("Nacionalidad: " + entry.getKey() + " ---> Cantidad: " + entry.getValue());
        }


        colegio.borrar(a6);
        colegio.cuantos();
        for (String s : colegio.getNacionalidades()){
            System.out.println(s);
        }

        int verNacio = colegio.verNacionalidad("Argentino");

         */
    }


}




