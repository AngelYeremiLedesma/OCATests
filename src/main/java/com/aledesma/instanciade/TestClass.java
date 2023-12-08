package com.aledesma.instanciade;

interface Flyer{ }
class Bird implements Flyer { }
class Eagle extends Bird { }
class Bat { }
final class BatHijo extends Bat{}

public class TestClass {

    public static void main(String[] args) {
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new BatHijo();

        String s = null;
        System.out.println();
        if(f instanceof Flyer) System.out.println("f is a Flyer");
        if(e instanceof Bird) System.out.println("e is a Bird");
        if(b instanceof Flyer) System.out.println("b is a Flyer");
        //if(b instanceof Bird) System.out.println("b is a Bird");
    }
}
//    What will be printed when the above code is compiled and run?

//interface Flyer{ }
//class Bird implements Flyer { }
//class Eagle extends Bird { }
//class Bat { }
//
//public class TestClass {
//
//    public static void main(String[] args) {
//        Flyer f = new Eagle();
//        Eagle e = new Eagle();
//        Bat b = new Bat();
//
//        if(f instanceof Bird) System.out.println("f is a Bird");
//        if(e instanceof Flyer) System.out.println("e is a Flyer");
//        if(b instanceof Flyer) System.out.println("b is a Flyer");
//    }
//}