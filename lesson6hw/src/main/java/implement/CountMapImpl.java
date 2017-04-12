package implement;

import concept.CountMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by sbt-harchenko-ss on 11.04.2017.
 */
public class CountMapImpl<V> implements CountMap<V> {

    private List<V> countList = new ArrayList<>();

    public void add(V value) {
        countList.add(value);
    }

    public int getCount(V value) {
        int i = 0;
        for (V listValue: countList) {
            if(listValue.equals(value))
                i++;
        }
        return i;
    }

    public int remove(V value) {
        int i = this.getCount(value);
        countList.remove(value);
        return i;
    }

    public int size() {
        return 0;
    }

    public void addAll(CountMap<V> source) {

    }

    public Map<?, V> toMap() {
        return null;
    }

    public void toMap(Map<?, V> destination) {

    }
}
