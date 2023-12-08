package com.aledesma.herencia;

class Alpha {
    String getType() {
        return "alpha";
    }
}

class Beta extends Alpha {
    String getType() {
        return "beta";
    }
}

class Gamma extends Beta {
    String getType() {
        return "gamma";
    }

    public static void main(String[] args) {
        Gamma g1 = (Gamma) new Alpha();
        Gamma g2 = (Gamma) new Beta();
        System.out.print(g1.getType() + " " + g2.getType());
    }
}


