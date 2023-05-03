/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejer3.servicio;

import guia8.ejer3.entidades.Persona;
import java.util.Scanner;

/**
 * @author EUGE
 */
public class ServicioPersona {
    
/*
    b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje
    */   
    public Persona crearPersona () {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        boolean hacer = true;
        System.out.println("Ingrese el sexo (H-Hombre, M-Mujer ,O-Otros)");
        String sexo = leer.next();
        while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("o")){
            System.out.println("El sexo debe ser H,M u O. Vuelva a ingresarlo: ");
            sexo = leer.next();
        }
        /*do {
            System.out.println("Ingrese el sexo (H-Hombre, M-Mujer ,O-Otros)");
            sexo = leer.next();
            sexo = sexo.toUpperCase();
            //(!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("o"))
            if (sexo == "H" || sexo== "M" || sexo == "O" ) {
                hacer = false;
            } else {
                System.out.println("Valor incorrecto, intente nuevamente");
            }
        } while (hacer);*/
        System.out.println("Ingrese el peso en kg");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura en centimetros");
        double altura = leer.nextDouble();
        altura = altura/100;
        return new Persona(nombre, edad, sexo, peso, altura);
    }
   //a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano. 
    public boolean esMayorDeEdad(Persona p){
        if (p.getEdad()>=18) {
            System.out.println( p.getNombre() + " es mayor de edad");
            return true;
        } else {
            System.out.println(p.getNombre() + " es menor de edad");
            return false;
        }
    }
/* c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. 
    Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.*/
    public int calcularIMC(Persona p) {
        double IMC = (p.getPeso() / Math.pow(p.getAltura(),2));
        int res;
        if (IMC<20) {
            System.out.println("La persona " + p.getNombre() + " esta debajo de su peso ideal: " + IMC);
            return -1;
        } else if (IMC>=20 && IMC<=25) {
            System.out.println("La persona " + p.getNombre() + " esta en su peso ideal: " + IMC);
            return 0;
        } else {
            System.out.println("La persona " + p.getNombre() + " tiene sobrepeso: " + IMC);
            return 1;
        }
    }
    /* para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.*/
   public void porcentajePeso(int IMCGral[] ) {
       int pesoNormal = 0, sobrepeso =0, insupeso = 0, total = 0; 
        for (int i = 0; i < 4; i++) {
            total++;
            switch (IMCGral[i]) {
                case 0:
                    pesoNormal=pesoNormal+1;
                    break;
                case 1:
                    sobrepeso=sobrepeso+1;
                    break;
                case -1:
                    insupeso=insupeso+1;
                    break;
            }
        }
        System.out.println("El porcentaje de personas con sobrepeso es " + (double)sobrepeso/total*100+ "%");
        System.out.println("El porcentaje de personas con peso insuficiente es " + (double)insupeso/total*100 + "%");
        System.out.println("El porcentaje de personas con peso normal es " + (double) pesoNormal/total*100 + "%");   
    }
    public void porcentajeMayores(boolean mayores[] ) {
        int mayor = 0, menor =0, totalPer = 0; 
        for (int i = 0; i < 4; i++) {
            totalPer++;
            if (mayores[i] == true) {
                mayor++;
            } else {
                menor++;
            }
        }
        System.out.println("El porcentaje de personas mayores de edad es " + (double) mayor/totalPer*100 + "%");
        System.out.println("El porcentaje de personas menores de edad es " + (double) menor/totalPer*100 + "%");
    }
   
   
}
