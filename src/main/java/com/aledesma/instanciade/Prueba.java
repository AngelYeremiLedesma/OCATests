package com.aledesma.instanciade;

class A implements ILetra{}

class B extends A{}

class C extends B{}
public class Prueba {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new B();
        C a2 = new C();

        System.out.println(a2 instanceof B);
    }
}
