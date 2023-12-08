package com.aledesma.tipos;

public class Prueba2 {

    public static int entero=4;
    public String cadena = "6666n";

    static {entero=5;
        System.out.println("Dentro del inicializador static");}
    {cadena="777777s";
        entero=7;
        System.out.println("Dentro del incializador de instancias");}

    private Prueba2(){

        System.out.println("Dentro del constructor");
        this.cadena="88888888h";
    }

    public static void main(String[] args) {
        System.out.println("Dentro del main");
        System.out.println(entero);

        System.out.println(new Prueba2().cadena);
        System.out.println(entero);
    }

}
