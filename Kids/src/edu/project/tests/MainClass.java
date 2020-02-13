package edu.project.tests;


import edu.project.entities.classe;
import edu.project.entities.garde;
import edu.project.entities.matiere;
import edu.project.entities.seance;
import edu.project.servicies.classeService;
import edu.project.servicies.gardeService;
import edu.project.utils.connexion;
import java.sql.SQLException;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MainClass {

   
    public static void main(String[] args) {

//        try {
//
        classeService cls = new classeService();
        classe p = new classe("wiouw","wiouww");
//            
////            cls.ajouterclasse(p);
//           
//            System.out.println(cls.afficherClasse());
////            cls.deleteclasse(p);
//            
////            System.out.println(cls.afficherClasse());
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        try{
            gardeService gser = new gardeService();
            garde g = new garde("kk",3.0,"tt");
            
            gser.ajoutergarde(g);
           System.out.println(cls.RechercheClasse("aca"));
//            System.out.println(g.afficherGarde());
//            cls.deleteclasse(p);
            
//            System.out.println(cls.afficherClasse());
    
       }catch (SQLException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
 
       }
    }

        
}
