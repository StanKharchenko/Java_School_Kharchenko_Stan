package serialization;

import java.io.*;

/**
 * Created by 12 on 16.05.2017.
 */
public class DepositSerializer {
    public static void serialize(String filename, Deposit deposit) throws IOException {
        try(FileOutputStream fileOutputStream = new FileOutputStream(filename);
        ObjectOutputStream  objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ){
            objectOutputStream.writeObject(deposit);
        }
    }

    public static Deposit deserialize(String filename) throws IOException, ClassNotFoundException {
        try(FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ){
            return (Deposit)objectInputStream.readObject();
        }
    }
}
