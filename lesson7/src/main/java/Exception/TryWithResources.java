package Exception;

import com.sun.corba.se.impl.oa.poa.AOMEntry;

import java.io.File;

/**
 * Created by 12 on 11.04.2017.
 */
public class TryWithResources {
    public static void main(String[] args) {
        try(
                AautoClosableFile file = new AautoClosableFile("c:\\temp\\1.txt");
            ){file.toString()


        }catch {

        }
    }
}
