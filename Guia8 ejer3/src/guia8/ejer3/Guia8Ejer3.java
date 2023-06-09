/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejer3;

import guia8.ejer3.entidades.Persona;
import guia8.ejer3.servicio.ServicioPersona;

/**
 *Realizar una clase llamada Persona en el paquete de entidades que
tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro
atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje
* Realizar una clase llamada Persona en el paquete de entidades que
tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro
atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
 * @author EUGE
 */
public class Guia8Ejer3 {

    /**
     * 

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona s = new ServicioPersona();
        
    /*Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad. */
    
        Persona p1 = s.crearPersona();
        Persona p2 = s.crearPersona();
        Persona p3 = s.crearPersona();
        Persona p4 = s.crearPersona();
        /*Persona p1 = new Persona("Matias",38,"H",100,1.70);
        Persona p2 = new Persona("Sebatian",25,"O",60,1.56);
        Persona p3 = new Persona("María",15,"M",45,1.40);
        Persona p4 = new Persona("Soledad",8,"M",30,1.65);*/
        //genero los vectores
        int IMCGral [] = new int [4];
        boolean mayores [] = new boolean [4];
        //Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
        IMCGral[0]= s.calcularIMC(p1);
        IMCGral[1]= s.calcularIMC(p2);
        IMCGral[2]= s.calcularIMC(p3);
        IMCGral[3]= s.calcularIMC(p4);
        s.porcentajePeso(IMCGral);
        /*para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima,*/
        mayores[0] = s.esMayorDeEdad(p1);
        mayores[1] = s.esMayorDeEdad(p2);
        mayores[2] = s.esMayorDeEdad(p3);
        mayores[3] = s.esMayorDeEdad(p4);
        s.porcentajeMayores(mayores);
    }    
}    
    