/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_guessmynumber_amanieu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 
 */
public class TP1_guessMyNumber_AMANIEU {

    public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        System.out.println("Choisissez le niveau de difficulté :");
        System.out.println("1. Facile (10 tentatives, entre 0 et 100)");
        System.out.println("2. Normal (7 tentatives, entre 0 et 100)");
        System.out.println("3. Difficile (5 tentatives, entre 0 et 100)");
        System.out.print("Entrez le numéro du niveau de difficulté : ");
        
        int niveau = scanner.nextInt();
        int nombreTentatives;
        
        switch (niveau) {
            case 1:
                nombreTentatives = 10;
                break;
            case 2:
                nombreTentatives = 7;
                break;
            case 3:
                nombreTentatives = 5;
                break;
            default:
                System.out.println("Niveau de difficulté invalide. Sélectionnez un niveau entre 1 et 3.");
                return;
        }

        int nombreAleatoire = generateurAleat.nextInt(101); // Génère un nombre entre 0 (inclus) et 100 (inclus)
        int tentative = 0;

        System.out.println("Devinez le nombre entre 0 et 100.");

        while (tentative < nombreTentatives) {
            System.out.print("Tentative " + (tentative + 1) + " sur " + nombreTentatives + ". Entrez votre réponse : ");
            int reponse = scanner.nextInt();
            tentative++;

            if (reponse < nombreAleatoire) {
                System.out.println("Trop petit !");
                if (Math.abs(reponse - nombreAleatoire) > 20) {
                    System.out.println("Vraiment trop petit !");
                }
            } else if (reponse > nombreAleatoire) {
                System.out.println("Trop grand !");
                if (Math.abs(reponse - nombreAleatoire) > 20) {
                    System.out.println("Vraiment trop grand !");
                }
            } else {
                System.out.println("Gagné ! Le nombre était " + nombreAleatoire);
                System.out.println("Nombre de tentatives utilisées : " + tentative);
                break;
            }
        }

        if (tentative == nombreTentatives) {
            System.out.println("Désolé, vous avez épuisé toutes vos tentatives. Le nombre était " + nombreAleatoire);
        }

        scanner.close();
    }
}








