/**
 * Created by Stan on 28.07.2017.
 */
public class Bloks {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        while (x < 5) {
            y = x - y;
            System.out.println(x + "" + y  + " ");
            x = x +1;
        }
    }
}
