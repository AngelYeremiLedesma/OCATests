package com.aledesma.constructores;

import java.util.HashMap;

public class Sobrecargas {


    void recibe(int i){

    }

    void recibe(char i){

    }

    void Sobrecargas(){//esto no es un constructor, pero si deja

    }

    public static void main(String[] args) {
        final Sobrecargas s = new Sobrecargas(); //sise puede usar final en variables locales tambien
        s.recibe('5');
        s.recibe(5);
    }
}
