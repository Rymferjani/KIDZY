/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kids.project.entities;

/**
 *
 * @author Youssef Mimouni
 */
public class classe {
    
    private int id_classe;
    private String libelle_cla;
    private String description;

    public classe() {
    }

    public classe(int id_classe, String libelle_cla, String description) {
        this.id_classe = id_classe;
        this.libelle_cla = libelle_cla;
        this.description = description;
    }

    public classe(String libelle_cla, String description) {
        this.libelle_cla = libelle_cla;
        this.description = description;
    }

    public int getId_classe() {
        return id_classe;
    }

    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

    public String getLibelle_cla() {
        return libelle_cla;
    }

    public void setLibelle_cla(String libelle_cla) {
        this.libelle_cla = libelle_cla;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "classe{" + "id_classe=" + id_classe + ", libelle_cla=" + libelle_cla + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id_classe;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final classe other = (classe) obj;
        if (this.id_classe != other.id_classe) {
            return false;
        }
        return true;
    }
    
    
    
}
