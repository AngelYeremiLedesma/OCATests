package com.aledesma.casts;

class A {

}

class B extends A {

}

class C extends A {

}

class B1 extends B {

}

public class CastenadoAndo {

    public static void main(String args[]) {
        A[] a, a1;
        B[] b;
        a = new A[10];
        a1 = a;
        b = new B[20];
        a = b;  // 1
        b = (B[]) a;  // 2
        b = (B[]) a1; // 3    }

    }
}