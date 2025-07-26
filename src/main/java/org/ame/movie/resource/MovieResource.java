package org.ame.movie.resource;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.PathParam;
import java.util.List;
import org.ame.movie.model.Movie;

@Path("/movies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieResource {

    @GET
    public List<Movie> getAllMovies() {
        return Movie.listAll();
    }

    @POST
    @Transactional
    public Response createMovie(Movie movie) {
        movie.persist();
        return Response.ok(movie).status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public Response deleteMovie(@PathParam("id") Long id) {
        boolean deleted = Movie.deleteById(id);
        return deleted ? Response.noContent().build() : Response.status(Response.Status.NOT_FOUND).build();
    }
}
