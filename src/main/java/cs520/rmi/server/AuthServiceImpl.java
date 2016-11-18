package cs520.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import cs520.rmi.common.AuthService;
import cs520.rmi.common.User;

public class AuthServiceImpl extends UnicastRemoteObject implements AuthService {

    private static final long serialVersionUID = 1L;

    List<User> users;

    public AuthServiceImpl() throws RemoteException
    {
        users = new ArrayList<User>();
        users.add( new User( "jdoe1", "abcd", "John", "Doe", 20 ) );
        users.add( new User( "jdoe2", "1234", "Jane", "Doe", 20 ) );
    }

    public User authenticate( String username, String password )
        throws RemoteException
    {
        for( User user : users )
            if( user.getUsername().equals( username )
                && user.getPassword().equals( password ) ) return user;

        return null;
    }

}
