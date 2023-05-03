/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.teorico;

import entidades.Persona;
import guia8.teorico.servicio.Servicio;

/**
 *Crea un método void que reciba un objeto tipo persona como parámetro y
utilice el get para mostrar sus atributos. Llama ese método desde el main.
 * @author EUGE
 */
public class GUIA8Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servicio c1 = new Servicio();
        Persona p1 = c1.cargarPersona();
        //System.out.println(p1.toString());
        c1.mostrarPersona(p1);

    }
    
}
