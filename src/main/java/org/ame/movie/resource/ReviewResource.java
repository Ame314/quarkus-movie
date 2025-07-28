package org.ame.movie.resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.ame.movie.model.Review;
import java.util.List;

@Path("/reviews")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReviewResource {
    @GET
    public List<Review> listAll() {
        return Review.listAll();
    }
}