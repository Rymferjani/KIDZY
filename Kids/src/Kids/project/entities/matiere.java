/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kids.project.entities;

/**
 *
 * @author User
 */
public class matiere {
        private int id_matiere;
    private String libelle_matiere;
    private String descritpion_matiere;
    

public matiere() {
    }

    public matiere(String libelle_matiere, String description_matiere) {
        this.libelle_matiere = libelle_matiere;
        this.descritpion_matiere = description_matiere;
    }
    public int getIdMatiere() {
        return id_matiere;
    }

    public String getLibelleMatiere() {
        return libelle_matiere;
    }

    public String getDescMatiere(String description_matiere) {
        return description_matiere;
    }

    public void setIdClasse(int id) {
        this.id_matiere = id;
    }

    public void setLibelleClasse(String libelle_matiere) {
        this.libelle_matiere = libelle_matiere;
    }

    public void setDescritpion_matiere(String descritpion_matiere) {
        this.descritpion_matiere = descritpion_matiere;
    }

    @Override
    public String toString() {
        return "matiere{" + "id_matiere=" + id_matiere + ", libelle_matiere=" + libelle_matiere + ", descritpion_matiere=" + descritpion_matiere + '}';
    }
    
    
}
