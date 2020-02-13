/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kids.project.Iservices;

import Kids.project.entities.reclamations;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author admin
 * @param <R>
 */
public interface Iservices_reclamations<R> {
    void ajouter(R r) throws SQLException;
    void delete(byte etat) throws SQLException;
    List<R> readAll() throws SQLException;
    reclamations chercherRec(Byte etat)throws SQLException;
    
}