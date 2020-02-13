/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.project.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class connexion {


    public String url = "jdbc:mysql://localhost:3308/kidzy?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
    public String login = "root";
    public String pwd = "";
    public static connexion instance ;
    public Connection cnx ;
    private connexion() {
        try {
            
             cnx = DriverManager.getConnection(url, login, pwd);
            System.out.println("Connection etablie");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static connexion getInstance(){
        if (instance == null)
            instance= new connexion();
        return instance;
        
    }

    public Connection getCnx() {
        return cnx;
    }
    

}
