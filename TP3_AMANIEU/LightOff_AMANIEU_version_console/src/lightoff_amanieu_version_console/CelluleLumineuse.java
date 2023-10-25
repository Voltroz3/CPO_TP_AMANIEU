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
        ALLUMEE, ETEINTE
    }

    private Etat etat; // État actuel de la cellule lumineuse

    public CelluleLumineuse() {
        // Par défaut, la cellule lumineuse est éteinte à sa création
        etat = Etat.ETEINTE;
    }

    /**
     *Cette méthode permet d'obtenir l'état actuel de la cellule lumineuse. Elle renvoie une valeur de l'énumération Etat, qui peut être "ALLUMEE" ou "ETEINTE"
     * @return etat: ALLUMER ou ETEINT
     */
    public Etat getEtat() {
        return etat;
    }

    /**
     *Cette méthode permet de changer l'état de la cellule lumineuse en "alllumé"
     */
    public void allumer() {
        etat = Etat.ALLUMEE;
    }

    /**
     *Cette méthode permet de changer l'état de la cellule lumineuse en "éteinte"
     */
    public void eteindre() {
        etat = Etat.ETEINTE;
    }
}


