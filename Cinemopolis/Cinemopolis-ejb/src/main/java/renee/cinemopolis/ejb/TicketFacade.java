/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renee.cinemopolis.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import renee.cinemopolis.model.Ticket;

/**
 *
 * @author Renee
 */
@Stateless
public class TicketFacade extends AbstractFacade<Ticket> implements TicketFacadeLocal {

    @PersistenceContext(unitName = "renee_Cinemopolis-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TicketFacade() {
        super(Ticket.class);
    }

}
