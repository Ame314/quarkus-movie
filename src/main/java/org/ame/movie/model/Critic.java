package org.ame.movie.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Critic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    @OneToMany(mappedBy = "critic", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Set<Review> reviews;
}
