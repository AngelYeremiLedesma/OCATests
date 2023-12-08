package com.aledesma.exceptions;

public abstract class ClaseAbs {
    abstract void calculate();

    public static void main(String[] args) {
        System.out.println("Calculating");
        ClaseAbs c = null;
        c.calculate();
    }
}
