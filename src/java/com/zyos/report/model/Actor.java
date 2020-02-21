package com.zyos.report.model;
// Generated Feb 21, 2020 2:29:41 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Actor generated by hbm2java
 */
@Entity
@Table(name="actor"
    ,schema="public"
)
public class Actor  implements java.io.Serializable {


     private int actorId;
     private String firstName;
     private String lastName;
     private Date lastUpdate;
     private Set<FilmActor> filmActors = new HashSet<FilmActor>(0);

    public Actor() {
    }

	
    public Actor(int actorId, String firstName, String lastName, Date lastUpdate) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }
    public Actor(int actorId, String firstName, String lastName, Date lastUpdate, Set<FilmActor> filmActors) {
       this.actorId = actorId;
       this.firstName = firstName;
       this.lastName = lastName;
       this.lastUpdate = lastUpdate;
       this.filmActors = filmActors;
    }
   
     @Id 

    
    @Column(name="actor_id", unique=true, nullable=false)
    public int getActorId() {
        return this.actorId;
    }
    
    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    
    @Column(name="first_name", nullable=false, length=45)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="last_name", nullable=false, length=45)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", nullable=false, length=29)
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="actor")
    public Set<FilmActor> getFilmActors() {
        return this.filmActors;
    }
    
    public void setFilmActors(Set<FilmActor> filmActors) {
        this.filmActors = filmActors;
    }




}


