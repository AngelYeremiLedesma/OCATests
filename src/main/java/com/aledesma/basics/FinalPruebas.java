package com.aledesma.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import com.aledesma.basics.RopeSwing;

public class FinalPruebas {
    public final String dato; //Se debe inicializar aqui o en un {} o en constructor, no checa en otro lado ni en el main

    static {
    }

    public FinalPruebas() {
        dato = "";
    }

    public static /* Comentario al inicio de linea*/ void main(String[] args) {
        System./*comment*/out/*comment*/.println(""/*comment*/);
        System.out.println("");
        RopeSwing rs = new RopeSwing();
    }

    //abstract void(){} //no posible en concretas
}
interface Interface {
    //final abstract void metodox();
    public default void metodo(){};
}


