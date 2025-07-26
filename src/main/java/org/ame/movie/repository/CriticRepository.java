package org.ame.movie.repository;


import org.ame.movie.model.Critic;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface CriticRepository extends PanacheRepository<Critic> {
    // Additional query methods can be defined here if needed
}