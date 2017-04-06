package CW;

import java.util.*;

/**
 * Created by 12 on 28.03.2017.
 */
public class Main {
    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<String>(Arrays.asList("1","2","1","4"));
//        System.out.println(stringList);
//        Collections.sort(stringList);
//        System.out.println(stringList);

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Иванов Иван Иванович",new Date()));
        persons.add(new Person("Петров Петр Петрович",new Date()));
        persons.add(new Person("Иванов Иван Иванович",new Date()));
        Collections.sort(persons, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(PersonsUtils.getPersonsCount(Collections.unmodifiableList(persons)));
    }
}
