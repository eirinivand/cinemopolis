package renee.cinemopolis.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import renee.cinemopolis.model.ProjectionRoom;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-14T21:55:25")
@StaticMetamodel(Date.class)
public class Date_ { 

    public static volatile SingularAttribute<Date, Date> timePlayed;
    public static volatile SingularAttribute<Date, Integer> id;
    public static volatile SingularAttribute<Date, Date> dayPlayed;
    public static volatile SingularAttribute<Date, ProjectionRoom> roomId;

}