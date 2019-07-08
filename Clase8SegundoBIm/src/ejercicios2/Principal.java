/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios2;

/**
 *
 * @author fjsaca2001
 */
public class Principal {

    public static void main(String[] args) {
        // llamada a los metodos
        int suma = Sumanumeros.obtenerSumauno(5);
        int suma2 = Sumanumeros.obtenerSumaDos(5);
        // presentacion de los datos
        System.out.printf("La suma es: %d", suma);
        System.out.printf("\nLa suma dos es: %d", suma2);
    }
}
