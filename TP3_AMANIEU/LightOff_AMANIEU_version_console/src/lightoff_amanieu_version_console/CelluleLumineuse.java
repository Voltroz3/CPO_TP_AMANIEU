package lightoff_amanieu_version_console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thibault
 */
public class CelluleLumineuse {
    // Enumération pour représenter l'état de la cellule lumineuse
    public enum Etat {
         O, X
    }

    private Etat etat; // état actuel de la cellule lumineuse

    /**
     * Par défaut, la cellule lumineuse est éteinte Ã  sa création
     */
    public CelluleLumineuse() {
        etat = Etat.X;
    }

    /**
     *Cette méthode permet d'obtenir l'état actuel de la cellule lumineuse. Elle renvoie une valeur de l'enumeration Etat, qui peut Ãªtre "ALLUMEE" ou "ETEINTE"
     * @return etat: ALLUMER ou ETEINT
     */
    public Etat getEtat() {
        return etat;
    }

    /**
     *Cette methode permet de changer l'etat de la cellule lumineuse en "alllum"
     */
    public void allumer() {
        etat = Etat.O;
    }

    /**
     *Cette méthode permet de changer l'Ã©tat de la cellule lumineuse en "éteinte"
     */
    public void eteindre() {
        etat = Etat.X;
    }
}


