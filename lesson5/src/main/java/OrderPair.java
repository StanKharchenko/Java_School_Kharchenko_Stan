/**
 * Created by 12 on 04.04.2017.
 */
public class OrderPair<K, V> implements Pair<K, V> {

    private K key;

    public OrderPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    private V value;

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public K getKey() {
        return key;
    }
}
