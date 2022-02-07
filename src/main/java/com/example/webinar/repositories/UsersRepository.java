package com.example.webinar.repositories;


import com.example.webinar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
