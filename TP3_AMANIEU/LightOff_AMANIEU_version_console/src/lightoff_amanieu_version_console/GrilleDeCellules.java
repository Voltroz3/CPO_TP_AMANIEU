/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_amanieu_version_console;

import java.util.Random;

/**
 *
 * 
 */
public class GrilleDeCellules {
    CelluleLumineuse[][] matriceCellules;

    /**
     *Crée une grille de cellules lumineuses avec le nombre de lignes et de colonnes spécifiées
     * @param lignes
     * @param colonnes
     */
    public GrilleDeCellules(int lignes, int colonnes) {
        matriceCellules = new CelluleLumineuse[lignes][colonnes];

        // Initialisation de chaque cellule de la grille
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     *Génère une représentation textuelle de l'état de la grille de cellules lumineuses
     * @return
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < matriceCellules.length; i++) {
            for (int j = 0; j < matriceCellules[i].length; j++) {
                str.append(matriceCellules[i][j].getEtat());
                if (j < matriceCellules[i].length - 1) {
                    str.append(" ");
                }
            }
            str.append("\n");
        }
        return str.toString();
    }

    /**
     * cette methode parcours la ligne indiqué et passe l'etat de la cellule à "allumé"
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int i = 0; i < matriceCellules[idLigne].length; i++) {
            matriceCellules[idLigne][i].allumer();
        }
    }

    /**
     *cette methode parcours la colonne indiqué et passe l'etat de la cellule à "allumé"
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < matriceCellules.length; i++) {
            matriceCellules[i][idColonne].allumer();
        }
    }

    /**
     *cette methode parcours la diagonale descendante indiqué et passe l'etat de la cellule à "allumé"
     */
    public void activerDiagonaleDescendante() {
        int min = Math.min(matriceCellules.length, matriceCellules[0].length);
        for (int i = 0; i < min; i++) {
            matriceCellules[i][i].allumer();
        }
    }

    /**
     *cette methode parcours la la diagonale montante indiqué et passe l'etat de la cellule à "allumé"
     */
    public void activerDiagonaleMontante() {
        int lignes = matriceCellules.length;
        int colonnes = matriceCellules[0].length;
        int min = Math.min(lignes, colonnes);
        for (int i = 0; i < min; i++) {
            matriceCellules[lignes - 1 - i][i].allumer();
        }
    }

    /**
     *cette methode active un nombre aleatoire entre 1 et 3 puis en fonction du resultat actice une colonne , une ligne ou l'une des diagonale
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(4);

        if (choix == 0) {
            int idLigne = random.nextInt(matriceCellules.length);
            activerLigneDeCellules(idLigne);
        } else if (choix == 1) {
            int idColonne = random.nextInt(matriceCellules[0].length);
            activerColonneDeCellules(idColonne);
        } else if (choix == 2) {
            activerDiagonaleDescendante();
        } else {
            activerDiagonaleMontante();
        }
    }

    /**
     * cette methode effectue un mélange aléatoire de la grille de cellules en effectuant un certain nombre de tours spécifié par la variable nbTours. À chaque tour, il sélectionne aléatoirement l'une des quatre actions possibles et l'applique à la grille
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        Random random = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
            int choix = random.nextInt(4);
            if (choix == 0) {
                int idLigne = random.nextInt(matriceCellules.length);
                activerLigneDeCellules(idLigne);
            } else if (choix == 1) {
                int idColonne = random.nextInt(matriceCellules[0].length);
                activerColonneDeCellules(idColonne);
            } else if (choix == 2) {
                activerDiagonaleDescendante();
            } else {
                activerDiagonaleMontante();
            }
        
        }
    }

    void reinitialiserGrille() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


    

