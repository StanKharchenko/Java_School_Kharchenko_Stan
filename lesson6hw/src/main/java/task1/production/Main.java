package task1.production;

import task1.concept.CountMap;
import task1.implement.CountMapImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sbt-harchenko-ss on 11.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        CountMap<String> countMap = new CountMapImpl<>();
        countMap.add("one");
        countMap.add("two");
        countMap.add("three");
        countMap.add("three");

        System.out.println("one: " + countMap.getCount("one"));
        System.out.println("two:" + countMap.getCount("two"));
        System.out.println("three:" + countMap.getCount("three"));
        System.out.println("three:" + countMap.remove("three"));
        System.out.println("three:" + countMap.getCount("three"));

        countMap.add("three");

        System.out.println("Количество разных элементов: " + countMap.size());
        System.out.println(countMap.toMap().toString());

        Map<String,Integer> map = new HashMap<>();
        countMap.toMap(map);
        System.out.println(map.toString());
    }


}
