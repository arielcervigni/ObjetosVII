package com.ObjetosVII.Ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Numero {

    //Escribe un programa que juegue con el usuario a adivinar un número. El
    //ordenador debe generar un número entre 1 y 500, y el usuario tiene que intentar
    //adivinarlo.
    //Para ello, cada vez que el usuario introduce un valor, el ordenador debe
    //decirle al usuario si el número que tiene que adivinar es mayor o menor que el
    //que ha introducido el usuario. Cuando consiga adivinarlo, debe indicarlo e
    //imprimir en pantalla el número de veces que el usuario ha intentado adivinar el
    //número.
    //Si el usuario introduce algo que no es un número, debe indicarlo en
    //pantalla, lanzar una excepción y contarlo como un intento.
    // Investigar qué excepción controla el tipo de datos ingresados.

    protected int numeroAAdivinar;

    public Numero () {
        this.numeroAAdivinar = generarNumero();
    }
    public int getNumeroAAdivinar ()
    {
        return numeroAAdivinar;
    }


    public int generarNumero () {
        Random rnd = new Random();
        return (int) rnd.nextInt(500)+1;
    }

}
