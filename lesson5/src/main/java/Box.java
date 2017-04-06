/**
 * Created by 12 on 04.04.2017.
 */
public class Box<T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
