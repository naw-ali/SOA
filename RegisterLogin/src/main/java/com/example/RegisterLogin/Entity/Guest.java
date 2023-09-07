package com.example.RegisterLogin.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="guest")
public class Guest {
    @Id
    @Column(name="guest_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int guestid;
    @Column(name="guest_name", length = 255)
    private String guestname;
    @Column(name="email", length = 255)
    private String email;
    @Column(name="password", length = 255)
    private String password;
    public Guest() {
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

    public Guest(int guestid, String guestname, String email, String password) {
        this.guestid = guestid;
        this.guestname = guestname;
        this.email = email;
        this.password = password;
    }
}
