/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renee.cinemopolis.ejb;

import java.util.List;
import javax.ejb.Local;
import renee.cinemopolis.model.Date;

/**
 *
 * @author Renee
 */
@Local
public interface DateFacadeLocal {

    void create(Date date);

    void edit(Date date);

    void remove(Date date);

    Date find(Object id);

    List<Date> findAll();

    List<Date> findRange(int[] range);

    int count();

}
