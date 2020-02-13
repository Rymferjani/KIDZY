/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kids.project.services;

import Kids.project.utils.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kids.project.entities.garde;

/**
 *
 * @author User
 */
public class gardeService {
    Connection cnx2;
    Statement st;
    
public  gardeService (){
            cnx2 = DataBase.getInstance().getConnection();
}
    public void ajoutergarde(garde g) throws SQLException {
       
            String requete = "insert into garde(`id_garde`,`activite_garde`,`prix_garde`,`duree_garde`) values (NULL,'?','?','?');";
            PreparedStatement st = cnx2.prepareStatement(requete);
            st.setString(1, g.getActiviteGarde());
            st.setDouble(2, g.getPrixGarde());
            st.setString(3, g.getDureeGarde()); 
            st.executeUpdate();
            System.out.println("garde ajoute");
        
        }
   
    
 
    public List<garde> afficherGarde() throws SQLException {
        ArrayList<garde>  grd=new ArrayList<>();
        String req="Select * from garde";
        
            PreparedStatement st2=cnx2.prepareStatement(req);
            ResultSet rs=st2.executeQuery();
            while(rs.next()){
                garde g = new garde();
                g.setIdGarde(rs.getInt("id_garde"));
                g.setActiviteGarde(rs.getString("activite_garde"));
                g.setPrixGarde(rs.getDouble("prix_garde"));
                g.setDureeGarde(rs.getString("duree_garde"));
                grd.add(g);
            }
        
        return grd;
    }
     
   
    
    
    public void deleteGarde(garde g) throws SQLException {
        PreparedStatement pstmt = cnx2.prepareStatement("DELETE FROM garde WHERE garde.`activite_garde` = ?;");
        pstmt.setString(1,g.getActiviteGarde());
        pstmt.executeUpdate();
        

    }
}
