package com.myproject.jersey.webapp.api;


import com.myproject.jersey.webapp.model.Car;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/car")
public class CarAPI {

    // This method is called if XMLis request
    @GET
    @Produces( { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Car getXML() {
        Car car = new Car();
        car.setColor("Blue");
        car.setMiles(100);
        car.setVIN("1234");
        return car;
    }

    @POST
    @Produces( {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response postCar(Car car)
    {
        System.out.println(car.getMiles());

        return Response.ok().build();
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createCarJSON(Car car) {

        String result = "Track saved : " + car;
        return Response.status(201).entity(result).build();

    }
}