/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet.fx_papot_patoz_nopre;

/**
 *
 * @author chloe
 */
import java.util.Scanner;
public class Main {
    

    public static void Main1(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande d'informations à l'utilisateur
        System.out.print("Entrez la référence de la machine : ");
        String refMachine = scanner.nextLine();

        System.out.print("Entrez la désignation de la machine : ");
        String dMachine = scanner.nextLine();

        System.out.print("Entrez la position X de la machine : ");
        float x = scanner.nextFloat();

        System.out.print("Entrez la position Y de la machine : ");
        float y = scanner.nextFloat();

        System.out.print("Entrez le coût horaire de la machine : ");
        float cout = scanner.nextFloat();
        scanner.nextLine(); // consommer le retour à la ligne

        System.out.print("Entrez l'état de la machine (ex: opérationnel, en arrêt) : ");
        String etat = scanner.nextLine();

        System.out.print("Entrez le type de la machine : ");
        String type = scanner.nextLine();

        // Création de l'objet Machine
        Machine machine = new Machine(refMachine, dMachine, x, y, cout, etat, type);

        // Affichage des informations de la machine
        System.out.println("Informations de la machine :");
        machine.afficherEquipement();

        // Test de coût d'une opération
        System.out.print("Entrez la durée d'une opération (en heures) pour tester le coût : ");
        float dureeTest = scanner.nextFloat();
        float coutOperation = machine.coutOperation(dureeTest);
        System.out.println("Coût de l'opération pour " + dureeTest + " heures : " + coutOperation + " €");

        scanner.close();
    }
}


