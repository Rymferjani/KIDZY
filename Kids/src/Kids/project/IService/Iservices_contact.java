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
 * @param <C>
 */
public interface Iservices_contact<C> {
    void ajouter(C c) throws SQLException;
    void delete(byte etat) throws SQLException;
    List<C> readAll() throws SQLException;
}
