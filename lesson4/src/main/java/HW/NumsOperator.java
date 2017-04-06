package HW;

import java.util.ArrayList;
import java.util.Collections;

public class NumsOperator {
    private ArrayList<Integer> list = new ArrayList<>();

    public void addItem(Integer num){
        list.add(num);
        Collections.sort(list);
    }
    public Integer removeMin(){
        Integer result = list.get(0);
        list.remove(0);
        return result;
    }
}
