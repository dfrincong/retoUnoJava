/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reto1java;

/**
 *
 * @author user
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0, b = 1; // se declaran las variables de tipo entero a con un valor de 0 y b con un valor de 1 para utilizarlas posteriormente en nuevas asignaciones dentro del ciclo for.
        for (int i = 0; i < 10; i++) { // se declara el ciclo for en un rango de 0 a 9 para ejecutar el proceso 10 veces
            System.out.println(a); // Se imprime el valor actual de la variable a para conocer su nuevo valor y después se realiza un salto de línea para que la siguiente impresión se ejecute en la siguiente línea.
            a = b; // se le asigna el valor actual de b a la variable a para igualar el valor de a con el de b
            b = a + b; // se le asigna la suma de (a+b) con los valores actuales de a y b a la variable b para doblar el valor de b y con este valor doblar el valor de la variable a en las siguientes iteraciones 
        }
        System.out.println(); // se imprime una línea vacía al finalizar el ciclo for.
    }
    
}
