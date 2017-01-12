package com.myproject.jersey.webapp.api;


import com.google.gson.Gson;
import com.myproject.jersey.webapp.model.Car;
import com.myproject.jersey.webapp.model.Truck;
import com.myproject.jersey.webapp.wrapper.Vehicles;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cars")
public class CarsAPI {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCarsInJSON() {

        Vehicles vehicles = new Vehicles();
        Car car = new Car("1234", "blue", 8000);
        Truck truck = new Truck("1234", "blue", 8000);
        vehicles.setCars(car);
        vehicles.setTruck(truck);

        Gson gson = new Gson();
        //return vehicles;
        return Response.status(Response.Status.OK).entity(gson.toJson(vehicles)).build();
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public void showData(String vehicles)
    {
        System.out.println("-----"+vehicles);
        //System.out.println("cuihj " + vehicles);
        //return
    }

}
