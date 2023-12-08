package com.aledesma.tipos;
//tanto parse como valueOf son case insensitive, pero no aceptan espacios,
//parse solo acepta strings relacionarlo con parsel potter as string, regresa un primitivo
//valueof acepta strings y el mismo wrapper exacto, regresa un wrapper
public class PruebaGenerandoTrues {
    public static void main(String[] args) {
        //System.out.println(Integer.valueOf(1L));
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.parseBoolean("     true"));
        System.out.println(Boolean.parseBoolean("true     "));
        System.out.println(Boolean.parseBoolean("    true    "));
        System.out.println(Boolean.parseBoolean("tRUe"));
        //System.out.println(Boolean.parseBoolean(true)); //falla esta
        System.out.println(Boolean.valueOf("true"));
        System.out.println(Boolean.valueOf("     true"));
        System.out.println(Boolean.valueOf("true     "));
        System.out.println(Boolean.valueOf("    true    "));
        System.out.println(Boolean.valueOf("tRUe"));
        System.out.println(Boolean.valueOf(Boolean.TRUE));





    }
}
