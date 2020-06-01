package com.ObjetosVII.Ejercicio1;

public class Pantalla extends Numero {

    private int contador;

    public Pantalla ()
    {
        super();
        this.contador = 1;
    }

    public int getContador () { return this.contador; }
    public void setContador(int cont) { this.contador = cont; }

    public String respuestaNumero (int num) {
        String rta = "";
        if (num > numeroAAdivinar)
            rta = "El numero a adivinar es MENOR que el ingresado";
        else {
            if (num < numeroAAdivinar)
                rta = "El numero a adivinar es MAYOR que el ingresado";
            else
                rta = "ENCONTRASTE EL NUMERO EN " + contador + " INTENTOS";
        }
        return rta;
    }

    public void adivinar ()
    {
        System.out.println("BIENVENIDO A BUSCAR EL NUMERO.");
        System.out.println("numero: " + this.numeroAAdivinar);

        String srta = "";
        boolean rta = false;

        while (rta == false)
        {
            try {
                Teclado teclado = new Teclado();
                srta = respuestaNumero(Integer.parseInt(teclado.scannearNumero()));
                System.out.println(srta);
                if (srta == "ENCONTRASTE EL NUMERO")
                    rta = true;
                else {
                    rta = false;
                    this.contador++;
                }
            }catch (NumberFormatException e) {
                this.contador++;
                System.out.println("No es un número. Por favor ingrese un NUMERO.");
            }

        }
    }
}
