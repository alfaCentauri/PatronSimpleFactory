package com.company;

/**
 * Pizza.java es la abstracción del objeto.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public class Pizza {
    private int cantidadRebanadas;
    private String tipoPizza;

    public Pizza(int cantidadRebanadas, String tipoPizza){
        this.cantidadRebanadas = cantidadRebanadas;
        this.tipoPizza = tipoPizza;
    }

    public String toString(){
        return "Cantidad de rebanadas: " + this.cantidadRebanadas + ". Especialidad: " + this.tipoPizza + "\n";
    }
}
