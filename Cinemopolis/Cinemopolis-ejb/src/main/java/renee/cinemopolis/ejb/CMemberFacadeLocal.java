/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renee.cinemopolis.ejb;

import java.util.List;
import javax.ejb.Local;
import renee.cinemopolis.model.CMember;

/**
 *
 * @author Renee
 */
@Local
public interface CMemberFacadeLocal {

    void create(CMember cMember);

    void edit(CMember cMember);

    void remove(CMember cMember);

    CMember find(Object id);

    List<CMember> findAll();

    List<CMember> findRange(int[] range);

    int count();

}
