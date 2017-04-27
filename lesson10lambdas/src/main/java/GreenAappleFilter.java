/**
 * Created by 12 on 27.04.2017.
 */
public class GreenAappleFilter implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
