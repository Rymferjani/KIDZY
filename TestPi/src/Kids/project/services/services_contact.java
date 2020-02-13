/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kids.project.services;

import Kids.project.Iservices.Iservices_contact;
import Kids.project.entities.contact;
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
public class services_contact implements Iservices_contact<contact> {
        private final Connection con;
    private Statement ste; 
    
    public services_contact() {
        con = DataBase.getInstance().getConnection();
    } 

    @Override
    public void ajouter(contact c) throws SQLException {
        PreparedStatement pre=con.prepareStatement("INSERT INTO `contact` (`id_ct`, `id`, `date_ct`, `etat_ct`, `description_ct`, `reponse_ct`)  VALUES (NULL, ?,?,?,?,?);");
    pre.setInt(1, 2);
    pre.setDate(2, (java.sql.Date) (Date) c.getDate_ct());
    pre.setByte(3, c.getEtat_ct());
    pre.setString(4, c.getDescription_ct());
    pre.setString(5,c.getReponse_ct());
    pre.executeUpdate();
        System.out.println("ct  ajoutée");
    }

    @Override
    public void delete(byte etat) throws SQLException {
                PreparedStatement pre=con.prepareStatement("DELETE FROM `contact` WHERE `contact`.`etat_ct` = ?");
        pre.setInt(1, 1);
              pre.execute();
            System.out.println("ct supprimée");
    }

    @Override
    public List<contact> readAll() throws SQLException {
            List<contact> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from contact");
     while (rs.next()) {                
               int id=rs.getInt(1);
               Date date=rs.getDate(3);
               byte etat=rs.getByte(4);
               String desc=rs.getString(5);
               String reponse=rs.getString(6);
             
               contact c = new contact(id, date, etat, desc, reponse);
     arr.add(c);
     }
    return arr;
    }
}