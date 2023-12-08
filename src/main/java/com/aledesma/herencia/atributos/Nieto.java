package com.aledesma.herencia.atributos;


class Abuelo {

    public Abuelo(){
        System.out.println(this.cadena);
    }

    public void metodoAbuelo(){
        System.out.println("metodo abuelo: " + cadena );
    }
    public static String cadena="uturu";
    public static final int entero=10;
}

class Padre extends Abuelo{
    public static final int entero=5;

    @Override
    public void metodoAbuelo() {
        super.metodoAbuelo();
        System.out.println(super.cadena);
    }
}

public class Nieto extends Padre{
    public static final int entero=2;
    public static String cadena ="the7son";

    public static void main(String[] args) {
        Abuelo n = new Nieto();
        System.out.println(n.cadena);
        System.out.println("************");
        n.metodoAbuelo();
        System.out.println("****************");
        Nieto n2 = new Nieto();
        System.out.println(n2.cadena);
    }

    @Override
    public void metodoAbuelo() {
        super.metodoAbuelo();
        System.out.println(super.cadena);
    }
}
