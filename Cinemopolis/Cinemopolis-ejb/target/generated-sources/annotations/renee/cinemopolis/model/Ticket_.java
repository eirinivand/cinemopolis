package renee.cinemopolis.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import renee.cinemopolis.model.CMember;
import renee.cinemopolis.model.Movie;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-14T18:59:48")
@StaticMetamodel(Ticket.class)
public class Ticket_ { 

    public static volatile SingularAttribute<Ticket, Integer> tickId;
    public static volatile SingularAttribute<Ticket, CMember> mId;
    public static volatile SingularAttribute<Ticket, Movie> movieId;

}