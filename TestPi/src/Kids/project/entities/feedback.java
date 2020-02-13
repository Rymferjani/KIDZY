/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kids.project.entities;

/**
 *
 * @author admin
 */
public class feedback {
    private int id_fd;
    private String description_fd;
    private byte etat_fd;
    private String reponse_fd;

    public feedback(String description_fd, byte etat_fd, String reponse_fd) {
        this.description_fd = description_fd;
        this.etat_fd = etat_fd;
        this.reponse_fd = reponse_fd;
    }

    public byte getEtat_fd() {
        return etat_fd;
    }

    public void setEtat_fd(byte etat_fd) {
        this.etat_fd = etat_fd;
    }




    public feedback(int id_fd, String description_fd, String reponse_fd) {
        this.id_fd = id_fd;
        this.description_fd = description_fd;
        this.reponse_fd = reponse_fd;
    }

    public feedback(String description_fd, String reponse_fd) {
        this.description_fd = description_fd;
        this.reponse_fd = reponse_fd;
    }





   
    public void setId_fd(int id_fd) {
        this.id_fd = id_fd;
    }

    public void setDescription_fd(String description_fd) {
        this.description_fd = description_fd;
    }

    public void setReponse_fd(String reponse_fd) {
        this.reponse_fd = reponse_fd;
    }

    public int getId_fd() {
        return id_fd;
    }

    public String getDescription_fd() {
        return description_fd;
    }

    public String getReponse_fd() {
        return reponse_fd;
    }

    @Override
    public String toString() {
        return "feedback{" + "description_fd=" + description_fd + ", etat_fd=" + etat_fd + ", reponse_fd=" + reponse_fd + '}';
    }



    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id_fd;
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
        final feedback other = (feedback) obj;
        if (this.id_fd != other.id_fd) {
            return false;
        }
        return true;
    }
    
}
