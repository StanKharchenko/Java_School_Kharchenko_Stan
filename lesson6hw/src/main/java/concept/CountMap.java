package concept;

import java.util.Map;

/**
 * Created by sbt-harchenko-ss on 11.04.2017.
 */
public interface CountMap <V>{
    // добавляет элемент в этот контейнер.
    void add(V value);

    //Возвращает количество добавлений данного элемента
    int getCount(V value);

    //Удаляет элемент и контейнер и возвращает количество его добавлений(до удаления)
    int remove(V value);

    //количество разных элементов
    int size();

    //Добавить все элементы из source в текущий контейнер, при совпадении ключей,     суммировать значения
    void addAll(CountMap<V> source);

    //Вернуть java.util.Map. ключ - добавленный элемент, значение - количество его добавлений
    Map <?, V> toMap();

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    void toMap(Map <?, V> destination);
}

