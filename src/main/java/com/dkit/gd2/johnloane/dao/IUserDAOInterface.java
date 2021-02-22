package com.dkit.gd2.johnloane.dao;

import com.dkit.gd2.johnloane.dto.User;
import com.dkit.gd2.johnloane.exceptions.DAOException;

import java.util.List;

public interface IUserDAOInterface
{
    public List<User> findAllUsers() throws DAOException;
    public User findUserByUsernamePassword(String username, String password) throws DAOException;
}
