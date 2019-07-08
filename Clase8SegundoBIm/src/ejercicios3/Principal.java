/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3;

/**
 *
 * @author fjsaca2001
 */
public class Principal {

    public static void main(String[] args) {
        // llamada al metodo
        int potencia = Potencia.get_potencia(2, 4);
        // presentacion del retorno
        System.out.printf("La potencia es: %d", potencia);
    }
}
