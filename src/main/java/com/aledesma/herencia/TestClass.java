package com.aledesma.herencia;

public class TestClass {
    public static void main(String[] args) {
        //String s = null;
        //System.out.println(s.getClass());
        Base b  = new Base();
        BaseSon s = new BaseSon();
        s=(BaseSon) b;
    }
}

interface Interfaceable{
    public default void metodo() {

    }
}

class SuperBase{

}
class Base extends SuperBase{
    public short metodo(int a){
        return 0;
    }
}

class BaseSon extends Base{
    public byte metodo(){ //aqui podemos ver la covarianza, que no acplica para primitivos
        //this.super(); //esto o cualquier combinacion con this y super no se puede
        return 0;
    }
}
