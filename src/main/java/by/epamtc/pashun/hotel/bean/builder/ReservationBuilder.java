package by.epamtc.pashun.hotel.bean.builder;

import by.epamtc.pashun.hotel.bean.Reservation;
import by.epamtc.pashun.hotel.bean.ReservationStatus;

import java.sql.Date;

public class ReservationBuilder {

    private Reservation reservation;

    public ReservationBuilder() {
        reservation = new Reservation();
    }

    public ReservationBuilder withId(int id) {
        reservation.setReservationId(id);
        return this;
    }

    public ReservationBuilder withReservationDate(Date reservationDate) {
        reservation.setReservationDate(reservationDate);
        return this;
    }

    public ReservationBuilder withStartDate(Date startDate) {
        reservation.setStartDate(startDate);
        return this;
    }

    public ReservationBuilder withEndDate(Date endDate) {
        reservation.setEndDate(endDate);
        return this;
    }

    public ReservationBuilder withClientComment(String clientComment) {
        reservation.setClientComment(clientComment);
        return this;
    }

    public ReservationBuilder withAdminComment(String adminComment) {
        reservation.setAdminComment(adminComment);
        return this;
    }

    public ReservationBuilder withUserId(int userId) {
        reservation.setUserId(userId);
        return this;
    }

    public ReservationBuilder withRoomId(int roomId) {
        reservation.setRoomId(roomId);
        return this;
    }

    public ReservationBuilder withPaymentId(int paymentId) {
        reservation.setPaymentId(paymentId);
        return this;
    }

    public ReservationBuilder withReservationStatus(ReservationStatus status) {
        reservation.setReservationStatus(status);
        return this;
    }

    public Reservation build() {
        return reservation;
    }
}
