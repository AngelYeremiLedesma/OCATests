package com.aledesma.lambdas.ocp;


import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import static java.lang.System.out;


class TestClass {
    public static int operate(IntUnaryOperator iuo) {//
        return iuo.applyAsInt(5);/** Este es un java doc */
    }

    public static void main(String[] args) {
        IntFunction<IntUnaryOperator> fo = a-> b->a-b;  //1
        int x = operate(fo.apply(20)); //2
        System.out.println(x);
        Predicate<Number> fos = (a)->false;
        out.println();
    }
}


