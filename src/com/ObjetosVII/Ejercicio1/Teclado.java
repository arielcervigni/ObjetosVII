package com.ObjetosVII.Ejercicio1;

import java.util.Scanner;

public class Teclado extends Numero {

    public String scannearNumero ()
    {
        Scanner numero = new Scanner(System.in);
        System.out.print("\nPor favor ingrese un número: ");
        return numero.nextLine();
    }

}
