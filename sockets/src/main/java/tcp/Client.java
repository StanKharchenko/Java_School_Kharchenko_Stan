package tcp;

import java.io.*;
import java.net.Socket;
import java.util.Date;

/**
 * Created by 12 on 06.06.2017.
 */
public class Client {
    private static final int DEFAULT_PORT = 1234;
    private static final String DEFAULT_HOST = "localhost";

    public static void main(String[] args) throws IOException {
        String host = args.length == 0 ? DEFAULT_HOST: args[0];
        int port = args.length == 0 ? DEFAULT_PORT: Integer.parseInt(args[1]);
        try(Socket client = new Socket(host,port)) {
            OutputStream outputStream = client.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("Hello from client");

            InputStream inputStream = client.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println("currentDate" + dataInputStream.readUTF());
        }
    }
}
