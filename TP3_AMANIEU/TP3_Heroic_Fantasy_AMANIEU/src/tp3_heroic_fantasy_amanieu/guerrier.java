/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_amanieu;

/**
 *
 * @author Thibault
 */
public class guerrier extends Personnage {
    private boolean aCheval;

    public guerrier(String nom, int niveauDeVie, boolean aCheval) {
        super(nom, niveauDeVie);
        this.aCheval = aCheval;
    }

    public boolean isACheval() {
        return aCheval;
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    @Override
    public String toString() {
        return "Guerrier{" +
               "nom='" + getNom() + '\'' +
               ", niveauDeVie=" + getNiveauDeVie() +
               ", aCheval=" + aCheval +
               '}';
    }
}

