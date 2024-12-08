package com.miliancode.autofleet.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private User user;

    private String phoneNumber;
    private String address;

    private String driverLicenseNumber;
    private String driverLicenseCountry;
    private LocalDate driverLicenseExpiryDate;

    private String passportNumber;
    private String passportCountry;
    private LocalDate passportExpiryDate;
}
