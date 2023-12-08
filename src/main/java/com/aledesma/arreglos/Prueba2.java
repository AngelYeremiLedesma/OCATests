package com.aledesma.arreglos;

public class Prueba2 {
    public static void main(String[] args) {
        int[] arr = {};
        int[] arr2;
        //arr2={1,2}; //no posible

        //int[] arr3[] = {{},new int[]};//siempre posible
        switch(1){
            //System.out.println("");
        }

        Integer i1 = 1;
        byte b1 = 1;
        System.out.println(i1==b1); //si fuera Byte y no byte, siempre que haya un primitivo hace unboxings

        StringBuilder sb = new StringBuilder("Hola");
        String s = String.valueOf(sb);
        System.out.println(s);
    }
}
