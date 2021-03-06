/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kids.project.services;

import Kids.project.entities.classe;
import Kids.project.utils.DataBase;
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
            cnx2 = DataBase.getInstance().getConnection();
}
    public void ajouterclasse(classe c) throws SQLException{

            String requete = "INSERT INTO `classe` (`id_classe`, `libelle_cla`, `description`) VALUES (NULL, ?, ?)";
            PreparedStatement pst = cnx2.prepareStatement(requete);
            pst.setString(1, c.getLibelle_cla());
            pst.setString(2, c.getDescription());
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
                c.setId_classe(rs.getInt("id_classe"));
                c.setLibelle_cla(rs.getString("libelle_cla"));
                c.setDescription(rs.getString("description"));
                lsp.add(c);
            }
                    
  
        return lsp;
    }
    
    
    public void deleteclasse(classe c) throws SQLException {
        PreparedStatement pstmt = cnx2.prepareStatement("DELETE FROM classe WHERE classe.`libelle_cla` = ?;");
        pstmt.setString(1,c.getLibelle_cla());
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
                c.setId_classe(rs.getInt("id_classe"));
                c.setLibelle_cla(rs.getString("libelle_cla"));
                c.setDescription(rs.getString("description"));
                lsp.add(c);
            }
                    
  
        return lsp;
    }
   
    

}

