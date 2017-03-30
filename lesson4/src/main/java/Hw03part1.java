import java.util.*;

/**
 * Created by 12 on 28.03.2017.
 */
public class Hw03part1 {
    public static void main(String[] args) {
        String text = "я оглянулся посмотреть не оглянулась ли она чтоб посмотреть не оглянулся ли я";
        Map<String, Integer> wordsmap = new HashMap<String, Integer>();
        for (String word:text.split(" ")) {
            if(wordsmap.containsKey(word)){
                wordsmap.put(word, wordsmap.get(word) + 1);
            }else {
                wordsmap.put(word,1);
            }
        }
        ArrayList<Map.Entry<String,Integer>> result = new ArrayList();
        Set<Map.Entry<String,Integer>> set = wordsmap.entrySet();
        Iterator<Map.Entry<String,Integer>> set_itr = set.iterator();
        while (set_itr.hasNext()) {
            Map.Entry<String, Integer> entryInSet = set_itr.next();
            if((result.size() == 0)) {
                result.add(entryInSet);
            }else {
                for (Map.Entry<String, Integer> entryInList : result) {
                    if (entryInSet.getValue() >= entryInList.getValue()) {
                        result.add(result.indexOf(entryInList), entryInSet);
                        break;
                    }
                }
            }
            if(!result.contains(entryInSet))
                result.add(entryInSet);
        }
        System.out.println("Готово");
        for (Map.Entry<String, Integer> entry : result) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }



}
