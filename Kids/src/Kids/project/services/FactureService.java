/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kids.project.services;

import Kids.project.entities.Facture;
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
 * @author Youssef Mimouni
 */
public class FactureService {

    private Connection con;
    private Statement ste;

    public FactureService() {
        con = DataBase.getInstance().getConnection();
    }

    public int ajouterfacture(Facture f) throws SQLException {
        
        ste = con.createStatement();
        String pre = "INSERT INTO `facture` (`id_facture`,`total`, `date_facture`,`id_enf`,`id_parent`,`paye`) VALUES (null,'"+ f.getTotal()+"','"+ f.getDate_facture()+"',1,1,0);";
        /*pre.setDouble(1, f.getTotal());
        pre.setDate(2, f.getDate_facture());
        pre.setInt(3, 1);
        pre.setInt(4, 1);
        pre.setBoolean(5, f.getpaye());*/
        long lastInsertedID = ste.executeUpdate(pre, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = ste.getGeneratedKeys();
        while (rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    }

    public void deletefacture(Facture f) throws SQLException {
        PreparedStatement pstmt = con.prepareStatement("DELETE FROM `facture` WHERE `facture`.`id` = ?;");
        pstmt.setInt(1, f.getId_fact());
        pstmt.executeUpdate();

    }

    public List<Facture> readAllFacture() throws SQLException {
        List<Facture> listefature = new ArrayList<>();
        ste = con.createStatement();
        ResultSet rs = ste.executeQuery("select * from facture");
        while (rs.next()) {
            int id = rs.getInt("id_fact");
            Double total = rs.getDouble("total");
            Boolean paye = rs.getBoolean("paye");
            Facture f = new Facture(total, paye);
            f.setId_fact(id);
            listefature.add(f);
        }
        return listefature;
    }

    public void ajouterfrais_facture(int id_frais, int id_facture) throws SQLException {
        PreparedStatement pre = con.prepareStatement("INSERT INTO `frais_facture` (`id`, `id_facture`, `id_frais`) VALUES (NULL,?,?);");
        pre.setInt(1, id_facture);
        pre.setInt(2, id_frais);
        pre.executeUpdate();
    }
}
