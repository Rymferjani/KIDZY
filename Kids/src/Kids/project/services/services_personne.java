package kids.project.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kids.project.IService.IService;
import kids.project.entities.chauffeur;
import kids.project.entities.maitre;
import kids.project.entities.parent;
import kids.project.entities.personne;
import kids.project.utils.DataBase;

public class services_personne implements IService<personne> {

    private Connection con;
    private Statement ste;

    public services_personne() {
        con = DataBase.getInstance().getConnection();

    }

    @Override
    public void Inscription(parent p) throws SQLException {
        PreparedStatement pre = con.prepareStatement("INSERT INTO `kidzy`.`personne` ( `login`, `mdp`, `nom`, `prenom`, `image`, `cin`, `telephone`, `role`) VALUES ( ?,?,?,?,?,?,?,?);");
        pre.setString(1, p.getLogin());
        pre.setString(2, p.getPassword());
        pre.setString(3, p.getNom());
        pre.setString(4, p.getPrenom());
        pre.setString(5, p.getImage());
        pre.setString(6, p.getCin());
        pre.setString(7, p.getTel());
        pre.setString(8, "Parent");
        pre.executeUpdate();
    }

    @Override
    public void ajouter1(personne p) throws SQLException {
        PreparedStatement pre = con.prepareStatement("INSERT INTO `kidzy`.`personne` ( `login`, `mdp`, `nom`, `prenom`, `image`, `cin`, `telephone`, `role`) VALUES ( ?,?,?,?,?,?,?,?);");
        pre.setString(1, p.getLogin());
        pre.setString(2, p.getPassword());
        pre.setString(3, p.getNom());
        pre.setString(4, p.getPrenom());
        pre.setString(5, p.getImage());
        pre.setString(6, p.getCin());
        pre.setString(7, p.getTel());
        pre.setString(8, p.getRole());
        pre.executeUpdate();
    }

    @Override
    public boolean Authentification(String login, String password) throws SQLException {
        ste = con.createStatement();
        String requeteCheck = "select * from personne where `login`= '" + login + "'AND `mdp`= '" + password + "';";
        ResultSet rs = ste.executeQuery(requeteCheck);
        while (rs.next()) {
            return true;
        }
        return false;

    }

    @Override
    public List<personne> readAll() throws SQLException {
        personne per = new personne();
        List<personne> arr = new ArrayList<>();
        ste = con.createStatement();
        ResultSet rs = ste.executeQuery("select * from personne ");
        while (rs.next()) {

            per.setId(rs.getInt("id"));
            per.setLogin(rs.getString("login"));
            per.setPassword(rs.getString("mdp"));
            per.setNom(rs.getString("nom"));
            per.setPrenom(rs.getString("prenom"));
            per.setImage(rs.getString("image"));
            per.setCin(rs.getString("cin"));
            per.setTel(rs.getString("telephone"));
            per.setRole(rs.getString("role"));
            //personne p=new personne(rs.getInt("id"),rs.getString("login"),rs.getString("mdp"),rs.getString("nom"),rs.getString("prenom"),rs.getString("image"),rs.getString("cin"),rs.getString("telephone"),rs.getString("role"));
            arr.add(per);
        }
        return arr;
    }

    @Override
    public List<parent> readAllParent() throws SQLException {
        List<parent> arr = new ArrayList<>();
        ste = con.createStatement();
        ResultSet rs = ste.executeQuery("select * from personne where `role`='Parent' ");
        while (rs.next()) {
            int id = rs.getInt("id");
            String login = rs.getString("login");
            String password = rs.getString("mdp");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String image = rs.getString("image");
            String cin = rs.getString("cin");
            String tel = rs.getString("telephone");
            String role = rs.getString("role");
            parent p = new parent(id, login, password, nom, prenom, image, cin, tel, role);
            arr.add(p);
        }
        return arr;
    }

    @Override
    public List<chauffeur> readAllChauffeur() throws SQLException {

        List<chauffeur> arr = new ArrayList<>();
        ste = con.createStatement();
        ResultSet rs = ste.executeQuery("select * from personne where `role`='Chauffeur' ");
        while (rs.next()) {
            int id = rs.getInt("id");
            String login = rs.getString("login");
            String password = rs.getString("mdp");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String image = rs.getString("image");
            String cin = rs.getString("cin");
            String tel = rs.getString("telephone");
            String role = rs.getString("role");
            chauffeur p = new chauffeur(id, login, password, nom, prenom, image, cin, tel, role);
            arr.add(p);
        }
        return arr;
    }

    @Override
    public List<maitre> readAllMaitre() throws SQLException {

        List<maitre> arr = new ArrayList<>();
        ste = con.createStatement();
        ResultSet rs = ste.executeQuery("select * from personne where `role`='Maitre' ");
        while (rs.next()) {

            int id = rs.getInt("id");
            String login = rs.getString("login");
            String password = rs.getString("mdp");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String image = rs.getString("image");
            String cin = rs.getString("cin");
            String tel = rs.getString("telephone");
            String role = rs.getString("role");
            maitre p = new maitre(id, login, password, nom, prenom, image, cin, tel, role);

            arr.add(p);
        }
        return arr;
    }

    @Override
    public boolean delete(personne p) throws SQLException {
        ste = con.createStatement();
        String requeteDelete = "delete  from personne where `login`= '" + p.getLogin() + "';";
        int a = ste.executeUpdate(requeteDelete);
        return a != 0;

    }

    @Override
    public boolean modifierNomPrenom(personne p, String nom, String prenom) throws SQLException {
        PreparedStatement pt = con.prepareStatement("UPDATE personne SET prenom=?,nom=? WHERE login=?");
        pt.setString(1, prenom);
        pt.setString(2, nom);
        pt.setString(3, p.getLogin());
        pt.execute();
        return true;
    }

    @Override
    public personne chercherPer(String log) throws SQLException {
        personne p = new personne();
        ste = con.createStatement();
        PreparedStatement pt = con.prepareStatement("select * from personne where `login`=?");
        pt.setString(1, log);
        ResultSet rs = pt.executeQuery();
        while (rs.next()) {
            p.setId(rs.getInt(1));
            p.setLogin(rs.getString(2));
            p.setPassword(rs.getString(3));
            p.setNom(rs.getString(4));
            p.setPrenom(rs.getString(5));
            p.setImage(rs.getString(6));
            p.setCin(rs.getString(7));
            p.setTel(rs.getString(8));
            p.setRole(rs.getString(9));

        }
        return p;
    }

    @Override
    public ArrayList<personne> triParNom() throws SQLException {
        ArrayList<personne> arr = new ArrayList<>();
        ste = con.createStatement();
        ResultSet rs = ste.executeQuery("select * from personne ");
        while (rs.next()) {
            int id = rs.getInt("id");
            String login = rs.getString("login");
            String password = rs.getString("mdp");
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String image = rs.getString("image");
            String cin = rs.getString("cin");
            String tel = rs.getString("telephone");
            String role = rs.getString("role");
            personne p = new personne(id, login, password, nom, prenom, image, cin, tel, role);
            arr.add(p);
            Collections.sort(arr, new personne());

        }
        return arr;
    }

}
