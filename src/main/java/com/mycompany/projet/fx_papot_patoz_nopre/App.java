package com.mycompany.projet.fx_papot_patoz_nopre;

import java.util.Scanner;
/*import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;*/

import java.util.ArrayList;
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
        
        System.out.print("Entrez nom atelier: ");
        String nAtelier = scanner.nextLine();
        
        ArrayList<Equipement> eq = new ArrayList();
        
        while(true){
            System.out.println("voulez vous ajouter eq ? (oui/non)"); //mettre bouton oui ou non
            String reponse = scanner.nextLine();
            if (reponse.equalsIgnoreCase("non")){
                break;
            }
            
            System.out.println("m ou p");
            String typeEq = scanner.nextLine();
            
            if (typeEq.equalsIgnoreCase("m")){
               System.out.println("ref :");
               String ref = scanner.nextLine();
               System.out.println("designation");
               String d = scanner.nextLine();
               System.out.println("x");
               float x = scanner.nextFloat();
               System.out.println("y");
               float y = scanner.nextFloat();
               System.out.println("cout horaire:");
               float coutH = scanner.nextFloat();
               scanner.nextLine();
               System.out.println("type:");
               String type = scanner.nextLine();
               //System.out.println("etat");
               //String etat = scanner.nextLine();
               
               Machine machine = new Machine(ref,d, x, y, coutH, type  );
               
               // ajout dans la liste des equipements de l'atelier
               eq.add(machine);
               
            }else if (typeEq.equalsIgnoreCase("p")){
                System.out.println("Nom du poste :");
                String nomPoste = scanner.nextLine();
                
                System.out.println("Designation du poste :");
                String dPoste = scanner.nextLine();
                
                ArrayList<Machine> machinesPoste = new ArrayList<>();
                while (true){
                    System.out.println("Voulez vous ajouter une machine ? (oui/non)"); //mettre bouton pr oui/non
                    String rep = scanner.nextLine();
                    
                    //verifier type de réponse
                    while(!rep.equalsIgnoreCase("non")&&!rep.equalsIgnoreCase("oui")){
                        System.out.println("ecrire oui ou non");
                    }
                    
                    if(rep.equalsIgnoreCase("non")){
                        break;
                    }else{
                       System.out.println("ref :");
                       String refMP = scanner.nextLine();
                       System.out.println("designation");
                       String dMP = scanner.nextLine();
                       System.out.println("x");
                       float xMP = scanner.nextFloat();
                       System.out.println("y");
                       float yMP = scanner.nextFloat();
                       System.out.println("cout horaire:");
                       float coutHmP = scanner.nextFloat();
                       scanner.nextLine();
                       System.out.println("type:");
                       String typeMP = scanner.nextLine(); 
                       //etat
                       
                       //crée la machine correspondante
                       Machine machinePoste = new Machine (refMP, dMP, xMP, yMP, coutHmP, typeMP);
                       //ajout a la liste des machines composant le poste
                       machinesPoste.add(machinePoste);
                    }
                }
                    
                    //création du Poste correspondant 
                    Poste poste = new Poste (nomPoste, dPoste, machinesPoste);
                    
                    //ajout dans la liste des equipements de l'atelier
                    eq.add(poste);
                    
                }
            //verifier le type de réponse 
                else {
                        System.out.println("Type d'equipements non reconnu. Veuillez entrer 'm' pour machine ou 'p' pour poste");
                        }
                
            }
               //crée l'atelier correspondant 
               Atelier atelier = new Atelier(nAtelier, eq);
               
               System.out.println("atelier cree :"+nAtelier);//atelier.nAtelier marche pas
               System.out.println("Equipements:");
               for (Equipement equi : eq){// atelier.eq marche pas
                   if (equi instanceof Machine){
                       Machine mach = (Machine) equi;
                       mach.afficherEquipement();
                   }
                   if (equi instanceof Poste){
                       Poste post = (Poste) equi;
                       post.afficherEquipement();
               }
          
        }
            
    
        
        
        /*Stockage stockage = new Stockage();
        
        System.out.print("Entrez la matière: ");
        String matiere = scanner.nextLine();
        
        System.out.print("Entrez sa quantité : ");
        Double quantite = scanner.nextDouble();
        
        scanner.nextLine();// consommer le retour a la ligne pr eviter de planter
        
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
        }*/
        

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


    

