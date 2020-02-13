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
public class avis {
    private personne per;
    private int id_avis;
    private Date date_avis;
    private String description_avis;
    private String reponse_avis;

    public avis(personne per, Date date_avis, String description_avis, String reponse_avis) {
        this.per = per;
        this.date_avis = date_avis;
        this.description_avis = description_avis;
        this.reponse_avis = reponse_avis;
    }
    public avis(String description_avis, String reponse_avis) {
        this.per = per;
        this.date_avis = date_avis;
        this.description_avis = description_avis;
        this.reponse_avis = reponse_avis;
    }

    public avis(int id_avis, Date date_avis, String description_avis, String reponse_avis) {
        this.id_avis = id_avis;
        this.date_avis = date_avis;
        this.description_avis = description_avis;
        this.reponse_avis = reponse_avis;
    }

    public avis(Date date_avis, String description_avis, String reponse_avis) {
        this.date_avis = date_avis;
        this.description_avis = description_avis;
        this.reponse_avis = reponse_avis;
    }

    public personne getPer() {
        return per;
    }

    public void setPer(personne per) {
        this.per = per;
    }

    public int getId_avis() {
        return id_avis;
    }

    public Date getDate_avis() {
        return date_avis;
    }

    public String getDescription_avis() {
        return description_avis;
    }

    public String getReponse_avis() {
        return reponse_avis;
    }

    public void setId_avis(int id_avis) {
        this.id_avis = id_avis;
    }

    public void setDate_avis(Date date_avis) {
        this.date_avis = date_avis;
    }

    public void setDescription_avis(String description_avis) {
        this.description_avis = description_avis;
    }

    public void setReponse_avis(String reponse_avis) {
        this.reponse_avis = reponse_avis;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id_avis;
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
        final avis other = (avis) obj;
        if (this.id_avis != other.id_avis) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "avis{" + "id_avis=" + id_avis + ", date_avis=" + date_avis + ", description_avis=" + description_avis + ", reponse_avis=" + reponse_avis + '}';
    }

    public Object getPersonne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
