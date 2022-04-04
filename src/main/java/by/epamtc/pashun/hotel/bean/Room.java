package by.epamtc.pashun.hotel.bean;

import java.io.Serializable;
import java.util.Objects;

public class Room implements Serializable {

    private static final long serialVersionUID = 11139L;

    private int roomId;
    private String roomNumber;
    private RoomType roomType;

    public Room() {
    }

    public Room(int roomId, String roomNumber, RoomType roomType) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + " [roomId=" + roomId
                + " , roomNumber='" + roomNumber
                + " , roomType=" + roomType + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + roomId;
        result = prime * result + ((roomNumber == null) ? 0 : roomNumber.hashCode());
        result = prime * result + ((roomType == null) ? 0 : roomType.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Room room = (Room) obj;
        return roomId == room.getRoomId()
                && (roomNumber != null && roomNumber.equals(room.getRoomNumber()))
                && (roomType != null && roomType.equals(room.getRoomType()));
    }

}
