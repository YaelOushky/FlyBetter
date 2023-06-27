package com.flights.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="origin")
    private String origin;

    @Column(name="destination")
    private String destination;

    @Column(name="flight_number")
    private String flightNumber;

    @Column(name="operating_carrier_code")
    private String operatingCarrierCode;

    @Column(name="departure_date")
    private String departureDate;

    public Flight() {
    }

    public Flight(int id, String origin, String destination, String flightNumber, String operatingCarrierCode, String departureDate) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.operatingCarrierCode = operatingCarrierCode;
        this.departureDate = departureDate;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", operatingCarrierCode='" + operatingCarrierCode + '\'' +
                ", departureDate='" + departureDate + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOperatingCarrierCode() {
        return operatingCarrierCode;
    }

    public void setOperatingCarrierCode(String operatingCarrierCode) {
        this.operatingCarrierCode = operatingCarrierCode;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }
}
