import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHELLO extends Remote{
	public String disHello() throws RemoteException;
}
