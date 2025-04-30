/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
  import java.util.Scanner;
/**
 *
 * @author chloe
 */
public class main {
  
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Affichage du message de bienvenue
        System.out.println("Entrez le nom de l'atelier:");
        String atelierName = scanner.nextLine();
        System.out.println("Atelier: " + atelierName);

        // Affichage du menu des choix
        System.out.println("\nChoisissez une option :");
        System.out.println("1. Produit");
        System.out.println("2. Équipement");
        System.out.println("3. Machine");
        System.out.println("4. Fiabilité");
        System.out.println("5. Poste");
        System.out.println("6. Opération");
        System.out.println("7. Opérateur");
        System.out.println("8. Map");
        System.out.println("9. Gamme");

        // Lecture du choix de l'utilisateur
        int choix = scanner.nextInt();

        // Switch pour effectuer l'action correspondante au choix
        switch (choix) {
            case 1:
                // Appel à la classe Produit
                Produit produit = new Produit();
                produit.afficherDetails();
                break;
            case 2:
                // Appel à la classe Équipement
                Equipement equipement = new Equipement();
                equipement.afficherDetails();
                break;
            case 3:
                // Appel à la classe Machine
                Machine machine = new Machine();
                machine.afficherDetails();
                break;
            case 4:
                // Appel à la classe Fiabilité
                Fiabilite fiabilite = new Fiabilite();
                fiabilite.afficherDetails();
                break;
            case 5:
                // Appel à la classe Poste
                Poste poste = new Poste();
                poste.afficherDetails();
                break;
            case 6:
                // Appel à la classe Opération
                Operation operation = new Operation();
                operation.afficherDetails();
                break;
            case 7:
                // Appel à la classe Opérateur
                Operateur operateur = new Operateur();
                operateur.afficherDetails();
                break;
            case 8:
                // Appel à la classe Map
                Map map = new Map();
                map.afficherDetails();
                break;
            case 9:
                // Appel à la classe Gamme
                Gamme gamme = new Gamme();
                gamme.afficherDetails();
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }

        scanner.close();
    }
}

