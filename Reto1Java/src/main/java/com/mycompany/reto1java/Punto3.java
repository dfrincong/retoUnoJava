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
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String contraseñaAleatoria = "";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numero = "1234567890";
        String special = "!#$%&/=@";
        
        System.out.print("Ingrese el largo de la contraseña (entre 8 y 16 caracteres): ");
        int largoContraseña = sc.nextInt();
        
        System.out.println("Quiere letras mayúsculas (Responda y para sí o n para no):");
        String resUno = sc.nextLine();
        
        System.out.println("Quiere números (Responda y para sí o n para no):");
        String resDos = sc.nextLine();
        
        System.out.println("Quiere símbolos (Responda y para sí o n para no):");
        String resTres = sc.nextLine();
        
        for (int i = 0; i < largoContraseña; i++) {
            if ((resUno  == "Y" || resUno == "y") && (resDos  == "y" || resDos == "Y") && (resTres  == "y" || resTres == "Y")) {
//                contraseñaAleatoria.charAt(i) == ;
            } else if ((resUno  == "Y" || resUno == "y") && (resDos  == "n" || resDos == "N") && (resTres  == "n" || resTres == "N")) {
//                contraseñaAleatoria.charAt(i) == ;
            }
        }
        
        
        
        
        
        
    }
    
}
