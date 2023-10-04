/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.Random;

public class TableauDeDes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir un nombre entier m : ");
        int m = scanner.nextInt();

        int[] tableauDes = new int[6];

        // Générateur de nombres aléatoires
        Random random = new Random();

        for (int i = 0; i < m; i++) {
            int randomIndex = random.nextInt(6);

            tableauDes[randomIndex]++;
        }

        for (int i = 0; i < tableauDes.length; i++) {
            double pourcentage = (double) tableauDes[i] / m * 100.0;
            System.out.println("Face " + (i + 1) + " : " + pourcentage + "%");
        }

        scanner.close();
    }
}







    



