package com.example.RegisterLogin.Dto;

import jakarta.persistence.Column;

public class GuestDTO {
    private int guestid;
    private String guestname;
    private String email;
    private String password;

    public GuestDTO() {
    }
    public GuestDTO(int guestid, String guestname, String email, String password) {
        this.guestid = guestid;
        this.guestname = guestname;
        this.email = email;
        this.password = password;
    }

    public int getGuestid() {
        return guestid;
    }

    public void setGuestid(int guestid) {
        this.guestid = guestid;
    }

    public String getGuestname() {
        return guestname;
    }

    public void setGuestname(String guestname) {
        this.guestname = guestname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "GuestDTO{" +
                "guestid=" + guestid +
                ", guestname='" + guestname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
