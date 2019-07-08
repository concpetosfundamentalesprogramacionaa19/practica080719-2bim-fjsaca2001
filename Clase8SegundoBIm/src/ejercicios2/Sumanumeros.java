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
public class Sumanumeros {
    // metodo usado para la recursividad
    public static int obtenerSumauno(int x){
        // dclaracion de variable
        int suma = 0;
        // ciclo usado para la suma continua
        for (int i = 1; i <= x; i++) {
            suma += i;
        }
        // retorno del resultado
        return suma;
    }
    public static int obtenerSumaDos(int valor){
        // comparacion del valor
        if (valor <= 0) {
            // retorno del resultado que es el fin de la recursivadad
            return 0;
        }else{
            //  retorno del resultado recursivo
            return valor + obtenerSumaDos(valor - 1);
        }
    }
}
