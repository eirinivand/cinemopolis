package renee.cinemopolis.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import renee.cinemopolis.model.CMember;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-14T21:55:25")
@StaticMetamodel(Wishlist.class)
public class Wishlist_ { 

    public static volatile SingularAttribute<Wishlist, Integer> wId;
    public static volatile CollectionAttribute<Wishlist, CMember> cMemberCollection;
    public static volatile SingularAttribute<Wishlist, CMember> mId;

}