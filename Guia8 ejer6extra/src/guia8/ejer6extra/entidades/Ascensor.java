/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejer6extra.entidades;

/**
 *Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
 * @author EUGE
 */
public class Ascensor {
    //Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10.
    private int pisoActual=0;
    private int maximoPisos = 10;

    public Ascensor() {
    }

    public Ascensor(int pisoActual, int maximoPisos) {
        this.pisoActual = pisoActual;
        this.maximoPisos = maximoPisos;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public int getMaximoPisos() {
        return maximoPisos;
    }

    public void setMaximoPisos(int maximoPisos) {
        this.maximoPisos = maximoPisos;
    }
    
}
