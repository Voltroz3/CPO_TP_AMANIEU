package lightoff_amanieu_version_console;

/**
 *
 * @author Thibault
 */
public class LightOff_AMANIEU_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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

        // Créez une instance de la classe Partie et jouez au jeu
        Partie partie = new Partie(4, 4);
        partie.jouer();
    }
}
