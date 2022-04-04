package by.epamtc.pashun.hotel.dao;

import by.epamtc.pashun.hotel.bean.User;
import by.epamtc.pashun.hotel.dao.exception.DAOException;

import java.util.List;

public interface UserDAO {

    User registerUser(User user) throws DAOException;

    User deleteUser(User user) throws DAOException;

    User findUserByEmail(String email) throws DAOException;

    User findUserByName(String userName) throws DAOException;

    User findUserById(int id) throws DAOException;

    List<User> findAllUser() throws DAOException;
}
