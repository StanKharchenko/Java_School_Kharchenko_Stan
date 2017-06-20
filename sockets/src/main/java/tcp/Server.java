package tcp;

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
            try (Socket server = serverSocket.accept()) {
                System.out.println(server.getRemoteSocketAddress());
                InputStream inputStream = server.getInputStream();
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                System.out.println(dataInputStream.readUTF());

                OutputStream outputStream = server.getOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                dataOutputStream.writeUTF(new Date().toString());
            }
        }
    }
    }
}
