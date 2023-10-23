/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_amanieu;

/**
 *
 * @author Thibault
 */
public abstract class Personnage {
    private String nom;
    private int niveauDeVie;

    public Personnage(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Personnage{" +
               "nom='" + nom + '\'' +
               ", niveauDeVie=" + niveauDeVie +
               '}';
    }
}


    

