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
    // Enum�ration pour repr�senter l'�tat de la cellule lumineuse
    public enum Etat {
         O, X
    }

    private Etat etat; // �tat actuel de la cellule lumineuse

    /**
     * Par d�faut, la cellule lumineuse est �teinte à sa cr�ation
     */
    public CelluleLumineuse() {
        etat = Etat.X;
    }

    /**
     *Cette m�thode permet d'obtenir l'�tat actuel de la cellule lumineuse. Elle renvoie une valeur de l'enumeration Etat, qui peut être "ALLUMEE" ou "ETEINTE"
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
     *Cette m�thode permet de changer l'état de la cellule lumineuse en "�teinte"
     */
    public void eteindre() {
        etat = Etat.X;
    }
}


