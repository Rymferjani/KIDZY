/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kids.project.Iservices;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author admin
 */
public interface Iservices_avis<A> {
    void ajouter(A a) throws SQLException;
    void delete(Date date) throws SQLException;
    void update(Date date) throws SQLException;
    List<A> readAll() throws SQLException;
}


