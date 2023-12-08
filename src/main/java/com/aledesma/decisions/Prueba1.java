package com.aledesma.decisions;

public class Prueba1 {
    public static void main(String[] args) {
        int b = 0;
        int a = b = 6;
        int resultado = ++a + a++ + a;
        System.out.println(resultado);
    }
}
