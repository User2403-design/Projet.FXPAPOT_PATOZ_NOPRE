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

public class GestionGammes {

    private ArrayList<Gamme> listeGammes;

    public GestionGammes() {
        this.listeGammes = new ArrayList<>();
    }

    // Ajouter une gamme
    public void ajouterGamme(Gamme gamme) {
        this.listeGammes.add(gamme);
        System.out.println("Gamme ajoutée : " + gamme.getRefGamme());
    }

    // Supprimer une gamme par sa référence
    public void supprimerGamme(String refGamme) {
        Gamme aSupprimer = null;
        for (Gamme g : listeGammes) {
            if (g.getRefGamme().equals(refGamme)) {
                aSupprimer = g;
                break;
            }
        }
        if (aSupprimer != null) {
            listeGammes.remove(aSupprimer);
            System.out.println("Gamme supprimée avec succès.");
        } else {
            System.out.println("Gamme avec la référence " + refGamme + " non trouvée.");
        }
    }

    // Afficher toutes les gammes
    public void afficherToutesLesGammes() {
        System.out.println("Liste des gammes disponibles :");
        for (Gamme g : listeGammes) {
            g.afficherGamme();
        }
    }

    // Récupérer la liste des gammes
    public ArrayList<Gamme> getListeGammes() {
        return listeGammes;
    }
}
