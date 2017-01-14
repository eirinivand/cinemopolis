/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renee.cinemopolis.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import renee.cinemopolis.model.Seat;

/**
 *
 * @author Renee
 */
@Stateless
public class SeatFacade extends AbstractFacade<Seat> implements SeatFacadeLocal {

    @PersistenceContext(unitName = "renee_Cinemopolis-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SeatFacade() {
        super(Seat.class);
    }

}
