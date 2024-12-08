package com.miliancode.autofleet.model;

public class Reservation {

    private enum State {
        CONFIRMED,
        CANCELLED,
        NO_SHOW,
        SHOW
    }
}
