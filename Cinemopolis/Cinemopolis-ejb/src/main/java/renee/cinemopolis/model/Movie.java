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
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Renee
 */
@Entity
@Table(name = "movie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movie.findAll", query = "SELECT m FROM Movie m"),
    @NamedQuery(name = "Movie.findByMovie", query = "SELECT m FROM Movie m WHERE m.movie = :movie"),
    @NamedQuery(name = "Movie.findByMovieId", query = "SELECT m FROM Movie m WHERE m.movieId = :movieId"),
    @NamedQuery(name = "Movie.findByActors", query = "SELECT m FROM Movie m WHERE m.actors = :actors"),
    @NamedQuery(name = "Movie.findByDirector", query = "SELECT m FROM Movie m WHERE m.director = :director")})
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "movie")
    private String movie;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "movie_id")
    private Integer movieId;
    @Size(max = 1024)
    @Column(name = "actors")
    private String actors;
    @Size(max = 50)
    @Column(name = "director")
    private String director;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "details")
    private String details;
    @JoinTable(name = "mov_cin", joinColumns = {
        @JoinColumn(name = "movie_id", referencedColumnName = "movie_id")}, inverseJoinColumns = {
        @JoinColumn(name = "cin_id", referencedColumnName = "cin_id")})
    @ManyToMany
    private Collection<Cinema> cinemaCollection;
    @JoinTable(name = "roo_mov", joinColumns = {
        @JoinColumn(name = "movie_id", referencedColumnName = "movie_id")}, inverseJoinColumns = {
        @JoinColumn(name = "room_id", referencedColumnName = "room_id")})
    @ManyToMany
    private Collection<ProjectionRoom> projectionRoomCollection;
    @OneToMany(mappedBy = "movieId")
    private Collection<Ticket> ticketCollection;

    public Movie() {
    }

    public Movie(Integer movieId) {
        this.movieId = movieId;
    }

    public Movie(Integer movieId, String details) {
        this.movieId = movieId;
        this.details = details;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @XmlTransient
    public Collection<Cinema> getCinemaCollection() {
        return cinemaCollection;
    }

    public void setCinemaCollection(Collection<Cinema> cinemaCollection) {
        this.cinemaCollection = cinemaCollection;
    }

    @XmlTransient
    public Collection<ProjectionRoom> getProjectionRoomCollection() {
        return projectionRoomCollection;
    }

    public void setProjectionRoomCollection(Collection<ProjectionRoom> projectionRoomCollection) {
        this.projectionRoomCollection = projectionRoomCollection;
    }

    @XmlTransient
    public Collection<Ticket> getTicketCollection() {
        return ticketCollection;
    }

    public void setTicketCollection(Collection<Ticket> ticketCollection) {
        this.ticketCollection = ticketCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movieId != null ? movieId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movie)) {
            return false;
        }
        Movie other = (Movie) object;
        if ((this.movieId == null && other.movieId != null) || (this.movieId != null && !this.movieId.equals(other.movieId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "renee.cinemopolis.model.Movie[ movieId=" + movieId + " ]";
    }

}
