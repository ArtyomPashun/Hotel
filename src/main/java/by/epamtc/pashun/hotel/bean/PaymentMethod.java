package by.epamtc.pashun.hotel.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum PaymentMethod {

    CASH(1, "cash"),
    CARD(2, "card");

    private static final Logger logger = LogManager.getLogger();

    private final int id;
    private final String paymentMethod;

    private PaymentMethod(int id, String paymentMethod) {
        this.id = id;
        this.paymentMethod = paymentMethod;
    }

    public int getId() {
        return id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public static PaymentMethod getMethodById(int id) {

        for (PaymentMethod paymentMethod : PaymentMethod.values()) {
            if (paymentMethod.id == id) {
                return paymentMethod;
            }
        }
        logger.warn(String.format("PaymentMethod with id: %d is not found", id));
        throw new EnumConstantNotPresentException(UserRole.class, String.format("PaymentMethod with id: %d is not found", id));
    }
}
