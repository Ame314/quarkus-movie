package org.ame.movie.repository;

import org.ame.movie.model.Movie;

import org.ame.movie.model.Movie;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface MovieRepository extends PanacheRepository<Movie> {
    // Additional query methods can be defined here if needed
}