/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejer2;

import guia8.ejer2.Entidades.Cafetera;
import guia8.ejer2.Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters. Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.
 * @author EUGE
 */
public class Guia8Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c = cs.crearCafetera();
        
        boolean salir = true;
        do {
            System.out.println("Menu");
            System.out.println("1 - Llenar cafetera");
            System.out.println("2 - Servir Taza");
            System.out.println("3 - Vaciar cafetera");
            System.out.println("4 - Agregar cafe");
            System.out.println("5 - Salir");
            int opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    cs.llenarCafetera(c);
                    break;
                case 2:    
                    System.out.println("Ingrese la capacidad de la taza");
                    int cap = leer.nextInt();
                    cs.servirTaza(c, cap);
                    break;
                case 3:
                    cs.vaciarCafetera(c);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cafe que quiere agregar");
                    int caf = leer.nextInt();
                    cs.agregarCafe(c, caf);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el servicio");
                    salir=false;
                    break;
            }
                        
        } while (salir);
        
    
    
    }
}
/* public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       CafeteraServicios cs = new CafeteraServicios();
       Cafetera c = cs.crearCafetera();
       String salir;
       
        do {
            System.out.println("1 - Llenar cafetera");
       System.out.println("2 - Servir taza");
       System.out.println("3 - Vaciar cafetera");
       System.out.println("4 - Agregar café");
       System.out.println("Ingrese una opción.");
       int op = leer.nextInt();
       
       switch (op) {
           case 1:
               cs.llenarCafetera(c);
               break;
           case 2:
               System.out.println("Ingrese la capacidad de la taza.");
               int taza = leer.nextInt();
               cs.servirTaza(c, taza);
               break;
           case 3:
               cs.vaciarCafetera(c);
               break;
           case 4:
               System.out.println("Ingrese la cantidad de café que desea agregar.");
               int cantidad = leer.nextInt();
               cs.agregarCafe(c, cantidad);
               break;
       }
       System.out.println("¿Desea salir? S/N");
       salir = leer.next();
    } while (!salir.equalsIgnoreCase("s"));
  }
}*/