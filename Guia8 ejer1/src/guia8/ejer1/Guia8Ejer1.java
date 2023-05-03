/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejer1;

import entidades.CuentaBancaria;
import guia8.ejer1.servicio.Servicio;
import java.util.Scanner;

/**
 *Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
2
 * @author EUGE
 */
public class Guia8Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio c1 = new Servicio();  
        CuentaBancaria p1 = c1.crearCuenta();  
        boolean salir = true;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Menu \n 1- Ingresar dinero \n 2- Retirar dinero \n 3- Extracción rapida \n 4- Consultar Saldo \n 5- Consultar Datos \n 6- Salir");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el importe a depositar");
                    double impDep = leer.nextDouble();
                    c1.ingresar(p1,impDep);
                    break;
                case 2:
                    System.out.println("Ingrese el importe a retirar");
                    double impRet = leer.nextDouble();
                    c1.retirar(p1,impRet);
                    break;
                case 3:
                    System.out.println("Ingrese el importe a extraer");
                    double impExtRap = leer.nextDouble();
                    c1.extraccionRapida(p1,impExtRap);
                    break;
                case 4:
                    c1.consultarSaldo(p1);
                    break;
                case 5:
                    c1.consultarDatos(p1);
                    break;
                case 6:
                    salir=false;
                    break;   
                default:
                    System.out.println("Opcion no valida");
            }
        }while (salir);
        
    }
}
