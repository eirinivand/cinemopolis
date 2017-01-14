/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renee.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Renee
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(renee.service.CinemaFacadeREST.class);
        resources.add(renee.service.DateFacadeREST.class);
        resources.add(renee.service.MemberFacadeREST.class);
        resources.add(renee.service.MovieFacadeREST.class);
        resources.add(renee.service.ProjectionRoomFacadeREST.class);
        resources.add(renee.service.SeatFacadeREST.class);
        resources.add(renee.service.TicketFacadeREST.class);
        resources.add(renee.service.WishlistFacadeREST.class);
    }

}
