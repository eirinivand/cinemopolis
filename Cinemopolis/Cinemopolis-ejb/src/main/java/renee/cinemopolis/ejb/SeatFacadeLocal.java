/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renee.cinemopolis.ejb;

import java.util.List;
import javax.ejb.Local;
import renee.cinemopolis.model.Seat;

/**
 *
 * @author Renee
 */
@Local
public interface SeatFacadeLocal {

    void create(Seat seat);

    void edit(Seat seat);

    void remove(Seat seat);

    Seat find(Object id);

    List<Seat> findAll();

    List<Seat> findRange(int[] range);

    int count();

}
