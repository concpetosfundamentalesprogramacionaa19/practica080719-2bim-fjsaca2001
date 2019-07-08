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
public class Potencia {

    public static int get_potencia(int base, int exponente) {
        // condicional para el uso de la recursivadad
        if (exponente == 1) {
            // fin de la recursivadad
            return base;
        } else {
            // retorno de la recursividad
            return base * get_potencia(base, exponente - 1);
        }
    }
}
