package renee.cinemopolis.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import renee.cinemopolis.model.Movie;
import renee.cinemopolis.model.ProjectionRoom;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-14T21:55:25")
@StaticMetamodel(Cinema.class)
public class Cinema_ { 

    public static volatile CollectionAttribute<Cinema, ProjectionRoom> projectionRoomCollection;
    public static volatile SingularAttribute<Cinema, String> address;
    public static volatile SingularAttribute<Cinema, String> town;
    public static volatile CollectionAttribute<Cinema, Movie> movieCollection;
    public static volatile SingularAttribute<Cinema, Integer> cinId;
    public static volatile SingularAttribute<Cinema, String> name;

}