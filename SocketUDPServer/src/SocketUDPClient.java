/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bayembacke
 */
public class SocketUDPClient {
    public static void main(String [ ] args) throws Exception {
        java.net.InetAddress adr = java.net.InetAddress.getByName ("localhost");
        java.net.DatagramSocket socket = new java.net.DatagramSocket( );
        byte buf [ ]="Bonjour".getBytes ();
        java.net.DatagramPacket sendpacket = new java.net.DatagramPacket (buf,buf.length,adr,4000);
        buf = new byte [256];
        java.net.DatagramPacket receivepacket=new java.net.DatagramPacket(buf,buf.length,adr,4000);
        socket.send (sendpacket);
        socket.receive (receivepacket);
        System.out.println ("Données reçues du serveur. "+new String (receivepacket.getData ()));
    }
}
