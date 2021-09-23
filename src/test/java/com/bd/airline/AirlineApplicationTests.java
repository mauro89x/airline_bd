package com.bd.airline;

import com.bd.airline.model.Airplane;
import com.bd.airline.model.Flight;
import com.bd.airline.services.AirportService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class AirlineApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void prueba() {
		System.out.println("OK!");
	}

}
