package com.aledesma.basics.privacidadobjetosvariablesderef;


//Aqui podemos observar que si se vuelve privada solamente la variable de referencia, pero no el objeto
public class Prueba {

    public static void main(String[] args) {
        PruebaRegresandoObjeto objetox = new PruebaRegresandoObjeto();

        String datoLocal = objetox.getDatoString();

        String datoLocal2 = objetox.getDatoString();

        if(datoLocal2==datoLocal)
            System.out.println("Si son iguales");
    }
}
