package com.bd.airline.services;

import com.bd.airline.model.*;
import com.bd.airline.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AirportServiceImpl implements AirportService {

    @Autowired
    private AirplaneRepository airplaneRepository;

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public Airplane createAirplane(Airplane airplane) {
        return this.airplaneRepository.save(airplane);
    }

    @Override
    @Transactional
    public Flight createFlight(Flight flight) {
        return this.flightRepository.save(flight);
    }

    @Override
    @Transactional(readOnly = true)
    public Flight getFlightWithID(long id) {
        Optional<Flight> flight = this.flightRepository.findById(id);
        return flight.orElse(null);
    }

    @Override
    @Transactional
    public Flight updateFlight(Flight flight) {
        return this.flightRepository.save(flight);
    }

    @Override
    @Transactional
    public Object deleteFlight(Flight flight) {
        try {
            this.flightRepository.delete(flight);
        } catch (Exception e){
            return e;
        }
        return true;
    }

    @Override
    @Transactional(readOnly = true)
    public Airplane getAirplaneWithID(long i) {
        Optional<Airplane> airplane = this.airplaneRepository.findById(i);
        return airplane.orElse(null);
    }

    @Override
    @Transactional
    public Airplane updateAirplane(Airplane airplane) {
        return this.airplaneRepository.save(airplane);
    }

    @Override
    @Transactional
    public boolean deleteAirplane(Airplane airplane) {
        try {
            this.airplaneRepository.deleteById(airplane.getId());
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    @Transactional(readOnly = true)
    public Flight getFlightWithNumber(long number) {
        return this.flightRepository.findByNumber(number).get(0);
    }

    @Override
    @Transactional
    public List<Flight> getFlightsByAirplaneID(long id) {
        Optional<Airplane> airplane = this.airplaneRepository.findById(id);
        List<Flight> flights = airplane.isPresent() ? airplane.get().getFlights() : null;
        return flights;
    }

    @Override
    @Transactional
    public User createUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserByID(long id) {
        Optional<User> user = this.userRepository.findById(id);
        return user.orElse(null);
    }

    @Override
    @Transactional
    public User updateUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    @Transactional
    public User getUserByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    @Transactional
    public User getUserByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    @Override
    @Transactional
    public boolean deleteUser(User user) {
        try{
            this.userRepository.deleteById(user.getId());
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }
}
