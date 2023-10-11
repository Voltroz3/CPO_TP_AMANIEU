/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_amanieu;

/**
 *
 * @author Thibault
 */
public class TP2_manip_AMANIEU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;


        // Affichage des calories de chaque tartiflette
        System.out.println("assiette1: " + assiette1.getNbCalories() + " calories");
        System.out.println("assiette2: " + assiette2.getNbCalories() + " calories");
        System.out.println("assiette3: " + assiette3.getNbCalories() + " calories");

        // Incrémentation des calories d'une tartiflette
        assiette1.setNbCalories(700);

        // Affichage des calories après incrémentation
        System.out.println("assiette1: " + assiette1.getNbCalories() + " calories");
        System.out.println("assiette2: " + assiette2.getNbCalories() + " calories");
        System.out.println("assiette3: " + assiette3.getNbCalories() + " calories");
    
        Moussaka[] assiettes = new Moussaka[10];

        for (int i = 0; i < 10; i++) {
            assiettes[i] = new Moussaka(700);
        }
    
        