package org.ame.movie.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Set;

@Entity
public class Critic extends PanacheEntity {

    public String name;

    @OneToMany(mappedBy = "critic", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference  // También evita recursividad aquí
    public Set<Review> reviews;
}
