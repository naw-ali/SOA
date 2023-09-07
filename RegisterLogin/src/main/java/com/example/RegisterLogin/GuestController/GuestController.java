package com.example.RegisterLogin.GuestController;

import com.example.RegisterLogin.Dto.GuestDTO;
import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Service.GuestService;
import com.example.RegisterLogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/guest") //api/v1/guest = mainurl of api
public class GuestController {

    @Autowired
    private GuestService guestService;
    @PostMapping(path = "/save")
    public String saveGuest(@RequestBody GuestDTO guestDTO)
    {
        String id = guestService.addGuest(guestDTO);
        return id;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginGuest(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = guestService.loginGuest(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}
