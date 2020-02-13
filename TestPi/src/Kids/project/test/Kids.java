/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kids.project.test;

import Kids.project.entities.avis;
import Kids.project.entities.contact;
import Kids.project.entities.feedback;
import Kids.project.entities.reclamations;
import Kids.project.services.services_avis;
import Kids.project.services.services_contact;
import Kids.project.services.services_feedback;
import Kids.project.services.services_reclamations;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class Kids {

    public static void main(String[] args) throws SQLException {
        Byte n = 1;
        Byte z = 0;
        Byte etat = 0;
//        String d = "2020-02-12";
        java.util.Date utileDate = new java.util.Date();
        java.sql.Date date = new java.sql.Date(utileDate.getTime());
        services_feedback ser = new services_feedback();
        services_avis serA = new services_avis();
        services_reclamations serR = new services_reclamations();
        services_feedback serF = new services_feedback();
        services_contact serC = new services_contact();

        //feedback feed = new feedback("Mariem", "Sayda");
        avis a = new avis(date, "bonne", "hgjh");
        feedback f = new feedback("bonne", n, "okk");
        reclamations r = new reclamations(date, n, "aa", "bb");
        contact c = new contact(date, n, "j'ai un prob", "ok on va trouvé une solution");

        try {
            
//              List<avis> list = serA.readAll();
//            System.out.println(list);
//            serA.ajouter(a);
//            List<feedback> list1 =serF.readAll();
//            System.out.println(list1);
//            ser.ajouter(f);
            serC.ajouter(c);
//            serR.ajouter(r);
//            serR.delete(n);
//            serC.delete(n);
//             List<reclamations> list2 = serR.readAll();
//            System.out.println(list2);
//            List<contact> list3 = serA.readAll();
//            System.out.println(list3);
            List<contact> list3 = serC.readAll();
            System.out.println(list3);

            System.out.println( serR.chercherRec(n));
//            serA.delete(d);

            //ser.ajouter(feed);
            // serV.ajouter(a);}
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

}
