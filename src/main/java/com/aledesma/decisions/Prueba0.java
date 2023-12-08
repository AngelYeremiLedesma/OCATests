package com.aledesma.decisions;

import java.util.*;

//sout no acepta null
// + no se usa con null
// los booleans requieren explicitamente el false o true, no hay falsy o truthy
public class Prueba0 {

    <T> boolean nombre(){
        return false;
    }

    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();

        //System.out.println(true+null);
        if(8==1){
            char c='a';
            int i;
            i=c;
            c++;
            //c=i;
        }
    }
}
