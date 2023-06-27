package com.flights.rest;

import com.flights.entity.Flight;
import com.flights.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightRestController {

    private FlightService flightService;

    @Autowired
    public FlightRestController(FlightService theFlightService) {this.flightService = theFlightService;}

    @GetMapping("/flights")
    public List<Flight> findAll() {
        System.out.println(flightService.findAll());
        return flightService.findAll();
    }
}
