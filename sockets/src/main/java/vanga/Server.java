package vanga;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by 12 on 06.06.2017.
 */
public class Server {
    private static final int DEFAULT_PORT = 1234;

    public static void main(String[] args) throws IOException {
        int port = args.length == 0 ? DEFAULT_PORT: Integer.parseInt(args[0]);
    try (ServerSocket serverSocket = new ServerSocket(port)) {
        while (true) {
            Socket server = serverSocket.accept();
            System.out.println(server.getRemoteSocketAddress());
            Thread thread = new Thread((new Ridler(server)));
            thread.start();


    }
}
    }
}

