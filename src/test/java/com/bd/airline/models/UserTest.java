package com.bd.airline.models;

import com.bd.airline.model.User;
import com.bd.airline.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserRepository repository;

    @Test
    @Transactional
    public void createAndGetUser() {
        User user = new User();
        user.setUsername("Johndoe");
        user.setPassword("johndoepassword");
        user = repository.save(user);
        Optional<User> userTemp = repository.findById(user.getId());
        assertEquals("Johndoe", userTemp.get().getUsername());
        assertEquals("johndoepassword", userTemp.get().getPassword());
    }
}
