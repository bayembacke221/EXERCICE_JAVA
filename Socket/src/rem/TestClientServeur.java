package rem;

public class TestClientServeur {
		public static void main (String [ ] args) {
		SocketClient c = new SocketClient (); 
		c.envoyer ("bonjour") ;
		c.reception ( );
		}
		
}
