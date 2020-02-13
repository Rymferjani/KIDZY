/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kids.project.entities;

import java.util.Date;

/**
 *
 * @author admin
 */
public class enfant {
    private int id_enfant;
    private String nom_enfant;
    private String prenom_enfant;
    private String image_enfant;
    private Date dateN_enfant;
    private int age_enfant;
    private String description_enfant;

    public enfant(int id_enfant, String nom_enfant, String prenom_enfant, String image_enfant, Date dateN_enfant, int age_enfant, String description_enfant) {
        this.id_enfant = id_enfant;
        this.nom_enfant = nom_enfant;
        this.prenom_enfant = prenom_enfant;
        this.image_enfant = image_enfant;
        this.dateN_enfant = dateN_enfant;
        this.age_enfant = age_enfant;
        this.description_enfant = description_enfant;
    }

    public int getId_enfant() {
        return id_enfant;
    }

    public String getNom_enfant() {
        return nom_enfant;
    }

    public String getPrenom_enfant() {
        return prenom_enfant;
    }

    public String getImage_enfant() {
        return image_enfant;
    }

    public Date getDateN_enfant() {
        return dateN_enfant;
    }

    public int getAge_enfant() {
        return age_enfant;
    }

    public String getDescription_enfant() {
        return description_enfant;
    }

    public void setId_enfant(int id_enfant) {
        this.id_enfant = id_enfant;
    }

    public void setNom_enfant(String nom_enfant) {
        this.nom_enfant = nom_enfant;
    }

    public void setPrenom_enfant(String prenom_enfant) {
        this.prenom_enfant = prenom_enfant;
    }

    public void setImage_enfant(String image_enfant) {
        this.image_enfant = image_enfant;
    }

    public void setDateN_enfant(Date dateN_enfant) {
        this.dateN_enfant = dateN_enfant;
    }

    public void setAge_enfant(int age_enfant) {
        this.age_enfant = age_enfant;
    }

    public void setDescription_enfant(String description_enfant) {
        this.description_enfant = description_enfant;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.id_enfant;
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
        final enfant other = (enfant) obj;
        if (this.id_enfant != other.id_enfant) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enfant{" + "id_enfant=" + id_enfant + ", nom_enfant=" + nom_enfant + ", prenom_enfant=" + prenom_enfant + ", image_enfant=" + image_enfant + ", dateN_enfant=" + dateN_enfant + ", age_enfant=" + age_enfant + ", description_enfant=" + description_enfant + '}';
    }

    public enfant(String nom_enfant, String prenom_enfant, String image_enfant, Date dateN_enfant, int age_enfant, String description_enfant) {
        this.nom_enfant = nom_enfant;
        this.prenom_enfant = prenom_enfant;
        this.image_enfant = image_enfant;
        this.dateN_enfant = dateN_enfant;
        this.age_enfant = age_enfant;
        this.description_enfant = description_enfant;
    }

    
}
