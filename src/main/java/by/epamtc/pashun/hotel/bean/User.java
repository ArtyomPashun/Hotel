package by.epamtc.pashun.hotel.bean;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 11138L;

    private int userId;
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private UserRole role;

    public User() {
    }

    public User(int userId, String userName, String password, String email, String firstName, String lastName, String phoneNumber, UserRole role) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + " [userId=" + userId + ", userName=" + userName + ", password=" + password
                + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
                + ", phoneNumber=" + phoneNumber + ", role=" + role + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + userId;
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());

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

        User user = (User) obj;
        return userId == user.getUserId()
                && (userName != null && userName.equals(user.getUserName())) && (password != null && password.equals(user.getPassword()))
                && (email != null && email.equals(user.getEmail())) && (firstName != null && firstName.equals(user.getFirstName()))
                && (lastName != null && lastName.equals(user.getLastName())) && (phoneNumber != null && phoneNumber.equals(user.getPhoneNumber()))
                && (role != null && role.equals(user.getRole()));
    }

}