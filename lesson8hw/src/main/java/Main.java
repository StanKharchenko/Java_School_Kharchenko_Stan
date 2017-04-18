import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by sbt-harchenko-ss on 17.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        Person john = new Person("John",30,"SBT");
        Person mike = new Person("Mike",18,"Sberbank");
        Person sigizmund = new Person("Sigizmund",92,"Russian Post");

        Pet bobik = new Pet("Бобик",2, sigizmund);

        WrongPet sharik = new WrongPet("Шарик","20", sigizmund);

        run(john, mike);
        run(bobik, mike);
        run(sharik, mike);
    }

    public static void run(Object o1, Object o2) {
        System.out.println("Исходные данные:");
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        BeanUtils.assign(o1, o2);
        System.out.println("Результат:");
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        System.out.println("===================");

    }
}