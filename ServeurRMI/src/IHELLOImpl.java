import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IHELLOImpl extends UnicastRemoteObject implements IHELLO, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public IHELLOImpl() throws RemoteException{
		super();
	}
	public String disHello() throws RemoteException{
		return "bonjour a distance";
	}
}
