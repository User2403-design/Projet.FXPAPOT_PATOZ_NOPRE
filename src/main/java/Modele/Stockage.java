/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author chloe
 */
import java.util.ArrayList;
public class Stockage {
    
    //pour stocker chaque elements
    private ArrayList<Machine> listeMachines; 
    private ArrayList<Operation> listeOperations;
    private ArrayList<Operateur> listeOperateurs;
    private ArrayList<Equipement> listeEquipements;
    private ArrayList<Gamme> listeGammes;
    private ArrayList<Produit> listeProduits;
    private ArrayList<Magasindebrut> listeMagDeBrut;
    private ArrayList<Poste> listePostes; 
    
    //constructeur pour initialiser les listes (peut pas appelé stockage et remplir toutes les listes en mm temps : crée liste vide qu'on modifie par les methodes ajouter, supprimer de chaque classes 
    public Stockage (){
        this.listeMachines = new ArrayList<>();
        this.listeOperations = new ArrayList<>();
        this.listeOperateurs = new ArrayList<>();
        this.listeEquipements = new ArrayList<>();
        this.listeGammes = new ArrayList<>();
        this.listeProduits = new ArrayList<>();
        this.listeMagDeBrut = new ArrayList<>();
        this.listePostes= new ArrayList(); 
        
    }
    // methode pr ajouter, modif, supp, afficher chaque el

    public ArrayList<Poste> getListePostes() {
        return listePostes;
    }

    public void setListePostes(ArrayList<Poste> listePostes) {
        this.listePostes = listePostes;
    }
    
    
    Operation op1 = new Operation("1", "OP1", m1, 30.0f);
    
    public void ajouterStocke (Magasindebrut stocke){
        this.listeMagDeBrut.add(stocke);
    }
    //verifier si une matière existe en quantité suffisante pour fabriquer un produit
    public boolean VerifierStocke (ArrayList<Magasindebrut> mag, String matiere, double quantite){
        return listeMagDeBrut.stream().anyMatch( m -> m.getMatiere().equals(matiere) && m.getQuantite()>= quantite );
    }

    public ArrayList<Machine> getListeMachines() {
        return listeMachines;
    }

    public ArrayList<Operation> getListeOperations() {
        return listeOperations;
    }

    public ArrayList<Operateur> getListeOperateurs() {
        return listeOperateurs;
    }

    public ArrayList<Equipement> getListeEquipements() {
        return listeEquipements;
    }

    public ArrayList<Gamme> getListeGammes() {
        return listeGammes;
    }

    public ArrayList<Produit> getListeProduits() {
        return listeProduits;
    }

    public ArrayList<Magasindebrut> getListeMagDeBrut() {
        return listeMagDeBrut;
    }
    
    
    // Méthodes pour ajouter des objets dans le stockage

    // Ajouter une machine
    public void ajouterMachine(Machine machine) {
        this.listeMachines.add(machine); 
    }

    // Ajouter un poste de travail
    public void ajouterPoste(Poste poste) {
        this.listePostes.add(poste); 
    }

    // Ajouter une opération
    public void ajouterOperation(Operation operation) {
        this.listeOperations.add(operation); 
    }

    // Ajouter une gamme de fabrication
    public void ajouterGamme(Gamme gamme) {
        this.listeGammes.add(gamme); 
    }

    // Ajouter un opérateur
    public void ajouterOperateur(Operateur operateur) {
        this.listeOperateurs.add(operateur);
    }
    
    // Ajouter un opérateur
    public void ajouterProduit(Produit produit) {
        this.listeProduits.add(produit); 
    }
    
}
