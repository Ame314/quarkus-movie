package org.ame.movie.repository;

import org.ame.movie.model.Review;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface ReviewRepository extends PanacheRepository<Review> {
}