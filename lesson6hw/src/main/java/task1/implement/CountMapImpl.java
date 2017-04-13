package task1.implement;

import task1.concept.CountMap;

import java.util.*;

/**
 * Created by sbt-harchenko-ss on 11.04.2017.
 */
public class CountMapImpl<T> implements CountMap<T> {

    private List<T> countList = new ArrayList<>();

    public void add(T value) {
        countList.add(value);
    }

    public int getCount(T value) {
        int i = 0;
        for (T listValue: countList) {
            if(listValue.equals(value))
                i++;
        }
        return i;
    }

    public int remove(T value) {
        int i = this.getCount(value);
        countList.remove(value);
        return i;
    }

    public int size() {
        Set<T> set = new HashSet<T>();
        for (T listItem:countList) {
            if(!set.contains(listItem))
                set.add(listItem);
        }
        return set.size();
    }
    //Добавить все элементы из source в текущий контейнер, при совпадении ключей,     суммировать значения
    public void addAll(CountMap<T> source) {

    }

    public Map<T,Integer> toMap() {
        Map<T, Integer> map = new HashMap<>();
        for (T listItem: countList) {
            if(map.containsKey(listItem)){
                map.put(listItem, map.get(listItem) + 1);
            }else{
                map.put(listItem, new Integer(1));
            }
        }
        return map;
    }

    public void toMap(Map<T, Integer> destination) {
        destination.putAll(toMap());
    }
}
