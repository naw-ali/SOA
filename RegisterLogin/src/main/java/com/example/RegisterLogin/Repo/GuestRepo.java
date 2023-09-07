package com.example.RegisterLogin.Repo;

import com.example.RegisterLogin.Entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface GuestRepo extends JpaRepository<Guest,Integer> {
    Optional<Guest> findOneByEmailAndPassword(String email, String password);
    Guest findByEmail(String email);
}
