package com.bd.airline.controllers;

import com.bd.airline.services.AirportService;
import com.bd.airline.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/apibd")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class AirlineController {

    @Autowired
    private AirportService service;

    @GetMapping(path = "/prueba")
    public String prueba() {
        return "OK!";
    }

    @GetMapping(path = "/airplanes/{id}")
    public Airplane getAirplane(@PathVariable long id) {
        return this.service.getAirplaneWithID(id);
    }

    @PostMapping(path = "/airplanes")
    public Airplane newAirplane(@RequestBody Airplane airplane) {
        return this.service.createAirplane(airplane);
    }

    @PutMapping(path = "/airplanes/{id}")
    public Airplane updateAirplane(@RequestBody Airplane airplane,@PathVariable long id){
        if(this.service.getAirplaneWithID(id) != null){
            return this.service.updateAirplane(airplane);
        }
        return null;
    }

    @DeleteMapping(path = "airplanes/{id}")
    public boolean deleteAirplane(@PathVariable long id){
        return this.service.deleteAirplane(this.service.getAirplaneWithID(id));
    }

    @GetMapping(path = "/flights/{id}")
    public Flight getFlight(@PathVariable long id) {
        return this.service.getFlightWithID(id);
    }

    @PostMapping(path = "/flights")
    public Flight newFlight(@RequestBody Flight flight){
        return this.service.createFlight(flight);
    }

    @PutMapping(path = "/flights/{id}")
    public Flight updateFlight(@RequestBody Flight flight, @PathVariable long id){
        if(this.service.getFlightWithID(id) != null) {
            return this.service.updateFlight(flight);
        }
        return null;
    }

    @DeleteMapping(path = "/flights/{id}")
    public Object deleteFlight(@PathVariable long id){
        return this.service.deleteFlight(this.service.getFlightWithID(id));
    }

    @GetMapping(path = "/flights/number/{number}")
    public Flight getFlightByNumber(@PathVariable long number) {
        return this.service.getFlightWithNumber(number);
    }

    @GetMapping(path = "airplanes/{id}/flights")
    public List<Flight> getFlightsByAirplaneID(@PathVariable long id){
        return this.service.getFlightsByAirplaneID(id);
    }
    @PostMapping(path = "/users")
    public User newUser(@RequestBody User user) {
        return this.service.createUser(user);
    }

    @GetMapping(path = "/users/{id}")
    public User getUser(@PathVariable long id) {
        return this.service.getUserByID(id);
    }

    @GetMapping(path = "/users/username/{username}")
    public User getUserByUsername(@PathVariable String username)  {
        return  this.service.getUserByUsername(username);
    }

    @GetMapping(path = "/users/email/{email}")
    public User getUserByEmail(@PathVariable String email)  {
        return  this.service.getUserByEmail(email);
    }

    @DeleteMapping(path = "/users/{id}")
    public Object deleteUser(@PathVariable long id){
        return this.service.deleteUser(this.service.getUserByID(id));
    }

    @PutMapping(path= "/users/{id}")
    public User updateUser(@RequestBody User user, @PathVariable long id){
        if(this.service.getUserByID(id) != null) {
            return this.service.updateUser(user);
        }
        return null;
    }
}
