package com.example.demo.controllers;

import com.example.demo.entities.Flight;
import com.example.demo.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/flights")
    public ResponseEntity<?> saveFlight(@RequestBody FlightInput flight) {
        try {
            return new ResponseEntity<>(flightService.saveFlight(flight), HttpStatus.OK);
        }catch (SQLException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Read operation
    @GetMapping("/flights")
    public ResponseEntity<List<Flight>> getFlightList() {
        return new ResponseEntity<>(flightService.getFlightList(), HttpStatus.OK);
    }

    // Update operation
    @PutMapping("/flights/{id}")
    public ResponseEntity<?> updateFlight(@RequestBody FlightInput flight, @PathVariable("id") Long id) {

        try {
            return new ResponseEntity<>(flightService.updateFlight(flight, id), HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Delete operation
    @DeleteMapping("/flights/{id}")
    public ResponseEntity<String> deleteFlightById(@PathVariable("id") Long id) {

        flightService.deleteDepartmentById(id);
        return new ResponseEntity<>( "Deleted Successfully", HttpStatus.OK);
    }
}
