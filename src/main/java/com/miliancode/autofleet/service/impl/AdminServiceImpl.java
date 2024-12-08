package com.miliancode.autofleet.service.impl;

import com.miliancode.autofleet.model.Agreement;
import com.miliancode.autofleet.model.Reservation;
import com.miliancode.autofleet.model.User;
import com.miliancode.autofleet.model.Vehicle;
import com.miliancode.autofleet.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(Long userId, User updatedUser) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return null;
    }

    @Override
    public Vehicle updateVehicle(Long vehicleId, Vehicle updatedVehicle) {
        return null;
    }

    @Override
    public void deleteVehicle(Long vehicleId) {

    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return List.of();
    }

    @Override
    public Vehicle getVehicleById(Long vehicleId) {
        return null;
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation updateReservation(Long reservationId, Reservation reservation) {
        return null;
    }

    @Override
    public List<Reservation> getAllReservations() {
        return List.of();
    }

    @Override
    public Reservation getReservationById(Long reservationId) {
        return null;
    }

    @Override
    public void cancelReservation(Long reservationId) {

    }

    @Override
    public List<Agreement> getAllAgreements() {
        return List.of();
    }

    @Override
    public Agreement getAgreementById(Long agreementId) {
        return null;
    }

    @Override
    public void updateAgreementStatus(Long agreementId, String status) {

    }
}
