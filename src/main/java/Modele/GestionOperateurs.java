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

public class GestionOperateurs {

    private ArrayList<Operateur> listeOperateurs;

    public GestionOperateurs() {
        this.listeOperateurs = new ArrayList<>();
    }

    // Ajouter un opérateur
    public void ajouterOperateur(Operateur operateur) {
        this.listeOperateurs.add(operateur);
        System.out.println("Opérateur ajouté : " + operateur.getNom() + " " + operateur.getPrenom());
    }

    // Supprimer un opérateur par son code
    public void supprimerOperateur(String codeOperateur) {
        Operateur aSupprimer = null;
        for (Operateur o : listeOperateurs) {
            if (o.getCode().equals(codeOperateur)) {
                aSupprimer = o;
                break;
            }
        }
        if (aSupprimer != null) {
            listeOperateurs.remove(aSupprimer);
            System.out.println("Opérateur supprimé avec succès.");
        } else {
            System.out.println("Opérateur avec le code " + codeOperateur + " non trouvé.");
        }
    }

    // Afficher tous les opérateurs
    public void afficherTousLesOperateurs() {
        System.out.println("Liste des opérateurs disponibles :");
        for (Operateur o : listeOperateurs) {
            o.afficherOperateur();
        }
    }

    // Récupérer la liste des opérateurs
    public ArrayList<Operateur> getListeOperateurs() {
        return listeOperateurs;
    }
}
