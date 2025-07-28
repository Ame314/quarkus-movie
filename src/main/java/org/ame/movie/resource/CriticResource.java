package org.ame.movie.resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.ame.movie.model.Critic;
import java.util.List;

@Path("/critics")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CriticResource {
    @GET
    public List<Critic> listAll() {
        return Critic.listAll();
    }
}