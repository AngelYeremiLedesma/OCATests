package com.aledesma.basics.hijopadre;

public class Hijo extends Padre {

    static String nombreStaticHijo = "nombre static hijo";

    {
        System.out.println(nombreStaticHijo);
    }

    String nombreInstanciaHijo = "nombre instancia hijo";

    {
        System.out.println(nombreInstanciaHijo);
    }

    public Hijo(){
        System.out.println("Ejecutando constructor hijo");
    }

    public static void main(String[] args) {

        System.out.println("Entrando al main");
        Padre hijito = new Hijo();

    }


}
