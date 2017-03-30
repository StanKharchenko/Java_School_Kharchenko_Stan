import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Hw03part2 {
    static final String FILE_PATH = "C://Temp//1.txt";
    static boolean isFirst = true;

    public static void main(String[] args) throws IOException {
        NumsOperator nOp = new NumsOperator();
        Files.lines(Paths.get(FILE_PATH)).forEach(s -> parse(s, nOp));
    }
    private static void parse(String row, NumsOperator nOp){
        if(isFirst == true){
            isFirst = !isFirst;
            return;
        }
        String[] chars = row.split(" ");
        if (Integer.parseInt(chars[0]) == 1){
            nOp.addItem(Integer.parseInt(chars[1]));
        }else
        {
            System.out.println(nOp.removeMin());
        }
    }
}
