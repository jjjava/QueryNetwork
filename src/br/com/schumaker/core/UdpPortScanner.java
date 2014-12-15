package br.com.schumaker.core;

/**
 *
 * @author hudson.sales
 */
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpPortScanner {

    public static void main(String[] args) {
        System.out.println("Start");
        for (int port = 1024; port <= 65535; port++) {
            try {
                // the next line will fail and drop into the catch block if
                // there is already a server running on port i
                DatagramSocket server = new DatagramSocket(port);
                server.close();
            } catch (SocketException ex) {
                System.out.println("There is a server on port " + port + ".");
            }
        }
        System.out.println("End");
    }
}
