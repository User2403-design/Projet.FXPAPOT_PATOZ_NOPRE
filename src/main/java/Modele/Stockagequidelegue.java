/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author chloe
 */

public class Stockagequidelegue {

    private GestionMachines gestionMachines;
    private GestionOperations gestionOperations;
    private GestionOperateurs gestionOperateurs;
    private GestionProduits gestionProduits;
    private GestionGammes gestionGammes;
    private GestionEquipements gestionEquipements;
    private GestionMagasins gestionMagasins;
    private GestionPostes gestionPostes;

    public Stockagequidelegue() {
        gestionMachines = new GestionMachines();
        gestionOperations = new GestionOperations();
        gestionOperateurs = new GestionOperateurs();
        gestionProduits = new GestionProduits();
        gestionGammes = new GestionGammes();
        gestionEquipements = new GestionEquipements();
        gestionMagasins = new GestionMagasins();
        gestionPostes = new GestionPostes();
    }

    // Accesseurs pour délégation depuis l'IHM
    public GestionMachines getGestionMachines() {
        return gestionMachines;
    }

    public GestionOperations getGestionOperations() {
        return gestionOperations;
    }

    public GestionOperateurs getGestionOperateurs() {
        return gestionOperateurs;
    }

    public GestionProduits getGestionProduits() {
        return gestionProduits;
    }

    public GestionGammes getGestionGammes() {
        return gestionGammes;
    }

    public GestionEquipements getGestionEquipements() {
        return gestionEquipements;
    }

    public GestionMagasins getGestionMagasins() {
        return gestionMagasins;
    }

    public GestionPostes getGestionPostes() {
        return gestionPostes;
    }

    public void afficherListe(String type) {
        switch (type.toLowerCase()) {
            case "machine" -> gestionMachines.afficherToutes();
            case "operation" -> gestionOperations.afficherToutes();
            case "operateur" -> gestionOperateurs.afficherToutes();
            case "produit" -> gestionProduits.afficherToutes();
            case "gamme" -> gestionGammes.afficherToutes();
            case "equipement" -> gestionEquipements.afficherToutes();
            case "magasin" -> gestionMagasins.afficherToutes();
            case "poste" -> gestionPostes.afficherToutes();
            default -> System.out.println("Type non reconnu : " + type);
        }
    }
}

