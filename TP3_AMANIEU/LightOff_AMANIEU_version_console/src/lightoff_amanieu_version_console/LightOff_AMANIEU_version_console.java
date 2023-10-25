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

        // Cr�ez une instance de la classe Partie et jouez au jeu
        Partie partie = new Partie(4, 4);
        partie.jouer();
    }
}
