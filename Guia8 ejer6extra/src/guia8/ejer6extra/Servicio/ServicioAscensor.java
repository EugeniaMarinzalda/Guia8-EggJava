/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejer6extra.Servicio;



import guia8.ejer6extra.entidades.Ascensor;
import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class ServicioAscensor {
    Scanner leer = new Scanner(System.in);
    /*NO LO HAGO, SE CARGO EL MAXIMO 10 Y ACTUAL 0 - public Ascensor crearAscensor (Ascensor p){
        System.out.println("Ingrese el piso actual del ascensor");
        int pa = leer.nextInt();
        System.out.println("Ingrese la cantidad de pisos");
        int pt = leer.nextInt();
        return new Ascensor(pa,pt);
    }*/
    //Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual" si aún no se ha alcanzado el "maximoPisos".
    public void subir(Ascensor p){
        int subirPiso = p.getPisoActual()+1;
        if (subirPiso>p.getMaximoPisos()) {
            System.out.println("Usted se encuentra en el ultimo piso");
        } else {
            p.setPisoActual(subirPiso);
            System.out.println("Usted ha subido al piso " + p.getPisoActual());
        }
    }
    //Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" si no se ha alcanzado el piso "0".
   public void bajar(Ascensor p){
        int bajarPiso = p.getPisoActual()-1;
        if (bajarPiso<0) {
            System.out.println("Usted se encuentra en planta baja");
        } else {
            p.setPisoActual(bajarPiso);
            System.out.println("Usted ha bajado al piso " + p.getPisoActual());
        }
    } 
   //Crea un método "irA" que reciba como parámetro el número de piso al que se desea ir y que modifique la propiedad "pisoActual" para que tenga ese valor.
   public void irA(Ascensor p){
       System.out.println("Ingrese el piso");
       int piso = leer.nextInt();
       if (piso<p.getMaximoPisos() && piso>0 ) {
           p.setPisoActual(piso);
           System.out.println("Usted esta en el piso :" + p.getPisoActual());
       } else {
           System.out.println("Piso invalido");
       }
   }
}
