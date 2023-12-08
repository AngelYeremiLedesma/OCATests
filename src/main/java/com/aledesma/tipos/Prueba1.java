package com.aledesma.tipos;
/*
Resumen:
1.Declaracion de atributos estaticas
2.static{}
Esto se hizo al existir la clase
3.Declaracion de atributos de instancia
4.{}
5.Constructor
 */
public class Prueba1 {
        public static void main(String args[ ] ){
            Prueba1 obj = new Prueba1(5);
        }
        int m;
        static int i1 = 5;
        static int i2 ;
        int  j = 100;
        int x;
        public Prueba1(int m){
            System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
        }
        { j = 30; i2 = 40; }  // Instance Initializer
        static { i1++; }      // Static Initializer
}
