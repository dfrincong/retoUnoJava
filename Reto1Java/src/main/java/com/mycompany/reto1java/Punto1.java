/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reto1java;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número positivo: ");
        int n = sc.nextInt();
        
        int contador = 0;
        
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
            } else {
                if (i % 3 == 0 || i % 5 == 0) {
                contador += i;
                }
            }
            
        }
        System.out.println("la suma es igual a: " + contador);
        
    }
    
}
