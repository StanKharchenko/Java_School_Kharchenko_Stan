package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Stan on 13.04.2017.
 */
public class CollectionUtils {
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List newArrayList() {
        return new ArrayList<T>();
    }

    public static int indexOf(List source, Object o) {
        return source.indexOf(o);
    }

    public static List limit(List source, int size) {
       return source.subList(0,size);
    }

    public static void add(List source, Object o) {
        source.add(o);
    }

    public static void removeAll(List removeFrom, List c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<T> c1, List<T> c2) {
       if(!c1.containsAll(c2)){
           return false;
       }
       return true;
    }

    public static <T> boolean containsAny(List<T> c1, List<T> c2) {
        for (T cListItem: c2) {
            if(c1.contains(cListItem))
                return true;
        }
        return false;
    }

    public static List range(List list, Object min, Object max) {
        return new ArrayList();
    }

    public static List range(List list, Object min, Object max, Comparator comparator) {
        return new ArrayList();
    }
}
