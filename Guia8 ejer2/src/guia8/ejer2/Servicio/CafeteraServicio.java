/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejer2.Servicio;

import guia8.ejer2.Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class CafeteraServicio {
    public  Cafetera crearCafetera() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la capacidad maxima de la cafetera");
        int capacidadMaxima = leer.nextInt();
        System.out.println("Ingrese la cantidad actual de la cafetera");
        int cantidadActual = leer.nextInt();
        return new Cafetera(capacidadMaxima,cantidadActual);
    }
    //a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
//capacidad máxima.
    public void llenarCafetera(Cafetera x1) {
        x1.setCantidadActual(x1.getCapacidadMaxima());
        System.out.println("Se lleno la cafetera. La capacidad es de "+ x1.getCapacidadMaxima());
    }
    /*b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.*/
    public void servirTaza(Cafetera x1,int taza) {
        if (x1.getCantidadActual()<taza) {
            System.out.println("Cafe insuficiente");
            System.out.println("La taza quedo con una capacidad de " + x1.getCantidadActual() + " ml de cafe");
            x1.setCantidadActual(0);
        } else {
            x1.setCantidadActual(x1.getCantidadActual()-taza);
            System.out.println("La taza se lleno correctamente. Quedan " + x1.getCantidadActual() + " gramos de cafe");
        }
        
    }  
    //c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
     public void vaciarCafetera(Cafetera x1) {
        x1.setCantidadActual(0);
         System.out.println("Se ha vaciado la cafetera");
    }
   /* d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.*/
     public void agregarCafe(Cafetera x1,int cafe) {
        if (cafe>(x1.getCapacidadMaxima()-x1.getCantidadActual())) {
            System.out.println("Cantidad de cafe superior al necesario");
            System.out.println("La cafetera llego a su capacidad maxima con " + (x1.getCapacidadMaxima()-x1.getCantidadActual()) + " ml de cafe");
            x1.setCantidadActual(x1.getCapacidadMaxima());
        } else {
            x1.setCantidadActual(x1.getCantidadActual()+cafe);
            System.out.println("Se agregaron los " + cafe + "ml de cafe");
        }
        
    }  
    
}
/*public class CafeteraServicios {
    
    public Cafetera crearCafetera(){
        int capacidadMaxima = 1000;
        int cantidadActual = 500;
        return new Cafetera(capacidadMaxima,cantidadActual);
    }
    
    public void llenarCafetera(Cafetera x1){
        x1.setCantidadActual(x1.getCapacidadMaxima());
        System.out.println("Se llenó la cafetera.");
        System.out.println("Cantidad de café en la cafetera: " + x1.getCantidadActual() + " ml.");
    }
    
    public void servirTaza(Cafetera x1, int taza){
        if (x1.getCantidadActual() < taza) {
            System.out.println("La cantidad de café en la cafetera no alcanza para llenar la taza.");
            System.out.println("La taza contiene " + x1.getCantidadActual() + "ml de café.");
            x1.setCantidadActual(0);
            System.out.println("Cantidad de café en la cafetera: " + x1.getCantidadActual() + " ml.");
        } else {
            System.out.println("La taza se llenó correctamente.");
            x1.setCantidadActual(x1.getCantidadActual()-taza);
            System.out.println("Cantidad de café en la cafetera: " + x1.getCantidadActual() + " ml.");
        }
    }
    
    public void vaciarCafetera(Cafetera x1){
        x1.setCantidadActual(0);
        System.out.println("Se vació la cafetera.");
        System.out.println("Cantidad de café en la cafetera: " + x1.getCantidadActual() + " ml.");
    }
    
    public void agregarCafe(Cafetera x1, int cantidad){
        if ((x1.getCantidadActual()+cantidad) > x1.getCapacidadMaxima()) {
            System.out.println("La cantidad ingresada sobrepasa el máximo de la cafetera.");
        } else {
            x1.setCantidadActual(x1.getCantidadActual()+cantidad);
            System.out.println("Se agregó " + cantidad + " ml a la cafetera.");
            System.out.println("Cantidad de café en la cafetera: " + x1.getCantidadActual() + " ml.");
        }
        
    }

}*/