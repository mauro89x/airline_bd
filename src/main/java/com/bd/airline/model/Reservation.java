package com.bd.airline.model;

import java.util.Date;
import java.util.List;

public class Reservation {

    private Long id;

    private int numberOfReservation;

    private Date dateOfReservation;

    private List<Integer> numbersOfSeats;

    private boolean paid;

    private User user;

    private List<Passenger> passengers;

    private Flight flight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumberOfReservation() {
        return numberOfReservation;
    }

    public void setNumberOfReservation(int numberOfReservation) {
        this.numberOfReservation = numberOfReservation;
    }

    public Date getDateOfReservation() {
        return dateOfReservation;
    }

    public void setDateOfReservation(Date dateOfReservation) {
        this.dateOfReservation = dateOfReservation;
    }

    public List<Integer> getNumbersOfSeats() {
        return numbersOfSeats;
    }

    public void setNumbersOfSeats(List<Integer> numbersOfSeats) {
        this.numbersOfSeats = numbersOfSeats;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
