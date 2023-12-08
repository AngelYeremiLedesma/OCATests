package com.aledesma.basics.privacidadobjetosvariablesderef;

public class PruebaRegresandoObjeto {

    private String datoString = "string";

    public String getDatoString(){
        return new String(datoString);
    }
}
