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
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese una contraseña: ");
        String contraseña = sc.nextLine();
        
        int mayus = 0;
        int minus = 0;
        int number = 0;
        int special = 0;
        
        if (contraseña.length() >= 8) {
            for (int i = 0; i < contraseña.length(); i++) {
                if (contraseña.charAt(i) >= 65 && contraseña.charAt(i) <= 90) {
                    mayus += 1;
                }
                if (contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122) {
                    minus += 1;
                }
                if (contraseña.charAt(i) >= 48 && contraseña.charAt(i) <= 57) {
                    number += 1;
                }
                if (contraseña.charAt(i) == 33 || contraseña.charAt(i) == 64 || contraseña.charAt(i) == 35 || contraseña.charAt(i) == 36 || contraseña.charAt(i) == 37 || contraseña.charAt(i) == 94 || contraseña.charAt(i) == 38 || contraseña.charAt(i) == 42) {
                    special += 1;
                }
                
            }
            if (mayus >= 1 && minus >= 1 && number >= 1 && special >=1) {
                System.out.println("Contraseña valida.");
            } else {
                System.out.println("Contraseña no valida, la contraseña debe tener al menos una letra mayúscula, una letra minúscula, un número y uno de los siguientes caracteres especiales (!, @, #, $, %, ^, &, *).");
            }
        } else {
            System.out.println("Contraseña no valida, la contraseña debe tener mínimo 8 caracteres.");
        }
    }
    
}
