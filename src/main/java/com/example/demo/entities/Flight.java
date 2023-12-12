package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FLIGHTS_SEQ")
    private Long id;
    @Column(name="carrier_code")
    private String carrierCode;
    @Column(name="number")
    private int number;
    @Column(name="flight_date")
    private Date date;
    @Column(name="origin")
    private String origin;
    @Column(name="destination")
    private String destination;

    public Flight() {
    }

    public Flight(String carrierCode, int number, Date date, String origin, String destination) {
        this.carrierCode = carrierCode;
        this.number = number;
        this.date = date;
        this.origin = origin;
        this.destination = destination;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
}
