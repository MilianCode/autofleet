package com.miliancode.autofleet.service;

import com.miliancode.autofleet.dto.user.UserRegistrationRequestDto;
import com.miliancode.autofleet.dto.user.UserResponseDto;
import com.miliancode.autofleet.model.Agreement;
import com.miliancode.autofleet.model.Reservation;
import com.miliancode.autofleet.model.User;
import com.miliancode.autofleet.model.Vehicle;

import java.util.List;

public interface AdminService {
    UserResponseDto createUser(UserRegistrationRequestDto dto);
    UserResponseDto updateUser(Long userId, User updatedUser);
    void deleteUser(Long userId);
    List<User> getAllUsers();
    User getUserById(Long userId);

    Vehicle createVehicle(Vehicle vehicle);
    Vehicle updateVehicle(Long vehicleId, Vehicle updatedVehicle);
    void deleteVehicle(Long vehicleId);
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleById(Long vehicleId);

    Reservation createReservation(Reservation reservation);
    Reservation updateReservation(Long reservationId, Reservation reservation);
    List<Reservation> getAllReservations();
    Reservation getReservationById(Long reservationId);
    void cancelReservation(Long reservationId);

    List<Agreement> getAllAgreements();
    Agreement getAgreementById(Long agreementId);
    void updateAgreementStatus(Long agreementId, String status);
}
