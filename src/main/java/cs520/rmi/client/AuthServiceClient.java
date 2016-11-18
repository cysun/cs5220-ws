package cs520.rmi.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import cs520.rmi.common.AuthService;
import cs520.rmi.common.User;

public class AuthServiceClient {

    public static void main( String args[] ) throws Exception
    {
        Registry registry = LocateRegistry.getRegistry( "localhost", 4048 );
        AuthService authService = (AuthService) registry.lookup( "AuthService" );

        User user = authService.authenticate( "jdoe1", "abcd" );
        if( user != null )
            System.out.println( user );
        else
            System.out.println( "User not found." );
    }

}
