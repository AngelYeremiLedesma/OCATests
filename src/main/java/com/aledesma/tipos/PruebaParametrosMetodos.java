package com.aledesma.tipos;

import java.util.ArrayList;

public class PruebaParametrosMetodos {
    public static void main(String[] args) throws Exception {
        ArrayList<Double> al = new ArrayList<>();

        //INSERT CODE HERE

        al.add(1.0);//Add requiere el mismo valor exacto
        al.indexOf(1);//IndexOf acpeta cualquier Objetco del tipo que sea relacionado o no
        al.contains(true);//Contains acepta cualquier objeto del tipo que sea se relacione o no

    }
}
