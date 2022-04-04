package by.epamtc.pashun.hotel.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Payment implements Serializable {

    private static final long serialVersionUID = 11141L;

    private int paymentId;
    private int total;
    private Date date;
    private PaymentMethod paymentMethod;

    public Payment() {
    }

    public Payment(int paymentId, int total, Date date, PaymentMethod paymentMethod) {
        this.paymentId = paymentId;
        this.total = total;
        this.date = date;
        this.paymentMethod = paymentMethod;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "[paymentId=" + paymentId +
                ", total=" + total +
                ", date=" + date +
                ", paymentMethod=" + paymentMethod +
                ']';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPaymentId(), getTotal(), getDate(), getPaymentMethod());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Payment payment = (Payment) obj;
        return paymentId == payment.getPaymentId() && total == payment.getTotal() &&
                (date != null && date.equals(payment.getDate())) &&
                (paymentMethod != null && paymentMethod.equals(payment.getPaymentMethod()));
    }
}
