package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * Created by 12 on 06.06.2017.
 */
public class Sender {
    private static final int DEFAULT_PORT = 1234;
    private static final String DEFAULT_HOST = "localhost";

    public static void main(String[] args) throws IOException {
        int port = DEFAULT_PORT;
        InetAddress inetAddress = InetAddress.getLocalHost();
        String messageLine;
        try(DatagramSocket socket = new DatagramSocket()){
            do {
                System.out.println("Enter a message");
                Scanner keyboard = new Scanner(System.in);
                messageLine = keyboard.nextLine();
                byte[] bytes = messageLine.getBytes();
                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, inetAddress,port);
                socket.send(datagramPacket);
            }while (!messageLine.equals("exit"));
        }
    }
}
