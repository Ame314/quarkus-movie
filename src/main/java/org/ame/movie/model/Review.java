package org.ame.movie.model;

import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String content;
    public int rating;

    @ManyToOne
    public Movie movie;

    @ManyToOne
    public Critic critic;
}
