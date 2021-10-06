package com.bd.airline.services;

import com.bd.airline.model.*;

import java.util.Date;
import java.util.List;

public interface AirportService {

    /*
    * Los siguientes metodos se utilizaron en la clase de ejemplo
    * Son libres de modificacion para completar con la implementacion de la solucion
     */

    Airplane createAirplane(Airplane airplane);

    Airplane getAirplaneWithID(long i);

    Airplane updateAirplane(Airplane airplane);

    boolean deleteAirplane(Airplane airplane);

    Flight createFlight(Flight flight);

    Flight getFlightWithID(long id);

    Flight updateFlight(Flight flight);

    Object deleteFlight(Flight flight);

    Flight getFlightWithNumber(long number);

    List<Flight> getFlightsByAirplaneID(long id);

    User createUser(User user);

    User getUserByID(long id);

    User updateUser(User user);

    User getUserByUsername(String username);

    User getUserByEmail(String email);

    boolean deleteUser(User user);
    /*
     * METODOS A IMPLEMENTAR
     * Es probable que para implementar ciertas funcionalidades necesiten de mas metodos,
     * por lo que sientanse libre de agregar o quitar metodos segun les paresca, siempre
     * que cumplan con las funcionalidades
     */
 /*
    ##### DONE #####
    User createUser(User user); --> done
    User getUserByID(long id); --> done
    User updateUser(User user); --> done
    User getUserByUsername(String username); --> done
    User getUserByEmial(String email); --> done
    boolean deleteUser(User user); --> done
    #### DONE #####



    Reservation createReservation(Reservation reservation, List<Passenger> passengers);

    Reservation updateReservation(Reservation reservation);

    boolean addPassengerToReservation(Passenger passenger);

    boolean getReservationById(long id);

    boolean deleteReservation(Reservation reservation);

    List<Reservation> getListOfReservationBetweenDates(Date start, Date finish);

    List<Flight> getFlightsInDate(Date date);

    // Aquellos vuelos de ese dia que tienen lugares vacios
    List<Flight> getFlightsNoCompleteInDate(Date date);

    Flight assignPilotToFlightID(long idFlight, Pilot pilot);

    Passenger createPassenger(Passenger passenger);

    Passenger updatePassenger(Passenger passenger);

    Passenger getPassengerByID(long id);

    Passenger getPassengerByDNI(String dni);

    Pilot createPilot(Pilot pilot);

    Pilot updatePilot(Pilot pilot);

    Pilot getPilotByDNI(String dni);

    Pilot getPilotWihMaxFlights();

    Route createRoute(Route route);

    boolean changePriceOfRouteID(long id, float newPrice);

    List<HistoricalPrice> getHistoricalPricesOfRoute(Route route);

    //Retorna todos los precios de rutas de un origen a un destino con la fecha de proximos vuelo
    // Recomendacion: Usar un DTO
    List<Object> nextFlightAndPrices(String start, String destiny);

    //Retorna el vuelo la ruta mas barata entre dos destinos
    Route minPriceRouteBetween(String start, String destiny);

    */

}
