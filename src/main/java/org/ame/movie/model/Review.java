package org.ame.movie.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Review extends PanacheEntity {

    public int rating;
    public String comment;

    @ManyToOne
    @JsonBackReference  // Corta la recursividad aquí
    public Movie movie;

    @ManyToOne
    @JsonBackReference  // Corta la recursividad aquí también
    public Critic critic;
}
