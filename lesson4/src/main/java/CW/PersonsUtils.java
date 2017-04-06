package CW;

import java.util.Date;
import java.util.List;

/**
 * Created by 12 on 28.03.2017.
 */
public class PersonsUtils {
    public static Integer getPersonsCount(List<Person> persons){
        persons.add(new Person("Человек", new Date()));
        return persons.size();
    }
}
