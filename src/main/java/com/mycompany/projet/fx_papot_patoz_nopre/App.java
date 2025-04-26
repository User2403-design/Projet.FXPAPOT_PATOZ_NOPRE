package com.mycompany.projet.fx_papot_patoz_nopre;

import java.util.Scanner;
/*import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;*/


/**
 * JavaFX App
 */
public class App{ //extends Application {

    /*@Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }*/

    public static void main(String[] args) {
        //launch(args);
        
        Scanner scanner = new Scanner(System.in);
        
        Stockage stockage = new Stockage();
        
        System.out.print("Entrez la matière: ");
        String matiere = scanner.nextLine();
        
        System.out.print("Entrez sa quantité : ");
        Double quantite = scanner.nextDouble();
        
        scanner.nextLine();
        
        stockage.ajouterStocke(new Magasindebrut (matiere, quantite));
        
        System.out.print("Entrez matiere a rechercher : ");
        String matrech = scanner.nextLine();
        
        System.out.print("Entrez qté a rechercher : ");
        Double qterech = scanner.nextDouble();
        
        boolean trouve = stockage.VerifierStocke( stockage.getListeMagDeBrut(), matrech, qterech);
        
        if (trouve){
            System.out.print("OK");
        }else {
            System.out.print("pas possible");
        }
        

        // Demande d'informations à l'utilisateur
        /*System.out.print("Entrez la référence de la machine : ");
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

        //System.out.print("Entrez l'état de la machine (ex: opérationnel, en arrêt) : ");
        //String etat = scanner.nextLine();

        System.out.print("Entrez le type de la machine : ");
        String type = scanner.nextLine();

        // Création de l'objet Machine
        Machine machine = new Machine(refMachine, dMachine, x, y, cout, type);

        // Affichage des informations de la machine
        System.out.println("Informations de la machine :");
        machine.afficherEquipement();

        // Test de coût d'une opération
        System.out.print("Entrez la durée d'une opération (en heures) pour tester le coût : ");
        float dureeTest = scanner.nextFloat();
        float coutOperation = machine.coutOperation(dureeTest);
        System.out.println("Coût de l'opération pour " + dureeTest + " heures : " + coutOperation + " €");
*/
        scanner.close();
    }
}

    

