/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejer1extra.servicio;

import guia8.ejer1extra.entidades.Raices;

/**
 *






Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
el signo delante de -b
2
 * @author EUGE
 */
public class RaicesServicio {
 //Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:   
 /*a) Método getDiscriminante(): devuelve el valor del discriminante
(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c*/   
    public double getDiscriminante(Raices raiz){
        double discriminante = Math.pow(raiz.getB(),2)-(4*raiz.getA()*raiz.getC());
        return discriminante;
    }
    /*
    b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o
igual que 0.
    */
    public boolean tieneRaices(Raices raiz){
        if (getDiscriminante(raiz) > 0) {
            System.out.println("Tiene dos raices");
            return true;
        } else {
            return false;
        }
    }
    /*
    c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.
    */
    public boolean tieneRaiz(Raices raiz){
        
        return (getDiscriminante(raiz) == 0);
    }
    /*
    d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
imprime las 2 posibles soluciones.
    */
    public void obtenerRaices(Raices raiz){
        if (tieneRaices(raiz)==true) {
            double raiz1 = (-raiz.getB()+Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA());
            System.out.println("Raiz 1 : " + raiz1 );
            double raiz2 = (-raiz.getB()-Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA());
            System.out.println("Raiz 2 : " + raiz2 );
            
        }
    }
    /*e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
una única raíz. Es en el caso en que se tenga una única solución
posible.*/
    public void obtenerRaiz(Raices raiz){
        if (tieneRaiz(raiz)==true) {
            double raizU = (-raiz.getB()+Math.sqrt(getDiscriminante(raiz)))/(2*raiz.getA());
            System.out.println("Raiz Unica : " + raizU );
            //ejemplo -4,12,-9 bascara da el mismo resultado por eso es una sola raiz
            
        }
    }
    /*f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros métodos y en caso de no existir solución, se
mostrará un mensaje.*/
    public void calcular(Raices raiz){
        if (tieneRaices(raiz)==true){
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)==true) {
            obtenerRaiz(raiz);
        } else {
            System.out.println("No tiene solución");
        }
            
    }
}
