package com.dkit.gd2.johnloane;

import com.dkit.gd2.johnloane.dao.IUserDAOInterface;
import com.dkit.gd2.johnloane.dao.MySqlUserDAO;
import com.dkit.gd2.johnloane.dto.User;
import com.dkit.gd2.johnloane.exceptions.DAOException;

import java.util.List;

/**
 * Database access
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Database access" );

        IUserDAOInterface IUserDAO = new MySqlUserDAO();

        getAllUsers(IUserDAO);
        //getSpecificUser(IUserDAO, "Berk", "cleanpassword");
    }

    private static void getAllUsers(IUserDAOInterface IUserDAO)
    {
        try
        {
            List<User> users = IUserDAO.findAllUsers();
            printUsers(users);
        }
        catch(DAOException daoe)
        {
            System.out.println(daoe.getMessage());
        }
    }

    private static void printUsers(List<User> users)
    {
        if(users == null || users.isEmpty())
        {
            System.out.println("There are no users");
        }

        for(User user : users)
        {
            System.out.println(user);
        }
    }
}
