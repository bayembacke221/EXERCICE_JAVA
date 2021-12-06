import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientRMI {
	public	static void main(String [] arg) throws MalformedURLException, RemoteException, NotBoundException {
		IHELLO O = (IHELLO)Naming.lookup("rmi://localhost:1099/licence");
		System.out.println(O.disHello());
	}
}
