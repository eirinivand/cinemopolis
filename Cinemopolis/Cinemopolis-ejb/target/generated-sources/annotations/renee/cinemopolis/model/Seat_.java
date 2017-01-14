package renee.cinemopolis.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import renee.cinemopolis.model.ProjectionRoom;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-14T18:59:49")
@StaticMetamodel(Seat.class)
public class Seat_ { 

    public static volatile SingularAttribute<Seat, Integer> number;
    public static volatile SingularAttribute<Seat, String> row;
    public static volatile SingularAttribute<Seat, ProjectionRoom> roomId;
    public static volatile SingularAttribute<Seat, Integer> sId;

}