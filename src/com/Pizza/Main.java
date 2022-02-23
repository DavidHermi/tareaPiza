package com.Pizza;

public class Main {

    public static void main(String[] args) {
        // utilizamos el builder y en concreto el metodo build
        // para tener nuestra pizza
        Pizza creadaConBuilder = new BuildersPizzas().build();
        Pizza sintaxisEncadenada = new BuildersPizzas()
                .setCebolla(true)
                .setSize(Pizza.BIG)
                .build();

        // aunque el toSpring no está definida, nos valen estas lineas para poner
        // un punto de ruptura y hacer debug
        // asi podemos ver los objetos creados
        System.out.println(creadaConBuilder.toString());
        System.out.println(sintaxisEncadenada.toString());
    }
}
