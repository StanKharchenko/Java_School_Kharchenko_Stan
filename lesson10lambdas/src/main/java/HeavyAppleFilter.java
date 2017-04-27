/**
 * Created by 12 on 27.04.2017.
 */
public class HeavyAppleFilter implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeigth() > 150;
    }
}
