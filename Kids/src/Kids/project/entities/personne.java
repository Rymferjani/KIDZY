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
public class personne {
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
    public String toString() {
        return "personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password=" + password + ", cin=" + cin + ", tel=" + tel + ", role=" + role + '}';
    }
    

   
}
