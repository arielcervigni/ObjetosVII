package com.ObjetosVII.Ejercicio2;

import java.io.Serializable;

public class Alumno implements Serializable {


    protected String nombre;
    protected String nacionalidad;

    public Alumno () {}

    public Alumno (String nombre, String nacionalidad)
    {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre () { return this.nombre; }
    public String getNacionalidad () { return this.nacionalidad; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNacionalidad (String nacionalidad) { this.nacionalidad = nacionalidad; }

    @Override
    public String toString() {
        return "Alumno{" +
                "Nombre:'" + nombre + '\'' +
                ". Nacionalidad:'" + nacionalidad + '\'' +
                '}';
    }
}
