/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renee.cinemopolis.model;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Renee
 */
@Entity
@Table(name = "date")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Date.findAll", query = "SELECT d FROM Date d"),
    @NamedQuery(name = "Date.findByDayPlayed", query = "SELECT d FROM Date d WHERE d.dayPlayed = :dayPlayed"),
    @NamedQuery(name = "Date.findByTimePlayed", query = "SELECT d FROM Date d WHERE d.timePlayed = :timePlayed"),
    @NamedQuery(name = "Date.findById", query = "SELECT d FROM Date d WHERE d.id = :id")})
public class Date implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "day_played")
    @Temporal(TemporalType.DATE)
    private java.util.Date dayPlayed;
    @Column(name = "time_played")
    @Temporal(TemporalType.TIME)
    private java.util.Date timePlayed;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "room_id", referencedColumnName = "room_id")
    @ManyToOne
    private ProjectionRoom roomId;

    public Date() {
    }

    public Date(Integer id) {
        this.id = id;
    }

    public java.util.Date getDayPlayed() {
        return dayPlayed;
    }

    public void setDayPlayed(java.util.Date dayPlayed) {
        this.dayPlayed = dayPlayed;
    }

    public java.util.Date getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(java.util.Date timePlayed) {
        this.timePlayed = timePlayed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProjectionRoom getRoomId() {
        return roomId;
    }

    public void setRoomId(ProjectionRoom roomId) {
        this.roomId = roomId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Date)) {
            return false;
        }
        Date other = (Date) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "renee.cinemopolis.model.Date[ id=" + id + " ]";
    }

}
