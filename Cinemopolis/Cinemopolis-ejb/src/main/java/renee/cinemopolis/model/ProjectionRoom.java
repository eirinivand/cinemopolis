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
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
@Table(name = "projection_room")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProjectionRoom.findAll", query = "SELECT p FROM ProjectionRoom p"),
    @NamedQuery(name = "ProjectionRoom.findByRoomId", query = "SELECT p FROM ProjectionRoom p WHERE p.roomId = :roomId"),
    @NamedQuery(name = "ProjectionRoom.findByNumOfRows", query = "SELECT p FROM ProjectionRoom p WHERE p.numOfRows = :numOfRows")})
public class ProjectionRoom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "room_id")
    private Integer roomId;
    @Column(name = "num_of_rows")
    private Integer numOfRows;
    @Lob
    @Size(max = 65535)
    @Column(name = "type")
    private String type;
    @ManyToMany(mappedBy = "projectionRoomCollection")
    private Collection<Movie> movieCollection;
    @OneToMany(mappedBy = "roomId")
    private Collection<Date> dateCollection;
    @OneToMany(mappedBy = "roomId")
    private Collection<Seat> seatCollection;
    @JoinColumn(name = "cin_id", referencedColumnName = "cin_id")
    @ManyToOne
    private Cinema cinId;

    public ProjectionRoom() {
    }

    public ProjectionRoom(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(Integer numOfRows) {
        this.numOfRows = numOfRows;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlTransient
    public Collection<Movie> getMovieCollection() {
        return movieCollection;
    }

    public void setMovieCollection(Collection<Movie> movieCollection) {
        this.movieCollection = movieCollection;
    }

    @XmlTransient
    public Collection<Date> getDateCollection() {
        return dateCollection;
    }

    public void setDateCollection(Collection<Date> dateCollection) {
        this.dateCollection = dateCollection;
    }

    @XmlTransient
    public Collection<Seat> getSeatCollection() {
        return seatCollection;
    }

    public void setSeatCollection(Collection<Seat> seatCollection) {
        this.seatCollection = seatCollection;
    }

    public Cinema getCinId() {
        return cinId;
    }

    public void setCinId(Cinema cinId) {
        this.cinId = cinId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomId != null ? roomId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjectionRoom)) {
            return false;
        }
        ProjectionRoom other = (ProjectionRoom) object;
        if ((this.roomId == null && other.roomId != null) || (this.roomId != null && !this.roomId.equals(other.roomId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "renee.cinemopolis.model.ProjectionRoom[ roomId=" + roomId + " ]";
    }

}
