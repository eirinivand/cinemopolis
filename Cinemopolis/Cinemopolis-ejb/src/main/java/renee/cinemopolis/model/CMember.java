/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renee.cinemopolis.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Renee
 */
@Entity
@Table(name = "member")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CMember.findAll", query = "SELECT c FROM CMember c"),
    @NamedQuery(name = "CMember.findByMId", query = "SELECT c FROM CMember c WHERE c.mId = :mId"),
    @NamedQuery(name = "CMember.findByPass", query = "SELECT c FROM CMember c WHERE c.pass = :pass"),
    @NamedQuery(name = "CMember.findByUsername", query = "SELECT c FROM CMember c WHERE c.username = :username")})
public class CMember implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "m_id")
    private Integer mId;
    @Size(max = 56)
    @Column(name = "pass")
    private String pass;
    @Size(max = 24)
    @Column(name = "username")
    private String username;
    @OneToMany(mappedBy = "mId")
    private Collection<Ticket> ticketCollection;
    @OneToMany(mappedBy = "mId")
    private Collection<Wishlist> wishlistCollection;
    @JoinColumn(name = "w_id", referencedColumnName = "w_id")
    @ManyToOne
    private Wishlist wId;

    public CMember() {
    }

    public CMember(Integer mId) {
        this.mId = mId;
    }

    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @XmlTransient
    public Collection<Ticket> getTicketCollection() {
        return ticketCollection;
    }

    public void setTicketCollection(Collection<Ticket> ticketCollection) {
        this.ticketCollection = ticketCollection;
    }

    @XmlTransient
    public Collection<Wishlist> getWishlistCollection() {
        return wishlistCollection;
    }

    public void setWishlistCollection(Collection<Wishlist> wishlistCollection) {
        this.wishlistCollection = wishlistCollection;
    }

    public Wishlist getWId() {
        return wId;
    }

    public void setWId(Wishlist wId) {
        this.wId = wId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mId != null ? mId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CMember)) {
            return false;
        }
        CMember other = (CMember) object;
        if ((this.mId == null && other.mId != null) || (this.mId != null && !this.mId.equals(other.mId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "renee.cinemopolis.model.CMember[ mId=" + mId + " ]";
    }

}
