package test;

import java.util.Date;

/**
 * Created by 12 on 28.03.2017.
 */
public class Person {
    private String name;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {

        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
