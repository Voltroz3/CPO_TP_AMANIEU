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
        // Cr�ez une cellule lumineuse par d�faut (�teinte)
        CelluleLumineuse cellule1 = new CelluleLumineuse();

        // Affichez l'�tat initial
        System.out.println("�tat de la cellule 1 (par d�faut) : " + cellule1.getEtat());

        // Allumez la cellule
        cellule1.allumer();
        System.out.println("�tat de la cellule 1 (apr�s allumage) : " + cellule1.getEtat());

        // �teignez la cellule
        cellule1.eteindre();
        System.out.println("�tat de la cellule 1 (apr�s extinction) : " + cellule1.getEtat());

        // Cr�ez une deuxi�me cellule lumineuse (allum�e)
        CelluleLumineuse cellule2 = new CelluleLumineuse();

        // Allumez la deuxi�me cellule
        cellule2.allumer();
        System.out.println("�tat de la cellule 2 (allum�e) : " + cellule2.getEtat());
      // Cr�ez une nouvelle grille de cellules avec 3 lignes et 4 colonnes
        GrilleDeCellules grille = new GrilleDeCellules(4, 4);

        System.out.println("Grille initiale :");
        System.out.println(grille);

        grille.activerLigneDeCellules(1);
        System.out.println("Grille apr�s activation de la ligne 1 :");
        System.out.println(grille);

        grille.activerColonneDeCellules(2);
        System.out.println("Grille apr�s activation de la colonne 2 :");
        System.out.println(grille);

        grille.activerDiagonaleDescendante();
        System.out.println("Grille apr�s activation de la diagonale descendante :");
        System.out.println(grille);

        grille.activerDiagonaleMontante();
        System.out.println("Grille apr�s activation de la diagonale montante :");
        System.out.println(grille);

        grille.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println("Grille apr�s activation al�atoire :");
        System.out.println(grille);

        grille.melangerMatriceAleatoirement(5);
        System.out.println("Grille apr�s m�lange al�atoire (5 tours) :");
        System.out.println(grille);
    }
    
    
    }

   
    

