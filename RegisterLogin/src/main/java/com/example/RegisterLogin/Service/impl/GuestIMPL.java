package com.example.RegisterLogin.Service.impl;

import com.example.RegisterLogin.Dto.GuestDTO;
import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Entity.Guest;
import com.example.RegisterLogin.Repo.GuestRepo;
import com.example.RegisterLogin.Service.GuestService;
import com.example.RegisterLogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GuestIMPL implements GuestService {

    @Autowired
    private GuestRepo guestRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addGuest(GuestDTO guestDTO) {
        Guest guest = new Guest(
                guestDTO.getGuestid(),
                guestDTO.getGuestname(),
                guestDTO.getEmail(),
                this.passwordEncoder.encode(guestDTO.getPassword())
        );
        guestRepo.save(guest);
        return guest.getGuestname();
    }
    GuestDTO guestDTO;
    @Override
    public LoginResponse loginGuest(LoginDTO loginDTO) {
        String msg = "";
        Guest guest1 = guestRepo.findByEmail(loginDTO.getEmail());
        if (guest1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = guest1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Guest> guest = guestRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (guest.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }
    }
}
