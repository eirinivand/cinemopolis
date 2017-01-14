package renee.cinemopolis.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import renee.cinemopolis.model.Cinema;
import renee.cinemopolis.model.Date;
import renee.cinemopolis.model.Movie;
import renee.cinemopolis.model.Seat;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-14T18:59:49")
@StaticMetamodel(ProjectionRoom.class)
public class ProjectionRoom_ { 

    public static volatile CollectionAttribute<ProjectionRoom, Movie> movieCollection;
    public static volatile CollectionAttribute<ProjectionRoom, Date> dateCollection;
    public static volatile SingularAttribute<ProjectionRoom, Cinema> cinId;
    public static volatile CollectionAttribute<ProjectionRoom, Seat> seatCollection;
    public static volatile SingularAttribute<ProjectionRoom, String> type;
    public static volatile SingularAttribute<ProjectionRoom, Integer> numOfRows;
    public static volatile SingularAttribute<ProjectionRoom, Integer> roomId;

}