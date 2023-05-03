/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejer1.servicio;

import entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class Servicio {
    //a) Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria crearCuenta () {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de cuenta");
        int NumeroCuenta = leer.nextInt();
        System.out.println("Ingrese el DNI");
        long DniCliente = leer.nextLong();
        System.out.println("Ingrese el saldo actual");
        double SaldoActual = leer.nextDouble();
        return new CuentaBancaria(NumeroCuenta,DniCliente,SaldoActual);
    }
    
    //b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
//se le sumará al saldo actual.
    public void ingresar (CuentaBancaria p1,double importe) {
      p1.setSaldoActual(p1.getSaldoActual()+importe);
    }
    /*c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.*/
    public void retirar(CuentaBancaria p1, double importe) {
        if (p1.getSaldoActual()>=importe) {
            p1.setSaldoActual(p1.getSaldoActual()-importe);
        } else {
            System.out.println("Saldo Insuficiente. Se pudo retirar " + p1.getSaldoActual());
            p1.setSaldoActual(0);
        }           
    }
    /*d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.*/
    public void extraccionRapida(CuentaBancaria p1, double importe) {
        if ((p1.getSaldoActual()*0.2)>=importe) {
            p1.setSaldoActual(p1.getSaldoActual()-importe);
        } else {
            System.out.println("Usted quiere retirar mas del 20% de su saldo");
            System.out.println("El limite a retirar es " + p1.getSaldoActual()*0.2);
            p1.setSaldoActual(p1.getSaldoActual()*0.8);
        }           
    }
   /*e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta. */
    public void consultarSaldo(CuentaBancaria p1) {
        System.out.println("Su saldo es " + p1.getSaldoActual());
    }
  /*f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.  */
    public void consultarDatos(CuentaBancaria p1) {
        System.out.println(p1.toString());
    }
}



