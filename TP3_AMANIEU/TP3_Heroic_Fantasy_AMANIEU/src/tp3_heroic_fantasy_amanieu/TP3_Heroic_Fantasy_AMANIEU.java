/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_amanieu;

import Personnage.guerrier;
import Personnage.Magicien;
import Personnage.Personnage;
import Arme.Arme;
import Arme.Epee;
import Arme.Baton;
import java.util.ArrayList;

 
public class TP3_Heroic_Fantasy_AMANIEU {

    
    public static void main(String[] args) {
        Epee Excalibur = new Epee("Excalibur", 7,5);
        Epee Durandal = new Epee ("Durandal",4,7);
        Baton Chêne = new Baton ("Chêne",4,7);
        Baton Charme = new Baton ("Charme",5,6);
        
        ArrayList<Arme> armes = new ArrayList<>();

        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);
        armes.add(epee1);
        armes.add(epee2);

        Baton baton1 = new Baton("Chêne", 4, 7);
        Baton baton2 = new Baton("Charme", 5, 6);
        armes.add(baton1);
        armes.add(baton2);
        
        Magicien Gandalf = new Magicien("Gandalf", 65 , true);
        Magicien Garcimore = new Magicien("Garcimore", 44, false);
        
        guerrier Conan = new guerrier("Conan", 78, false);
        guerrier lahister = new guerrier("Lahister", 45, true);
       


        ArrayList<Personnage> personnages = new ArrayList<>();
        Personnage guerrier1 = null;
        personnages.add(guerrier1);
        Personnage guerrier2 = null;
        personnages.add(guerrier2);
        Personnage magicien1 = null;
        personnages.add(magicien1);
        Personnage magicien2 = null;
        personnages.add(magicien2);

        for (Personnage personnage : personnages) {
            System.out.println(personnage);
            
         tab Armes = new []; 
            
        }
    }
}
