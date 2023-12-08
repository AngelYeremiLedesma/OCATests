package com.aledesma.tipos;

public class TestClass{
    public static Double wiggler(Double x){
        Double y = x + 10;
        x++;
        System.out.println(x);
        return y;
    }

    public static void main(String[] args){
        Integer intero = new Integer((int)100L);
        Double dataWrapper = new Double(5);
        Double value = wiggler(dataWrapper);
        System.out.println(dataWrapper+value);
    }
}
