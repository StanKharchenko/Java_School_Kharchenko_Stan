package vault.implement;

import vault.concept.Predicate;
import vault.developers.Developer;

/**
 * Created by 12 on 06.04.2017.
 */
public class HighIqPredicate implements Predicate<Developer> {

    public boolean apply(Developer elm) {
        if(elm.getIq().compareTo(100) > 0)
            return true;
        return false;
    }
}
