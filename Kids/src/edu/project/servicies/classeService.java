/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.project.servicies;

import edu.project.entities.classe;
import edu.project.utils.connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class classeService {

    Connection cnx2;
    Statement st;
    
public  classeService (){
            cnx2 = connexion.getInstance().getCnx();
}
    public void ajouterclasse(classe c) throws SQLException{

            String requete = "INSERT INTO `classe` (`id_classe`, `libelle_cla`, `description`) VALUES (NULL, ?, ?)";
            PreparedStatement pst = cnx2.prepareStatement(requete);
            pst.setString(1, c.getLibelleClasse());
            pst.setString(2, c.getDescClasse());
            pst.executeUpdate();
            System.out.println("classe ajoute");
    }
    
    
 
    public List<classe> afficherClasse() throws SQLException{
        ArrayList<classe>  lsp=new ArrayList<>();
        String req="Select * from classe";

            PreparedStatement st2=cnx2.prepareStatement(req);
            ResultSet rs=st2.executeQuery();
            while(rs.next()){
                classe c = new classe();
                c.setIdClasse(rs.getInt("id_classe"));
                c.setLibelleClasse(rs.getString("libelle_cla"));
                c.setDescClasse(rs.getString("description"));
                lsp.add(c);
            }
                    
  
        return lsp;
    }
    
    
    public void deleteclasse(classe c) throws SQLException {
        PreparedStatement pstmt = cnx2.prepareStatement("DELETE FROM classe WHERE classe.`libelle_cla` = ?;");
        pstmt.setString(1,c.getLibelleClasse());
        pstmt.executeUpdate();
        System.out.println("classe supprime wiouw");
    }
    
    public List<classe> RechercheClasse(String classe) throws SQLException{
        ArrayList<classe>  lsp=new ArrayList<>();
        String req="Select * from classe where classe= "+classe+"  ;" ;

            PreparedStatement st2=cnx2.prepareStatement(req);
            ResultSet rs=st2.executeQuery();
            while(rs.next()){
                classe c = new classe();
                c.setIdClasse(rs.getInt("id_classe"));
                c.setLibelleClasse(rs.getString("libelle_cla"));
                c.setDescClasse(rs.getString("description"));
                lsp.add(c);
            }
                    
  
        return lsp;
    }
   
    

}

