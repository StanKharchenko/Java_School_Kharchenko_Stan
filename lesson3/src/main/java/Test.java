/**
 * Created by 12 on 23.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        String[][] cats = {{"Tom","Barsik", "Murzik"},{"1","2","100"}};
        for(String[] cat :cats)
        {
            for(int i=0; i < cat.length; i++)
                System.out.println(cat[i]);

        }

    }
}
