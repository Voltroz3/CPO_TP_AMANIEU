/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_amanieu_version_console;

import java.util.Scanner;

/**
 *
 * @author Thibault
 */
public class Partie {
    private GrilleDeCellules grille;
    private int tours;

    public Partie(int lignes, int colonnes) {
        grille = new GrilleDeCellules(lignes, colonnes);
        tours = 0;
    }

    public void jouer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu des cellules lumineuses !");

        while (!aGagne() && tours < 20) {
            System.out.println("Tour " + tours);

            System.out.println("État actuel de la grille :");
            System.out.println(grille);

            System.out.println("Veuillez choisir une action :");
            System.out.println("1. Activer une ligne");
            System.out.println("2. Activer une colonne");
            System.out.println("3. Activer une diagonale descendante");
            System.out.println("4. Activer une diagonale montante");
            System.out.println("5. Activer aléatoirement");
            System.out.println("6. Réinitialiser la grille");
            System.out.println("7. Quitter");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrez le numéro de la ligne à activer : ");
                    int ligne = scanner.nextInt();
                    grille.activerLigneDeCellules(ligne);
                    break;
                case 2:
                    System.out.print("Entrez le numéro de la colonne à activer : ");
                    int colonne = scanner.nextInt();
                    grille.activerColonneDeCellules(colonne);
                    break;
                case 3:
                    grille.activerDiagonaleDescendante();
                    break;
                case 4:
                    grille.activerDiagonaleMontante();
                    break;
                case 5:
                    grille.activerLigneColonneOuDiagonaleAleatoire();
                    break;
                case 6:
                    grille.reinitialiserGrille();
                    break;
                case 7:
                    System.out.println("Merci d'avoir joué !");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Action non valide, veuillez choisir une option valide.");
            }

            tours++;
        }

        if (aGagne()) {
            System.out.println("Félicitations ! Vous avez gagné en " + tours + " tours.");
        } else {
            System.out.println("Vous avez atteint la limite de 20 tours. vous avez perdu.");
        }
    }


    private boolean aGagne() {
     
    // Parcourez la grille et vérifiez si une seule cellule n'est pas dans l'état "allumé".
    for (int i = 0; i < grille.matriceCellules.length; i++) {
        for (int j = 0; j < grille.matriceCellules[i].length; j++) {
            if (grille.matriceCellules[i][j].getEtat() != CelluleLumineuse.Etat.O) {
                return false; // Si une seule cellule est  allumée, la partie n'est pas gagnée.
            }
        }
    }
    return true; 
}
}

    

