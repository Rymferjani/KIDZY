/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kids.project.Iservices;


import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author admin
 */
public interface Iservices_feedback<F> {
    void ajouter(F f) throws SQLException;
     List<F> readAll() throws SQLException;
    
}
