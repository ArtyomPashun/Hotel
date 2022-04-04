package by.epamtc.pashun.hotel.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum RoomType {

    STANDARD(1, "standard", 1, 10),
    SUITE(2, "suit", 2, 25),
    PRESIDENT(3, "president", 5, 100);

    private static final Logger logger = LogManager.getLogger();

    private final int roomTypeId;
    private final String roomName;
    private final int capacity;
    private final int price;

    private RoomType(int roomTypeId, String roomName, int capacity, int price) {
        this.roomTypeId = roomTypeId;
        this.roomName = roomName;
        this.capacity = capacity;
        this.price = price;
    }

    public int getRoomTypeId() {
        return roomTypeId;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public static RoomType getTypeById(int id) {

        for (RoomType roomType : RoomType.values()) {
            if (roomType.roomTypeId == id) {
                return roomType;
            }
        }
        logger.warn(String.format("RoomType with id: %d is not found", id));
        throw new EnumConstantNotPresentException(UserRole.class, String.format("RoomType with id: %d is not found", id));
    }
}
