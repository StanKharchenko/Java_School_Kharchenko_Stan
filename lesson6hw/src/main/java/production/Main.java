package production;

import concept.CountMap;
import implement.CountMapImpl;

/**
 * Created by sbt-harchenko-ss on 11.04.2017.
 */
public class Main {
    CountMap<Integer> map = new CountMapImpl<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);
/*
        int count = map.getCout(5); // 2
        int count = map.getCout(6); // 1
        int count = map.getCout(10); // 3*/

}
