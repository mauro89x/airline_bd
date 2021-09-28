package com.bd.airline.models;

import com.bd.airline.model.Airplane;
import com.bd.airline.repositories.AirplaneRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

@SpringBootTest
public class AirplaneTest {

    @Autowired
    private AirplaneRepository repository;

    @Test
    public void testFind() throws Exception {
        Optional<Airplane> airplane = repository.findById(1L);
        assertNotNull(airplane);
    }

    @Test
    @Transactional
    public void testCreateAirplaneAndGetRemove() throws Exception {
        Airplane airplane = new Airplane();
        airplane.setMark("AAA-000");
        airplane.setModel("737");
        airplane.setVersion(0);
        airplane.setNumberOfRegistration("000001");
        airplane.setNumberOfSeats(190);
        airplane.setYearsInService(12);
        airplane = repository.save(airplane);
        Optional<Airplane> airplaneTemp = repository.findById(airplane.getId());
        assertEquals("737", airplaneTemp.get().getModel());
        assertEquals(190, airplane.getNumberOfSeats());
        assertEquals(0, airplaneTemp.get().getVersion());
        assertEquals(12, airplaneTemp.get().getYearsInService());
        repository.deleteById(airplaneTemp.get().getId());
    }
}
