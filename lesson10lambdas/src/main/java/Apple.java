/**
 * Created by 12 on 27.04.2017.
 */
public class Apple {
    private String color;

    private int weigth;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public String getColor() {

        return color;
    }

    public int getWeigth() {
        return weigth;
    }

    public Apple(String color, int weigth) {

        this.color = color;
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weigth=" + weigth +
                '}';
    }
}
