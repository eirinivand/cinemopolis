/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renee.cinemopolis.ejb;

import java.util.List;
import javax.ejb.Local;
import renee.cinemopolis.model.ProjectionRoom;

/**
 *
 * @author Renee
 */
@Local
public interface ProjectionRoomFacadeLocal {

    void create(ProjectionRoom projectionRoom);

    void edit(ProjectionRoom projectionRoom);

    void remove(ProjectionRoom projectionRoom);

    ProjectionRoom find(Object id);

    List<ProjectionRoom> findAll();

    List<ProjectionRoom> findRange(int[] range);

    int count();

}
