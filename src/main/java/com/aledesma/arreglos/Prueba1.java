package com.aledesma.arreglos;

//import com.aledesma.basics.Interface;
//Si la variable de referencia se crea, pero no el objeto, apunta a null, si preguntamos por algo de dicha variable mandara nullpointer o nul si preguntas quien
//Un arreglo vacío tiene length 0, pero no tiene por que mandar nullpointer si ya se creó el objeto
//cuando menos la primer dimension debe quedar establecida al crear un objeto array
// cualquier cariable local debe ser inicializada antes de llamarse, si no marca error y no compilña
//Cualquier array cuyo tipo sea Objeto, si es bidimensional, desde la primer capa apuntara a null, es decir, un subarreglo es Object y lo inicia en null, sin importar si es local o global
// Si no se ha metido un subarray en un array y se intenta acceder a un punto, marcara un null pointer
// se debe meter en un array una variable del tipo que pide exactamente o un null, no acepta ni objects genericos que si contengan, debe ser exacto, no deja compilar
//{"",""} solo funciona en la primer declaracion del arreglo

public class Prueba1 {
    static int[] arregloInts;
    static int[] arregloInts2 = {};
    //static int[] arregloInts3 = new int[];  //esto marca error, pues no establece el tamaño
    static int[][] arregloInts4 = new int[4][]; // con esto funciona pues es la primer dimension
    static int[][][] [] []arregloInts6[][] []= new int[3][][][][][][][];//puro warning de declaracion tipo c, pero la cantidad total de corchetes debe sumar lo mismo en ambos lados,
    static int[] arregloInts7 = new int[5];


    public static void main(String[] args) {
        int i;
        int[][] arregloInts5 = new int[4][]; // con esto funciona pues es la primer dimension
        int[] arregloInts8 = new int[5];
        boolean[] arregloBooleans9 = new boolean[3];
        Integer[] arregloInteger10 = new Integer[3];
        char[] arregloCharacters11 = new char[2];

        //System.out.println(arregloInts.length); //Marcaria nullpointer, pues no se ha creado un objeto al que apunte, pero la referencia existe
        System.out.println(arregloInts2.length);
        System.out.println(arregloInts4.length);
        //System.out.println(i);

        //arregloInts4[0]=1; //marcara error, pues 1 no es un arreglo, y ya se estableció desde arriba que debe ser bidimensional
        arregloInts4[0]=null; // no marca error, pues no apunta a nada
        System.out.println(arregloInts4[1]); //
        System.out.println(arregloInts5[0]);
        //System.out.println(arregloInts4[0][1]); // arroja nullpointer exception pues no se ha creado el objeto
        Object[] objetizo = new Object[]{1,2,3}; //Otra forma válida de declarar un array, no poner dimension, aún cuando coincida no dejara compilar
        //System.out.println(arregloInts4[1][]); // debemos llenar cada corchete o no ponerlo al consultar un elemento


        System.out.println(arregloInts7[0]); // podemos ver que si inicializa los arreglos en 0 para todos los primitivos
        System.out.println(arregloInts8[0]); //aqui se confirma que lo inicializa en eso tanto para locales como para globales
        System.out.println(arregloBooleans9[0]); // aqui se confirma que para todos los primitivos funciona esa inicializacion automatica
        System.out.println(arregloInteger10[0]); //Imprime null, pues los wrapers no los cuenta como primitives
        System.out.println((int)arregloCharacters11[0]); // si se va al caracter u0

        String[][] arregloStrings = {{}};
        System.out.println(arregloStrings[0]); //imprime la direccion del objeto, pues Array no tiene sobreescrito el toString
        //System.out.println(arregloStrings[1]); //marca arrayindexoutofbounds
        //System.out.println(arregloStrings[0][1]);//marca indexoutofbound pues su lengt interior es 0
        //System.out.println(arregloStrings[1][0]); //marca indexoutofbounds

        String[][] arregloStrings2 = {};//no marca error, pues su lengt es de 0 el de fuera
        System.out.println(arregloStrings2); //las direcciones de un doble array son [[LJava.lang.Tipo;@...

        //String[][] arregloStrings3 = {{1,2},null}; //marca error pues no es el tipo, no compila el {1,2}

        String[][] arregloStrings4 = {{},null};
        System.out.println(arregloStrings4[0]);

        //int[] arregloInts13 = {null}; //marca error de compilacion porque la capa mas interna requiere sí tener el tipo
        int[][] arregloInts13 = {null}; //no marca error, pues la parte mas interna no existe
        //System.out.println(arregloInts13[0,1]); // ni siquiera se puede, amrca error

        char[][] arregloChars2= {new char[]{},new char[]{}};
        //String[1][1] arregloStrings45 = {{"1"}}; // no delcarar dimensiones a la izquierda

        //[][] String arreglo; //imposible que vayan al principio

        String[][] arrayStrings19 = new String[4][];
        arrayStrings19[0]= new String[]{"",""};
        String[] subArray = {"1","2"};
        arrayStrings19[1] = subArray;
        //arrayStrings19 = {{""},{""}}; // marca error, como podemos ver aqui y abajo, esta forma de inicializar, solo funciona al declarar
        //arrayStrings19[1]= {"1","2","3"}; //marca error de compilacion
        System.out.println("entró al ultimo: " + arrayStrings19[0][1]);
    }
}
