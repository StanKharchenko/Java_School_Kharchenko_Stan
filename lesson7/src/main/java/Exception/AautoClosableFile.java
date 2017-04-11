package Exception;

import java.io.File;

/**
 * Created by 12 on 11.04.2017.
 */
public class AautoClosableFile implements AutoCloseable {
    private File file;
    public AautoClosableFile(String path) {
        file = new File(path);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Закрытие по autoclose");
    }
}
