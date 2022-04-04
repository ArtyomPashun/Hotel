package by.epamtc.pashun.hotel.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum ReservationStatus {

    NEW(1, "new"),
    APPROVED(2, "approved"),
    DENIED(3, "denied"),
    PAYED(4, "payed");

    private static final Logger logger = LogManager.getLogger();

    private final int reservationStatusId;
    private final String reservationStatus;

    private ReservationStatus(int reservationStatusId, String reservationStatus) {
        this.reservationStatusId = reservationStatusId;
        this.reservationStatus = reservationStatus;
    }

    public int getReservationStatusId() {
        return reservationStatusId;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public static ReservationStatus getStatusById(int id) {

        for (ReservationStatus reservationStatus : ReservationStatus.values()) {
            if (reservationStatus.reservationStatusId == id) {
                return reservationStatus;
            }
        }
        logger.warn(String.format("ReservationStatus with id: %d is not found", id));
        throw new EnumConstantNotPresentException(UserRole.class, String.format("ReservationStatus with id: %d is not found", id));
    }
}
