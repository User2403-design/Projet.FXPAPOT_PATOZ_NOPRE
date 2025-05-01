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

public class GestionProduits {

    private ArrayList<Produit> listeProduits;

    public GestionProduits() {
        this.listeProduits = new ArrayList<>();
    }

    // Ajouter un produit
    public void ajouterProduit(Produit produit) {
        this.listeProduits.add(produit);
        System.out.println("Produit ajouté : " + produit.getCodeProduit());
    }

    // Supprimer un produit par son code
    public void supprimerProduit(String refProduit) {
        Produit aSupprimer = null;
        for (Produit p : listeProduits) {
            if (p.getCodeProduit().equals(refProduit)) {
                aSupprimer = p;
                break;
            }
        }
        if (aSupprimer != null) {
            listeProduits.remove(aSupprimer);
            System.out.println("Produit supprimé avec succès.");
        } else {
            System.out.println("Produit avec la référence " + refProduit + " non trouvé.");
        }
    }

    // Afficher tous les produits
    public void afficherTousLesProduits() {
        System.out.println("Liste des produits disponibles :");
        for (Produit p : listeProduits) {
            p.afficherProduit();
        }
    }

    // Récupérer la liste des produits
    public ArrayList<Produit> getListeProduits() {
        return listeProduits;
    }
}
