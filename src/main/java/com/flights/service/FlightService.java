package com.flights.service;

import com.flights.entity.Flight;

import java.util.List;

public interface FlightService {

    public List<Flight> findAll();

    public Flight findById(int theId);

    public void save(Flight theFlight);

    public void deleteById(int theId);
}
