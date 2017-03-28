import java.util.*;

/**
 * Created by 12 on 28.03.2017.
 */
public class Lesson4 {
    public static void main(String[] args) {
        String words = "one one two two three three three";
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word: words.split(" ")) {
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }else{
                map.put(word, 1);
            }
        }



    }


}
