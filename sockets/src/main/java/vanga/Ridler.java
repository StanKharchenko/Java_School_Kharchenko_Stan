package vanga;

import java.io.*;
import java.net.Socket;
import java.util.Date;
import java.util.Random;

/**
 * Created by 12 on 06.06.2017.
 */
public class Ridler implements Runnable{
    private final Socket socket;

    public Ridler(Socket socket) {
        this.socket = socket;
    }

    private static int getRandomNumberInRange(int min, int max){
        if(min >= max){
            throw new IllegalArgumentException("asdasasd");
        }
        Random r = new Random();
        return r.nextInt((max-min)+1) + min;
    }

    @Override
    public void run() {
        int ridle = getRandomNumberInRange(0,9);
        System.out.println("ridle for " + socket.getRemoteSocketAddress() + ": " + ridle);

        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            System.out.println(dataInputStream.readUTF());
            dataOutputStream.writeUTF("Угадай от 0 до 9");
        } catch (IOException e) {
            e.printStackTrace();
        }


}}
