package com.aledesma.basics.mainsfuncionales;

public class mains {
//    static public void main(String[] args) { //Sí funciona aunque cambie static y public
//
//    }

//    static public final void main(String[] args){
//        System.out.println("Con final si es un main real ");
//    }

//    final static public void main(String[] args){
//        System.out.println("Con final al inicio si es un main real ");
//    }

//    static final public void main(String[] args) {
//        System.out.println("Con final al medio si es un main real ");
//    }

//    public static void main(String ... args) { //en cualquier punto en medio que se pongan
//        System.out.println("varargs si jala");
//    }

//    public static void main(...String args...) { //Al final ni al frente no deben ir los varargs
//
//    }

    public static void main(String[]... args) { //No lo detecta como main, pero no marca error
        System.out.println("corriendo bidiemnsional ");
    }

    public static void main(String[] args) {
        System.out.println(args[0]); //Como se esperaba, esto marca indexoutofbound
    }
}
