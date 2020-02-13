/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.project.entities;

import java.util.List;

/**
 *
 * @author User
 */
public class classe {

    public static List<classe> afficherClasse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int id_classe;
    private String libelle_classe;
    private String description_classe;
    

public classe() {
    }

    public classe(String libelle_classe, String description_classe) {
        this.libelle_classe = libelle_classe;
        this.description_classe = description_classe;
    }

    public classe(String chauffeur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public classe(String kk, String mm, String mee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getIdClasse() {
        return id_classe;
    }

    public String getLibelleClasse() {
        return libelle_classe;
    }

    public String getDescClasse() {
        return description_classe;
    }

    public void setIdClasse(int id) {
        this.id_classe = id;
    }

    public void setLibelleClasse(String libelle_classe) {
        this.libelle_classe = libelle_classe;
    }
    
    public void setDescClasse(String description_classe) {
        this.description_classe = description_classe;
    }
    

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        return hash;
//    }

    @Override
    public String toString() {
        return "classe{" + "id_classe=" + id_classe + ", libelle_classe=" + libelle_classe + ", description_classe=" + description_classe + '}';
    }

} 
