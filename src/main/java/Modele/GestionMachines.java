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

public class GestionMachines {

    private ArrayList<Machine> listeMachines;

    public GestionMachines() {
        this.listeMachines = new ArrayList<>();
    }

    // Ajouter une machine
    public void ajouterMachine(Machine machine) {
        this.listeMachines.add(machine);
        System.out.println("Machine ajoutée : " + machine.getRefmachine());
    }

    // Supprimer une machine par sa référence
    public void supprimerMachine(String refMachine) {
        Machine aSupprimer = null;
        for (Machine m : listeMachines) {
            if (m.getRefmachine().equals(refMachine)) {
                aSupprimer = m;
                break;
            }
        }
        if (aSupprimer != null) {
            listeMachines.remove(aSupprimer);
            System.out.println("Machine supprimée avec succès.");
        } else {
            System.out.println("Machine avec la référence " + refMachine + " non trouvée.");
        }
    }

    // Afficher toutes les machines
    public void afficherToutesLesMachines() {
        System.out.println("Liste des machines disponibles :");
        for (Machine m : listeMachines) {
            m.afficherEquipement();
        }
    }

    // Récupérer la liste des machines
    public ArrayList<Machine> getListeMachines() {
        return listeMachines;
    }
}