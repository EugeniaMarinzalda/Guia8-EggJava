/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejer6extra;


import guia8.ejer6extra.Servicio.ServicioAscensor;
import guia8.ejer6extra.entidades.Ascensor;
import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class Guia8Ejer6extra {

    /**6) Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
Crea un constructor para inicializar los valores de las propiedades.
Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual" si aún no se ha alcanzado el "maximoPisos".
Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" si no se ha alcanzado el piso "0".
Crea un método "irA" que reciba como parámetro el número de piso al que se desea ir y que modifique la propiedad "pisoActual" para que tenga ese valor.
Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. Simula el comportamiento del ascensor moviéndolo hacia arriba y hacia abajo, yendo a un piso específico, y mostrando en pantalla el piso actual después de cada movimiento.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioAscensor s = new ServicioAscensor();
        Ascensor p = new Ascensor();
        System.out.println("Bienvenido al Ascensor");
        int op;
        do {
            System.out.println("Menú");
            System.out.println("1.Subir");
            System.out.println("2.Bajar");
            System.out.println("3.Ir a");
            System.out.println("4.Cerrar puerta");
            op =leer.nextInt();
          switch (op) {
            case 1:
                s.subir(p);
                break;
            case 2:
                s.bajar(p);
                break;
            case 3:
                s.irA(p);
                break;
            case 4:
                System.out.println("Gracias por usar el ascensor");
                break;
            default:
                System.out.println("opcion incorrecta");;
        }  
        } while (op!=4);
    }
    
}
