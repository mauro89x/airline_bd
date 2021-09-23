package com.bd.airline.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "airplane") //Puedo especificar esquema, constraints, si utilizo indices
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_airplane")
    private Long id;

    @Column(name="mark", insertable = true, length = 50, nullable = false,
            table = "airplane", updatable = true, unique = false)
    private String mark;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false, updatable = false, unique = true)
    private String numberOfRegistration;

    @Column
    private int yearsInService;

    @Column(nullable = false)
    private int numberOfSeats;

    @JsonIgnore
    @OneToMany(mappedBy = "airplane", fetch = FetchType.LAZY, cascade = {}, orphanRemoval = false)
    private List<Flight> flights;

    @Version
    @Column(name = "version")
    private int version;

    public Airplane(){
    }

    public Airplane(String mark, String model, String numberOfRegistration, int yearsInService, int numberOfSeats){
        this.mark = mark;
        this.model = model;
        this.numberOfRegistration = numberOfRegistration;
        this.yearsInService = yearsInService;
        this.numberOfSeats = numberOfSeats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumberOfRegistration() {
        return numberOfRegistration;
    }

    public void setNumberOfRegistration(String numberOfRegistration) {
        this.numberOfRegistration = numberOfRegistration;
    }

    public int getYearsInService() {
        return yearsInService;
    }

    public void setYearsInService(int yearsInService) {
        this.yearsInService = yearsInService;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
