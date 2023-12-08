package com.aledesma.basics.hijopadre;

public class Padre {

    static String nombreStaticPadre = "Nombre estatico del padre";
    String nombreInstanciaPadre = "Nombre instancia padre";

    static{
        System.out.println(nombreStaticPadre);
    }

    {
        System.out.println(nombreInstanciaPadre);
    }

    public Padre(){
        System.out.println("Ejecutando constructor del padre");
    }

}
