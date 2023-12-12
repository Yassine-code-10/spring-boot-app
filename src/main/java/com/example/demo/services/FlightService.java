package com.example.demo.services;

import com.example.demo.controllers.FlightInput;
import com.example.demo.entities.Flight;
import com.example.demo.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;


    public Flight saveFlight(FlightInput flight) throws SQLException {

                Flight f = new Flight();
                f.setCarrierCode(flight.getCarrierCode());
                f.setNumber(flight.getNumber());
                f.setDate(flight.getDate());
                f.setOrigin(flight.getOrigin());
                f.setDestination(f.getDestination());
                return flightRepository.save(f);
    }

    public List<Flight> getFlightList() {

        return (List<Flight>) flightRepository.findAll();
    }

    public Flight updateFlight(FlightInput flight, Long id) throws SQLException{

        Flight flightDB = flightRepository.findById(id).get();
        flightDB.setCarrierCode(flight.getCarrierCode());
        flightDB.setNumber(flight.getNumber());
        flightDB.setDate(flight.getDate());
        flightDB.setOrigin(flight.getOrigin());
        flightDB.setDestination(flight.getDestination());
        return flightRepository.save(flightDB);
    }

    public void deleteDepartmentById(Long id) {

        flightRepository.deleteById(id);
    }
}
