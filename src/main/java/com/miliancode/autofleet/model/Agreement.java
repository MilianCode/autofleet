package com.miliancode.autofleet.model;

import jakarta.persistence.ManyToMany;

import java.util.Date;

public class Agreement {
    private Long id;

    private String agreementNumber;
    private String misc;
    @ManyToMany
    private Vehicle vehicle;
    private Date dateOfPickup;
    private Date dateOfReturn;

    private double rentPrice;
    private double depositAmount;
    private double totalPrice;
}
