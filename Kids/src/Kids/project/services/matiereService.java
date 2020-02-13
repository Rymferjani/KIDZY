/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kids.project.services;

import Kids.project.utils.DataBase;
import kids.project.entities.matiere;
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
public class matiereService {
     Connection cnx2;
    Statement st;
    
public  matiereService (){
            cnx2 = DataBase.getInstance().getConnection();
}
    public void ajoutermatiere(matiere m) throws SQLException {
       
            String requete = "insert into matiere(`id_matiere`,`libelle_matiere`,`descritpion_matiere`) values (NULL,'?','?');";
            PreparedStatement st = cnx2.prepareStatement(requete);
            st.setString(1, m.getLibelleMatiere());
            st.setString(2, m.getDescMatiere(requete));
         
            st.executeUpdate();
            System.out.println("matiere ajoute");
        
        }
 public List<matiere> afficherMatiere() throws SQLException {
        ArrayList<matiere>  mtr=new ArrayList<>();
        String req="Select * from matiere";
        
            PreparedStatement st2=cnx2.prepareStatement(req);
            ResultSet rs=st2.executeQuery();
            while(rs.next()){
                matiere m = new matiere();
                m.setIdClasse(rs.getInt("id_matiere"));
                m.setLibelleClasse(rs.getString("libelle_matiere"));
                m.setDescritpion_matiere(rs.getString("descritpion_matiere"));
                mtr.add(m);
            }
        
        return mtr;
    }
 
  public void deleteMatiere(matiere m) throws SQLException {
        PreparedStatement pstmt = cnx2.prepareStatement("DELETE FROM matiere WHERE matiere.`libelle_matiere` = ?;");
        pstmt.setString(1,m.getLibelleMatiere());
        pstmt.executeUpdate();
        

    }
    
}
