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
public class TamanioArreglo {
    // metodo usando la recursividad
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        // condicional para la recursividad
        if (tamanio == 1) {
            // retorno del valor
            return arreglo2[0];
        } else {
            // retorno del valor 
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2, tamanio - 1 ); 
        }    
    }
    // metodo usado con ciclo repetitivo
    public static int obtenerTamaniodos(int arreglo2[]){
        // declaracion de variables
        int valor = 0;
        // ciclo repetitivo para la sima de los valores
        for (int i = 0; i < arreglo2.length; i++) {
            // suma iterativa
            valor += arreglo2[i];
        }
        // retorno del valor 
        return valor;
    }
}
