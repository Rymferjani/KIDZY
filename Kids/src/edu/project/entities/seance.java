/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.project.entities;

/**
 *
 * @author User
 */
public class seance {
     private int id_seance;
    private String libelle_seance;
    private String descritpion_seance;
    

public seance() {
    }

    public seance(String libelle_seance, String description_seance) {
        this.libelle_seance = libelle_seance;
        this.descritpion_seance = description_seance;
    }
    public int getIdSeance() {
        return id_seance;
    }

    public String getLibelleSeance() {
        return libelle_seance;
    }

    public String getDescSeance(String description_seance) {
        return description_seance;
    }

    public void setIdSeance(int id) {
        this.id_seance = id;
    }

    public void setLibelleClasse(String libelle_seance) {
        this.libelle_seance = libelle_seance;
    }
    
    public void setDescritpion_seance(String descritpion_seance) {
        this.descritpion_seance = descritpion_seance;
    }

    @Override
    public String toString() {
        return "seance{" + "id_seance=" + id_seance + ", libelle_seance=" + libelle_seance + ", descritpion_seance=" + descritpion_seance + '}';
    }

} 

