/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kids.project.services;

import Kids.project.Iservices.Iservices_avis;
import Kids.project.Iservices.Iservices_feedback;
import Kids.project.entities.avis;
import Kids.project.utils.DataBase;
import java.sql.Connection;
import java.sql.Date;
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
public class services_avis implements Iservices_avis<avis>{
    private Connection con;
    private Statement ste; 
    
    public services_avis() {
        con = DataBase.getInstance().getConnection();
    }   

    @Override
    public void ajouter(avis a) throws SQLException {
    {
    PreparedStatement pre=con.prepareStatement("INSERT INTO `avis` (`id_avis`, `id`, `date_avis`, `description_avis`, `reponse_avis`) VALUES (NULL, ?,?,?,?);");
    pre.setInt(1, 1);
    pre.setDate(2, (Date) a.getDate_avis());
    pre.setString(3, a.getDescription_avis());
    pre.setString(4,a.getReponse_avis());
    pre.executeUpdate();
        System.out.println("avis ajouté");
    }  
  
}


    @Override
    public List<avis> readAll() throws SQLException {
    List<avis> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from avis");
     while (rs.next()) {                
               int id=rs.getInt(1);
               Date date=rs.getDate(3);
               String desc=rs.getString(4);
               String reponse=rs.getString(5);
             
               avis p=new avis(date, desc, reponse);
               p.setId_avis(id);
     arr.add(p);
     }
    return arr;
    }

//    @Override
//    public boolean delete(avis a) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    @Override
//    public boolean delete(avis a) throws SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }




    @Override
    public void delete(java.util.Date date) throws SQLException {
                PreparedStatement pre=con.prepareStatement("DELETE FROM `avis` WHERE `avis`.`date_avis` = ?");
        pre.setDate(3, (Date) date);
              pre.execute();
            System.out.println("avis supprimée");
    }

    @Override
    public void update(java.util.Date date) throws SQLException {
        PreparedStatement pre=con.prepareStatement("UPDATE FROM `avis` WHERE `avis`.`date_avis` = ?");
      pre.setDate(3, (Date) date);
              pre.execute();
            System.out.println("avis modifier");
    }
    
}
 