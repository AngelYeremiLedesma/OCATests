package com.aledesma.constructores;

// conclusiones, siempre va a cargar de arriba hacia abajo para als declaraciones globales tipo int i = 5, al igual que los {} y static{}

// primero van siempre los de static y luego los de isntancia

//finalmente van los constructores

//se le puede dar un valor en los {}, pero no se puede pedir la referencia si esta abajo la declaración

//fuera de variables globales static y no static, no tiene problema con el orden como con funcionx

public class Pruebas {



    {
         int i = 5;
        instanciaInt = 7;
        //System.out.println(instanciaInt); //marca error de compilacion, pues no la detecta
        funcionx();
    }


    static {

        //public static int i = 5; // no es zona para declarar
        estaticInt1=8;
        //System.out.println(estaticInt1); //no compila, no la detecta
    }


    static {
        //System.out.println(i); // no se declaró como global
        System.out.println("Dentro del static inferior{");
        //System.out.println("antes: " + estaticInt1);
        estaticInt1=9;
        //System.out.println("despues: "+ estaticInt1);
        System.out.println("}");
    }



    public static void main(String[] args) {
        System.out.println(estaticInt1);
        Pruebas prueba = new Pruebas();
        System.out.println(prueba.instanciaInt);
        System.out.println(Pruebas.estaticInt1);
    }
    public Pruebas(){ //aqui no se puede poner ni final, ni static, ni void
        System.out.println(instanciaInt);
        System.out.println(estaticInt1);
        instanciaInt = 10;
        estaticInt1 = 10;
    }

    int instanciaInt = 6;
    static int estaticInt1 = 5;

    public static void funcionx(){

    }

}
