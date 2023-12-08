package com.aledesma.exceptions;

public class Test2 {
    public static void main(String[] args) {
        int i=0;
        try{
            System.out.println("imprimiendo algo");
            i=5;
            throw new RuntimeException();
        }catch(Exception e){
            System.out.println("pasando al catch");
        }
        System.out.println(i);
    }
}
