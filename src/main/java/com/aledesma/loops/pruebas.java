package com.aledesma.loops;
//for es palabra reservada, desde antes de iniciar el for si checa

public class pruebas{
    public static void main(String[] args){
        int i = 0, j = 5;
        lab1 : for( ; ; i++){
            for( ; ; --j)  if( i >j ) break lab1;
        }
        System.out.println(" i = "+i+", j = "+j);
    }
}

