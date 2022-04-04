package by.epamtc.pashun.hotel.bean;

import java.sql.Date;
import java.util.Objects;

public class Reservation {

    private static final long serialVersionUID = 11140L;

    private int reservationId;
    private Date reservationDate;
    private Date startDate;
    private Date endDate;
    private String clientComment;
    private String adminComment;
    private int userId;
    private int roomId;
    private int paymentId;
    private ReservationStatus status;

    public Reservation() {
    }

    public Reservation(int reservationId, Date reservationDate, Date startDate, Date endDate, String clientComment,
                       String adminComment, int userId, int roomId, int paymentId, ReservationStatus status) {
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.clientComment = clientComment;
        this.adminComment = adminComment;
        this.userId = userId;
        this.roomId = roomId;
        this.paymentId = paymentId;
        this.status = status;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getClientComment() {
        return clientComment;
    }

    public void setClientComment(String clientComment) {
        this.clientComment = clientComment;
    }

    public String getAdminComment() {
        return adminComment;
    }

    public void setAdminComment(String adminComment) {
        this.adminComment = adminComment;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public ReservationStatus getReservationStatus() {
        return status;
    }

    public void setReservationStatus(ReservationStatus status) {
        this.status = status;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "[reservationId=" + reservationId +
                ", reservationDate=" + reservationDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", clientComment='" + clientComment +
                ", adminComment='" + adminComment +
                ", userId=" + userId +
                ", roomId=" + roomId +
                ", paymentId=" + paymentId +
                ", status=" + status +
                ']';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReservationId(), getReservationDate(), getStartDate(), getEndDate(), getClientComment(),
                getAdminComment(), getUserId(), getRoomId(), getPaymentId(), getReservationStatus());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Reservation reservation = (Reservation) obj;
        return reservationId == reservation.getReservationId() && userId == reservation.getUserId() &&
                roomId == reservation.getRoomId() && paymentId == reservation.getPaymentId() && (reservationDate != null && reservationDate.equals(reservation.getReservationDate())) &&
                (startDate != null && startDate.equals(reservation.getStartDate())) && (endDate != null && endDate.equals(reservation.getEndDate())) &&
                clientComment.equals(reservation.getClientComment()) && adminComment.equals(reservation.getAdminComment()) &&
                (status != null && status.equals(reservation.getReservationStatus()));
    }
}
