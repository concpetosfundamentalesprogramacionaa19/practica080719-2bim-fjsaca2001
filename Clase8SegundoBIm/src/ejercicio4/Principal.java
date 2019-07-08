/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author fjsaca2001
 */
public class Principal {
    public static void main(String[] args) {
        // declaracion de variables
        int [] arreglo2 = {10, 20, 30, 1, 2, 3, 40, 4};
        int tamanioarreglo = arreglo2.length;
        // llamada al metodo con recursividad
        int valor = TamanioArreglo.obtenerTamanioArreglo(arreglo2, tamanioarreglo);
        // Presentacion del primer valor
        System.out.printf("El tamaño con recursividad es: %d", valor);
        // llamada al metodo con ciclo repetitivo
        int valor2 = TamanioArreglo.obtenerTamaniodos(arreglo2);
        // Presentacion de  valores
        System.out.printf("\nEl tamaño con el ciclo es: %d", valor2);
    }
}
