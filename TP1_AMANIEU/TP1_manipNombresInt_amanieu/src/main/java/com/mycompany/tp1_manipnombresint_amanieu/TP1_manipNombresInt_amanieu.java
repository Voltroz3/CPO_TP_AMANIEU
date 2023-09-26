/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_manipnombresint_amanieu;

import java.util.Scanner;

/**
 *
 * 
 */
public class TP1_manipNombresInt_amanieu {

    public static void main(String[] args) {  Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int entier1 = scanner.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int entier2 = scanner.nextInt();

        System.out.println("Vous avez saisi le premier entier : " + entier1);
        System.out.println("Vous avez saisi le deuxième entier : " + entier2);

        int somme = entier1 + entier2;
        int difference = entier1 - entier2;
        int produit = entier1 * entier2;
        int quotient = entier1 / entier2;
        int reste = entier1 % entier2;

        System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La différence des deux nombres est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);
        System.out.println("Le quotient de la division est : " + quotient);
        System.out.println("Le reste de la division est : " + reste);

        scanner.close();
    }
}











    
