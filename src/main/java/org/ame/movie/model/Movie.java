package org.ame.movie.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Movie extends PanacheEntity {

    public String title;
    public String genre;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Set<Review> reviews;
}
