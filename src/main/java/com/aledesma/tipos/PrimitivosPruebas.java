package com.aledesma.tipos;

public class PrimitivosPruebas {
    int i = 00_00;
    double d = 0_0.00;

    static int y = 010;
    static long z = 0x10L;
    static long w = 103;

//    public static void metodo2(int ... x, int y){
//
//    }

    public static void metodo1(Integer i){
        System.out.println("Integer");
    }

    public static void metodo1(int ... i){
        System.out.println("int");
    }

    public static void main(String[] args) {

        metodo1(10);




        long h = 125;
        System.out.println(010);
        System.out.println(0xFFFFFF);

        //metodo1((short)9);
        double d1 = 123.0F;
        float f1 = 123.0F;//aqui si es necesario una F
        float f2 = 123;
        short s = 11111;
        float f3 = (float)123D;
        //float f4 = (123D)F;
        char c = (char)-1;
        char c1 = (char)0x4235676; // Necesita el casteo porque se sale del rango, y supongo aplica desbordamiento
        char c2 = (char)0x5235676;
        System.out.println(c1);
        System.out.println(c2);
        //char c3 = "a";
        //char c4 = 'ab';
        char c5 = '\n';
        String s1 = "\n";
        System.out.println(s1);

        System.out.println(true);
        byte b1 = (byte)128;//-128
        byte b2 = (byte)-129;//127
        byte b3 = (byte)(b1 + b2);//-1
        System.out.println(b3);
        int i9 = 9;
        byte b10 = (byte)i9;
        //int i10 = 10.0;
        //float f = 10.0;
        char c4 = (int)1;
        double d5 = 123;
        int i4 = 123;

        byte b = 127;
        b+= 13;
        System.out.println(b);

        float f10 = 123.0F;
        f10+= 2L;

        float f11 = 123.0F + 5;
        float f12 = 123000000000000000000000F + 123000000000000000000000000000000000000F;
        double d13 = 123F + 123F;
        int division1 = 5/2;
        byte division2 = ((int)5)*((int)2);
        short division3 = ((byte)5)/((byte)2);
        byte b34 = ((byte)1230)-12;
        byte b35 = 128 -5;
        //byte f345 = 1200/5;
        //System.out.println(f345);

        int i, j, k;
        i = j = k = 9;
        System.out.println(i);

    }
}
