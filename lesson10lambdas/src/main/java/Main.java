import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 12 on 27.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Apple a1 = new Apple("green",150);
        Apple a2 = new Apple("red",250);
        Apple a3 = new Apple("green",50);
        List<Apple> apples = new ArrayList<>();
        apples.addAll(Arrays.asList(a1,a2,a3));
        System.out.println(filterApple(apples,new GreenAappleFilter()));
        System.out.println(filterApple(apples,new HeavyAppleFilter()));

        System.out.println(filterApple(apples, apple -> "green".equals(apple.getColor())));
        System.out.println(filterApple(apples, apple -> apple.getWeigth() > 150));

    }

    public static List<Apple> filterApple(List<Apple> apples, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:apples) {
            if(p.test(apple)) result.add(apple);
        }
        return result;
    }

}
