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
public class contact {
    private int id_ct;
    private Date date_ct;
    private byte etat_ct;
    private String description_ct;
    private String reponse_ct;

    public contact(int id_ct, Date date_ct, byte etat_ct, String description_ct, String reponse_ct) {
        this.id_ct = id_ct;
        this.date_ct = date_ct;
        this.etat_ct = etat_ct;
        this.description_ct = description_ct;
        this.reponse_ct = reponse_ct;
    }

    public contact(Date date_ct, byte etat_ct, String description_ct, String reponse_ct) {
        this.date_ct = date_ct;
        this.etat_ct = etat_ct;
        this.description_ct = description_ct;
        this.reponse_ct = reponse_ct;
    }

    public int getId_ct() {
        return id_ct;
    }

    public Date getDate_ct() {
        return date_ct;
    }

    public byte getEtat_ct() {
        return etat_ct;
    }

    public String getDescription_ct() {
        return description_ct;
    }

    public String getReponse_ct() {
        return reponse_ct;
    }

    public void setId_ct(int id_ct) {
        this.id_ct = id_ct;
    }

    public void setDate_ct(Date date_ct) {
        this.date_ct = date_ct;
    }

    public void setEtat_ct(byte etat_ct) {
        this.etat_ct = etat_ct;
    }

    public void setDescription_ct(String description_ct) {
        this.description_ct = description_ct;
    }

    public void setReponse_ct(String reponse_ct) {
        this.reponse_ct = reponse_ct;
    }

    @Override
    public String toString() {
        return "contact{" + "id_ct=" + id_ct + ", date_ct=" + date_ct + ", etat_ct=" + etat_ct + ", description_ct=" + description_ct + ", reponse_ct=" + reponse_ct + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id_ct;
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
        final contact other = (contact) obj;
        if (this.id_ct != other.id_ct) {
            return false;
        }
        return true;
    }
    
}
