package com.flights.service;

import com.flights.dao.FlightRepository;
import com.flights.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImp implements FlightService {

    private FlightRepository flightRepository;

    @Autowired
    public FlightServiceImp(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<Flight> findAll() {
        return flightRepository.findAll();
    }

    @Override
    public Flight findById(int theId) {
        Optional<Flight> result = flightRepository.findById(theId);

        Flight theFlight = null;

        if (result.isPresent()) {
            theFlight = result.get();
        } else {
            throw new RuntimeException("did not find Flight id of : " + theId);
        }
        return theFlight;
    }


    @Override
    public void save(Flight thEmployee) {
        flightRepository.save(thEmployee);

    }

    @Override
    public void deleteById(int theId) {
        flightRepository.deleteById(theId);

    }
}
