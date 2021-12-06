import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class DemarrageServeurRMI {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		// TODO Auto-generated method stub
		System.out.println("Demarrage du serveur RMI...");
		IHELLOImpl obj = new IHELLOImpl();
		Naming.rebind("rmi://localhost:1099/licence", obj);
		System.out.println("Serveur RMI demarre ");
		

	}

}
