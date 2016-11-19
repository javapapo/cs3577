package com.javapapo.week4swarm.rest;

import com.javapapo.week4swarm.model.Person;
import com.javapapo.week4swarm.service.PersonService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/person")
public class PersonEndpoint {

    @Inject
    private PersonService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Person getPerson(@PathParam("id") long id) {
        return service.getPerson(id).orElseThrow(IllegalStateException::new);
    }
}
