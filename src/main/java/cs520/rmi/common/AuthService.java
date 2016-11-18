package cs520.rmi.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AuthService extends Remote {

    public User authenticate( String username, String password )
        throws RemoteException;

}
