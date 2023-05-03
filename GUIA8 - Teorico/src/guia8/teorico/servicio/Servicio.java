/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.teorico.servicio;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class Servicio {
    
    public Persona cargarPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Persona p1 = new Persona();
        System.out.println("Ingrese en nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese la edad");
        int edad= leer.nextInt();
        
        
        //System.out.println(p1.nombre + p1.edad);
        return new Persona(nombre, edad);
    }
    public void mostrarPersona(Persona p1) {
        System.out.println(p1.getNombre());
    }
   
}
