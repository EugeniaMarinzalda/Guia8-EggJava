/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejer2extra.Servicios;

import guia8.ejer2extra.entidades.NIF;
import java.util.Scanner;

/**
 *En NIFService
se dispondrá de los siguientes métodos:




 * @author EUGE
 */
public class NIFService {
    /*
    b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
letra que le corresponderá. Una vez calculado, le asigna la letra que
le corresponde según La letra correspondiente al dígito verificador se calculará a traves de un
método que funciona de la siguiente manera: Para calcular la letra se
toma el resto de dividir el número de DNI por 23 (el resultado debe ser
un número entre 0 y 22). El método debe buscar en un array (vector) de
caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
    */
    public NIF crearNIF() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el DNI");
        long documento = leer.nextLong(); 
        int indice = (int) documento % 23;
        String vector []= new String [23];
        vector [0] = "T";
        vector [1] = "R";
        vector [2] = "W";
        vector [3] = "A";
        vector [4] = "G";
        vector [5] = "M";
        vector [6] = "Y";
        vector [7] = "F";
        vector [8] = "P";
        vector [9] = "D";
        vector [10] = "X";
        vector [11] = "B";
        vector [12] = "N";
        vector [13] = "J";
        vector [14] = "Z";
        vector [15] = "S";
        vector [16] = "Q";
        vector [17] = "V";
        vector [18] = "H";
        vector [19] = "L";
        vector [20] = "C";
        vector [21] = "K";
        vector [22] = "E";
        String letra = vector[indice];
        return new NIF (documento,letra);
        
    }
    /*c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
guion y la letra en mayúscula; por ejemplo: 00395469-F).*/
    public void mostrar(NIF c) {
        System.out.println("El NIF es : " + c.getDNI() + "-" + c.getLetra() );
    }
}
