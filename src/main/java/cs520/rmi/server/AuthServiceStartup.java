package cs520.rmi.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AuthServiceStartup {

    public static void main( String[] args ) throws Exception
    {
        Registry registry = LocateRegistry.createRegistry( 4048 );
        registry.rebind( "AuthService", new AuthServiceImpl() );
    }

}
