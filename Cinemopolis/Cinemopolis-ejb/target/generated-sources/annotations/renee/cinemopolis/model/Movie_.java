package renee.cinemopolis.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import renee.cinemopolis.model.Cinema;
import renee.cinemopolis.model.ProjectionRoom;
import renee.cinemopolis.model.Ticket;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-14T21:55:25")
@StaticMetamodel(Movie.class)
public class Movie_ { 

    public static volatile SingularAttribute<Movie, String> actors;
    public static volatile CollectionAttribute<Movie, ProjectionRoom> projectionRoomCollection;
    public static volatile SingularAttribute<Movie, String> movie;
    public static volatile CollectionAttribute<Movie, Ticket> ticketCollection;
    public static volatile SingularAttribute<Movie, String> director;
    public static volatile CollectionAttribute<Movie, Cinema> cinemaCollection;
    public static volatile SingularAttribute<Movie, Integer> movieId;
    public static volatile SingularAttribute<Movie, String> details;

}