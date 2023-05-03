/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejer1extra.entidades;

/**Vamos a realizar una clase llamada Raices, donde representaremos los
valores de una ecuación de 2º grado. Tendremos los 3 coeficientes
como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores
para construir el objeto a través de un método constructor.
 *
 * @author EUGE
 */
public class Raices {
    private double a,b,c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Raices() {
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
}
