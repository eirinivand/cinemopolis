package renee.cinemopolis.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import renee.cinemopolis.model.Ticket;
import renee.cinemopolis.model.Wishlist;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-14T18:59:49")
@StaticMetamodel(CMember.class)
public class CMember_ { 

    public static volatile SingularAttribute<CMember, Wishlist> wId;
    public static volatile CollectionAttribute<CMember, Ticket> ticketCollection;
    public static volatile SingularAttribute<CMember, String> pass;
    public static volatile SingularAttribute<CMember, Integer> mId;
    public static volatile CollectionAttribute<CMember, Wishlist> wishlistCollection;
    public static volatile SingularAttribute<CMember, String> username;

}