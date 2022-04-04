package by.epamtc.pashun.hotel.bean.builder;

import by.epamtc.pashun.hotel.bean.User;
import by.epamtc.pashun.hotel.bean.UserRole;

public class UserBuilder {

    private User user;

    public UserBuilder() {
        user = new User();
    }

    public UserBuilder withId(int id) {
        user.setUserId(id);
        return this;
    }

    public UserBuilder withUserName(String userName) {
        user.setUserName(userName);
        return this;
    }

    public UserBuilder withPassword(String password) {
        user.setPassword(password);
        return this;
    }

    public UserBuilder withEmail(String email) {
        user.setEmail(email);
        return this;
    }

    public UserBuilder withPhoneNumber(String phoneNumber) {
        user.setPhoneNumber(phoneNumber);
        return this;
    }

    public UserBuilder withFirstName(String firstName) {
        user.setFirstName(firstName);
        return this;
    }

    public UserBuilder withLastName(String lastName) {
        user.setLastName(lastName);
        return this;
    }

    public UserBuilder withRole(UserRole role) {
        user.setRole(role);
        return this;
    }

    public User build() {
        return user;
    }
}
