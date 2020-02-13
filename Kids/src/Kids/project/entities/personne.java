
package kids.project.entities;

import java.util.Comparator;


public class personne implements Comparator<personne>{
    private int id;
    private String login;
    private String password;
    private String nom;
    private String prenom;
    private String image;
    private String cin;
    private String tel;
    private String role;

    public personne() {
    }

    public personne(int id, String login, String password, String nom, String prenom, String image, String cin, String tel, String role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.image = image;
        this.cin = cin;
        this.tel = tel;
        this.role = role;
    }
    public personne( String login, String password, String nom, String prenom, String image, String cin, String tel, String role) {
        
        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.image = image;
        this.cin = cin;
        this.tel = tel;
        this.role = role;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

   
    

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getCin() {
        return cin;
    }

    public String getTel() {
        return tel;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "personne{" + "id=" + id + ", login=" + login + ", password=" + password + ", nom=" + nom + ", prenom=" + prenom + ", image=" + image + ", cin=" + cin + ", tel=" + tel + ", role=" + role + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
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
        final personne other = (personne) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
@Override
   public int compare(personne o1, personne o2) { 
        return (o1.getNom().compareTo(o2.getNom()));
    }
    

   
    

   
}
