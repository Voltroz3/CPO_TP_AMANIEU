/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_amanieu_version_console;

/**
 *
 * @author Thibault
 */
public class LightOff_AMANIEU_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // Créez une cellule lumineuse par défaut (éteinte)
        CelluleLumineuse cellule1 = new CelluleLumineuse();

        // Affichez l'état initial
        System.out.println("État de la cellule 1 (par défaut) : " + cellule1.getEtat());

        // Allumez la cellule
        cellule1.allumer();
        System.out.println("État de la cellule 1 (après allumage) : " + cellule1.getEtat());

        // Éteignez la cellule
        cellule1.eteindre();
        System.out.println("État de la cellule 1 (après extinction) : " + cellule1.getEtat());

        // Créez une deuxième cellule lumineuse (allumée)
        CelluleLumineuse cellule2 = new CelluleLumineuse();

        // Allumez la deuxième cellule
        cellule2.allumer();
        System.out.println("État de la cellule 2 (allumée) : " + cellule2.getEtat());
      // Créez une nouvelle grille de cellules avec 3 lignes et 4 colonnes
        GrilleDeCellules grille = new GrilleDeCellules(4, 4);

        System.out.println("Grille initiale :");
        System.out.println(grille);

        grille.activerLigneDeCellules(1);
        System.out.println("Grille après activation de la ligne 1 :");
        System.out.println(grille);

        grille.activerColonneDeCellules(2);
        System.out.println("Grille après activation de la colonne 2 :");
        System.out.println(grille);

        grille.activerDiagonaleDescendante();
        System.out.println("Grille après activation de la diagonale descendante :");
        System.out.println(grille);

        grille.activerDiagonaleMontante();
        System.out.println("Grille après activation de la diagonale montante :");
        System.out.println(grille);

        grille.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println("Grille après activation aléatoire :");
        System.out.println(grille);

        grille.melangerMatriceAleatoirement(5);
        System.out.println("Grille après mélange aléatoire (5 tours) :");
        System.out.println(grille);
    }
    
    
    }

   
    

