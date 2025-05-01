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

public class GestionEquipements {

    private ArrayList<Equipement> listeEquipements;

    public GestionEquipements() {
        this.listeEquipements = new ArrayList<>();
    }

    // Ajouter un équipement
    public void ajouterEquipement(Equipement equipement) {
        this.listeEquipements.add(equipement);
        System.out.println("Équipement ajouté : " + equipement.getRefEquipement());
    }

    // Supprimer un équipement par sa référence
    public void supprimerEquipement(String refEquipement) {
        Equipement aSupprimer = null;
        for (Equipement e : listeEquipements) {
            if (e.getRefEquipement().equals(refEquipement)) {
                aSupprimer = e;
                break;
            }
        }
        if (aSupprimer != null) {
            listeEquipements.remove(aSupprimer);
            System.out.println("Équipement supprimé avec succès.");
        } else {
            System.out.println("Équipement avec la référence " + refEquipement + " non trouvé.");
        }
    }

    // Afficher tous les équipements
    public void afficherTousLesEquipements() {
        System.out.println("Liste des équipements disponibles :");
        for (Equipement e : listeEquipements) {
            e.afficherEquipement();
        }
    }

    // Récupérer la liste des équipements
    public ArrayList<Equipement> getListeEquipements() {
        return listeEquipements;
    }
}
