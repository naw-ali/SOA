package com.example.RegisterLogin.Service;

import com.example.RegisterLogin.Dto.GuestDTO;
import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.response.LoginResponse;

public interface GuestService {
    String addGuest(GuestDTO guestDTO);

    LoginResponse loginGuest(LoginDTO loginDTO);
}
