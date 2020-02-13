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
public class garde {
        private int id_garde;
    private String activite_garde;
    private Double prix_garde;
    private String duree_garde;
    

public garde() {
    }

    public garde(String activite_garde, Double prix_garde, String duree_garde) {
        this.activite_garde = activite_garde;
        this.prix_garde = prix_garde;
        this.duree_garde = duree_garde;
    }
    public int getIdGarde() {
        return id_garde;
    }

    public String getActiviteGarde() {
        return activite_garde;
    }
    
    public Double getPrixGarde() {
        return prix_garde;
    }
    
    public String getDureeGarde() {
        return duree_garde;
    }

    public void setIdGarde(int id) {
        this.id_garde = id;
    }

    public void setActiviteGarde(String activite_garde) {
        this.activite_garde = activite_garde;
    }
    
    public void setPrixGarde(Double prix) {
        this.prix_garde = prix;
    }
    
    public void setDureeGarde(String duree_garde) {
        this.duree_garde = duree_garde;
    }

    @Override
    public String toString() {
        return "garde{" + "id_garde=" + id_garde + ", activite_garde=" + activite_garde + ", duree_garde=" + duree_garde + '}';
    }
    

}
