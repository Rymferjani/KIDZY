/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kids.project.services;

import Kids.project.Iservices.Iservices_reclamations;
import Kids.project.entities.reclamations;
import Kids.project.utils.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author admin
 */
public class services_reclamations implements Iservices_reclamations<reclamations>{ 
    
    private final Connection con;
    private Statement ste; 
    
    public services_reclamations() {
        con = DataBase.getInstance().getConnection();
    } 

    @Override
    public void ajouter(reclamations r) throws SQLException {
    PreparedStatement pre=con.prepareStatement("INSERT INTO `reclamations` (`id_rec`, `id`, `date_rec`, `etat_rec`, `description_rec`, `reponse_rec`) VALUES (NULL, ?,?,?,?,?);");
    pre.setInt(1, 1);
    pre.setDate(2, (java.sql.Date) (Date) r.getDate_rec());
    pre.setByte(3, r.getEtat_rec());
    pre.setString(4, r.getDescription_rec());
    pre.setString(5,r.getReponse_rec());
    pre.executeUpdate();
        System.out.println("réclamation ajoutée");
    }

    @Override
    public void delete(byte etat) throws SQLException {
        PreparedStatement pre=con.prepareStatement("DELETE FROM `reclamations` WHERE `reclamations`.`etat_rec` = ?");
        pre.setInt(1, 1);
              pre.execute();
            System.out.println("reclamation supprimée");
        }
    

    @Override
    public List<reclamations> readAll() throws SQLException {
            List<reclamations> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from reclamations");
     while (rs.next()) {                
               int id=rs.getInt(1);
               Date date=rs.getDate(3);
               byte etat=rs.getByte(4);
               String desc=rs.getString(5);
               String reponse=rs.getString(6);
             
               reclamations r = new reclamations(id, date, etat, desc, reponse);
     arr.add(r);
     }
    return arr;
    }

////    @Override
////    public reclamations chercherRec(Byte etat) throws SQLException {
////        reclamations r = new reclamations();
////        PreparedStatement pre=con.prepareStatement("Select * from reclamations where etat_avis");
////       
////    }
//
//    @Override
//    public reclamations chercherRec(Byte etat) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public reclamations chercherRec(Byte etat) throws SQLException {
               reclamations r = new reclamations();
        PreparedStatement pre=con.prepareStatement("Select * from reclamations where etat_rec= ?");
        pre.setByte(1, etat);
        ResultSet rs =pre.executeQuery();
        while (rs.next()){
            r.setId_rec(rs.getInt(1));
            r.setDate_rec(rs.getDate(3));
            r.setEtat_rec(rs.getByte(4));
            r.setDescription_rec(rs.getString(5));
            r.setReponse_rec(rs.getString(6));
        }
            
        
               
        return r;
        
    }
}
    