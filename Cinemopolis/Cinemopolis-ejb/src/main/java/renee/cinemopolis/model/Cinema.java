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
import javax.persistence.ManyToMany;
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
@Table(name = "cinema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cinema.findAll", query = "SELECT c FROM Cinema c"),
    @NamedQuery(name = "Cinema.findByCinId", query = "SELECT c FROM Cinema c WHERE c.cinId = :cinId"),
    @NamedQuery(name = "Cinema.findByName", query = "SELECT c FROM Cinema c WHERE c.name = :name"),
    @NamedQuery(name = "Cinema.findByAddress", query = "SELECT c FROM Cinema c WHERE c.address = :address"),
    @NamedQuery(name = "Cinema.findByTown", query = "SELECT c FROM Cinema c WHERE c.town = :town")})
public class Cinema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cin_id")
    private Integer cinId;
    @Size(max = 50)
    @Column(name = "name")
    private String name;
    @Size(max = 56)
    @Column(name = "address")
    private String address;
    @Size(max = 56)
    @Column(name = "town")
    private String town;
    @ManyToMany(mappedBy = "cinemaCollection")
    private Collection<Movie> movieCollection;
    @OneToMany(mappedBy = "cinId")
    private Collection<ProjectionRoom> projectionRoomCollection;

    public Cinema() {
    }

    public Cinema(Integer cinId) {
        this.cinId = cinId;
    }

    public Integer getCinId() {
        return cinId;
    }

    public void setCinId(Integer cinId) {
        this.cinId = cinId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @XmlTransient
    public Collection<Movie> getMovieCollection() {
        return movieCollection;
    }

    public void setMovieCollection(Collection<Movie> movieCollection) {
        this.movieCollection = movieCollection;
    }

    @XmlTransient
    public Collection<ProjectionRoom> getProjectionRoomCollection() {
        return projectionRoomCollection;
    }

    public void setProjectionRoomCollection(Collection<ProjectionRoom> projectionRoomCollection) {
        this.projectionRoomCollection = projectionRoomCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cinId != null ? cinId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cinema)) {
            return false;
        }
        Cinema other = (Cinema) object;
        if ((this.cinId == null && other.cinId != null) || (this.cinId != null && !this.cinId.equals(other.cinId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "renee.cinemopolis.model.Cinema[ cinId=" + cinId + " ]";
    }

}
