/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kids.project.services;

import Kids.project.Iservices.Iservices_feedback;
import Kids.project.entities.feedback;
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
 * @author admin
 */
public class services_feedback implements Iservices_feedback<feedback>{
    private final Connection con;
    private Statement ste;

    public services_feedback() {
        con = DataBase.getInstance().getConnection();}
 

    @Override
    public void ajouter(feedback f) throws SQLException {
    {
    PreparedStatement pre=con.prepareStatement("INSERT INTO `feedback` (`id_fd`, `id_enfant`, `description_fd`, `etat_fd`, `reponse_fd`, `id`) VALUES (NULL, ?,?,?,?,?);");
    pre.setInt(1, 1);
    pre.setString(2, f.getDescription_fd());
    pre.setByte(3, f.getEtat_fd());
    pre.setString(4,f.getReponse_fd());
    pre.setInt(5,1);
    pre.executeUpdate();
        System.out.println("feedback ajouté");
    }

    
}


    @Override
    public List<feedback> readAll() throws SQLException {
    List<feedback> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from feedback");
     while (rs.next()) {                
               String description_fd=rs.getString(3);
               Byte etat_fd=rs.getByte(4);
               String reponse_fd=rs.getString(5);
              
             
               feedback f=new feedback(description_fd, etat_fd, reponse_fd);
     arr.add(f);
     }
    return arr;
    }
}