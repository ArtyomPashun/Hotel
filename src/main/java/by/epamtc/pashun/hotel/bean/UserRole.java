package by.epamtc.pashun.hotel.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum UserRole {

    ADMIN(1, "admin"),
    USER(2, "user"),
    GUEST(3, "guest");

    private static final Logger logger = LogManager.getLogger();

    private final int userRoleId;
    private final String userRole;

    private UserRole(int userRoleId, String userRole) {
        this.userRoleId = userRoleId;
        this.userRole = userRole;
    }

    public int getUserRoleId() {
        return userRoleId;
    }

    public String getUserRole() {
        return userRole;
    }

    public static UserRole getRoleById(int id) {

        for (UserRole userType : UserRole.values()) {
            if (userType.userRoleId == id) {
                return userType;
            }
        }

        logger.warn(String.format("Role with id: %d is not found", id));
        throw new EnumConstantNotPresentException(UserRole.class, String.format("Role with id: %d is not found", id));

    }
}
