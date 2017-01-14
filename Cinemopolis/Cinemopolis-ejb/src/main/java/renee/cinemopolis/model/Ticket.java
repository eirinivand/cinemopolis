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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Renee
 */
@Entity
@Table(name = "ticket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ticket.findAll", query = "SELECT t FROM Ticket t"),
    @NamedQuery(name = "Ticket.findByTickId", query = "SELECT t FROM Ticket t WHERE t.tickId = :tickId")})
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tick_id")
    private Integer tickId;
    @JoinColumn(name = "movie_id", referencedColumnName = "movie_id")
    @ManyToOne
    private Movie movieId;
    @JoinColumn(name = "m_id", referencedColumnName = "m_id")
    @ManyToOne
    private CMember mId;

    public Ticket() {
    }

    public Ticket(Integer tickId) {
        this.tickId = tickId;
    }

    public Integer getTickId() {
        return tickId;
    }

    public void setTickId(Integer tickId) {
        this.tickId = tickId;
    }

    public Movie getMovieId() {
        return movieId;
    }

    public void setMovieId(Movie movieId) {
        this.movieId = movieId;
    }

    public CMember getMId() {
        return mId;
    }

    public void setMId(CMember mId) {
        this.mId = mId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tickId != null ? tickId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ticket)) {
            return false;
        }
        Ticket other = (Ticket) object;
        if ((this.tickId == null && other.tickId != null) || (this.tickId != null && !this.tickId.equals(other.tickId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "renee.cinemopolis.model.Ticket[ tickId=" + tickId + " ]";
    }

}
