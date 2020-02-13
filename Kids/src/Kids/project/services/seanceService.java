/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kids.project.services;

import Kids.project.utils.DataBase;
import kids.project.entities.seance;
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
public class seanceService {
     Connection cnx2;
    Statement st;
    
public  seanceService (){
            cnx2 = DataBase.getInstance().getConnection();
}
    public void ajouterSeance(seance se) throws SQLException {
       
            String requete = "insert into seance(`id_seance`,`libelle_seance`,`descritpion_seance`) values (NULL,'?','?');";
            PreparedStatement st = cnx2.prepareStatement(requete);
            st.setString(2, se.getLibelleSeance());
            st.setString(3, se.getDescSeance(requete));
            st.executeUpdate();
            System.out.println("garde ajoute");
        
        }
   
    
 
    public List<seance> afficherSeance() throws SQLException {
        ArrayList<seance>  snc=new ArrayList<>();
        String req="Select * from seance";
        
            PreparedStatement st2=cnx2.prepareStatement(req);
            ResultSet rs=st2.executeQuery();
            while(rs.next()){
                seance s = new seance();
                s.setIdSeance(rs.getInt("id_seance"));
                s.setLibelleClasse(rs.getString("libelle_seance"));
                s.setDescritpion_seance(rs.getString("descritpion_seance"));
                snc.add(s);
            }
        
        return snc;
    }
     
   
    
    
    public void deleteGarde(seance s) throws SQLException {
        PreparedStatement pstmt = cnx2.prepareStatement("DELETE FROM seance WHERE seance.`libelle_seance` = ?;");
        pstmt.setString(1,s.getLibelleSeance());
        pstmt.executeUpdate();
        

    }
}
