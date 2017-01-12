package com.myproject.jersey.webapp.wrapper;

import com.myproject.jersey.webapp.model.Car;
import com.myproject.jersey.webapp.model.Truck;

import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;


@Produces("application/json")
@XmlRootElement

public class Vehicles {

    Car car;
    Truck truck;

    public Car getCar() {
        return car;
    }

    public void setCars(Car car) {
        this.car = car;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }


}
