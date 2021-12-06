/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bayembacke
 */
public class SocketUDPServer {
    public static void main (String[ ] args)throws java.net.SocketException,java.io.IOException {
        java.net.DatagramSocket socket = new java.net.DatagramSocket (4000);
        byte sendbuffer [ ] = null;
        byte receivebuff [ ] = new byte [256];
        java.net.DatagramPacket receivepacket = new java.net.DatagramPacket
        (receivebuff,receivebuff.length);
        java.net.DatagramPacket sendpacket = null;
        System.out.println ("Serveur UDP prêt . ");
        socket.receive (receivepacket); //on recupere les packets client
        //on affiche les données reçues en octets en les convertissant en chaînes
        System.out.println ("Données reçues : "+ new String (receivepacket.getData()));
        //on envoie une reponse indiquant d'où provient l'appel
        java.net.InetAddress adr = receivepacket.getAddress ();
        int port = receivepacket.getPort ( );
        sendbuffer = ("vous êtes connecté depuis la machine "+adr +"et sur le port "+port).getBytes();
        sendpacket = new java.net.DatagramPacket (sendbuffer,sendbuffer.length,adr,port);
        socket.send (sendpacket);
    }
}