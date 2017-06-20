package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * Created by 12 on 06.06.2017.
 */
public class Reciever {
    private static final int DEFAULT_PORT = 1234;
    private static final int MAX_BUFFER_SIZE = 1024;
    public static void main(String[] args) throws IOException {
        int port = DEFAULT_PORT;
        byte[] bytes = new byte[MAX_BUFFER_SIZE];
        String messageLine;
        try(DatagramSocket socket = new DatagramSocket(port)){
            do {

                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
                socket.receive(datagramPacket);
                messageLine = new String(datagramPacket.getData(),0,datagramPacket.getLength());
                System.out.println(messageLine);
            }while (!messageLine.equals("exit"));
        }
    }
}
