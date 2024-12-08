package com.miliancode.autofleet.model;

public class Vehicle {
    private Long id;
    private String make;
    private String model;
    private String yearOfManufacture;
    //unique
    private String VIN;
    private String SIPP;
    private Long odometer;

    private Status status;
    private Transmission transmissionType;
    private PetrolType petrolType;

    private FleetCompany fleetCompany;

    private boolean isDeleted;

    private enum Status {
        ON_RESERVATION,
        ON_RENT,
        ON_SERVICE,
        ON_BLOCK
    }

    private enum Transmission {
        MANUAL,
        AUTOMATIC
    }

    private enum PetrolType {
        DIESEL,
        GASOLINE
    }
}
