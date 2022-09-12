package com.company;

public class Pizzeria {
    /**
     * El origen de los objetos puede ser una nueva instacia o una BD, un archivo, una API, ...
     * */
    public Pizza crearPizzaChica(){
        return new Pizza(4, "Napolitana");
    }
    /**
     * El origen de los objetos en una nueva instanciación.
     * */
    public Pizza crearPizzaMediana(){
        return new Pizza(8, "Napolitana");
    }

    public Pizza crearPizzaGrande(){
        return new Pizza(12, "Napolitana");
    }
}
