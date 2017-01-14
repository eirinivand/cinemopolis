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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Renee
 */
@Entity
@Table(name = "wishlist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Wishlist.findAll", query = "SELECT w FROM Wishlist w"),
    @NamedQuery(name = "Wishlist.findByWId", query = "SELECT w FROM Wishlist w WHERE w.wId = :wId")})
public class Wishlist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "w_id")
    private Integer wId;
    @JoinColumn(name = "m_id", referencedColumnName = "m_id")
    @ManyToOne
    private CMember mId;
    @OneToMany(mappedBy = "wId")
    private Collection<CMember> cMemberCollection;

    public Wishlist() {
    }

    public Wishlist(Integer wId) {
        this.wId = wId;
    }

    public Integer getWId() {
        return wId;
    }

    public void setWId(Integer wId) {
        this.wId = wId;
    }

    public CMember getMId() {
        return mId;
    }

    public void setMId(CMember mId) {
        this.mId = mId;
    }

    @XmlTransient
    public Collection<CMember> getCMemberCollection() {
        return cMemberCollection;
    }

    public void setCMemberCollection(Collection<CMember> cMemberCollection) {
        this.cMemberCollection = cMemberCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wId != null ? wId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wishlist)) {
            return false;
        }
        Wishlist other = (Wishlist) object;
        if ((this.wId == null && other.wId != null) || (this.wId != null && !this.wId.equals(other.wId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "renee.cinemopolis.model.Wishlist[ wId=" + wId + " ]";
    }

}
