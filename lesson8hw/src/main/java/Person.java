/**
 * Created by sbt-harchenko-ss on 17.04.2017.
 */
public class Person {
    private String name;
    private Integer age;
    private String organization;

    public Person(String name, Integer age, String organization) {
        this.name = name;
        this.age = age;
        this.organization = organization;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getOrganization() {
        return organization;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", organization='" + organization + '\'' +
                '}';
    }
}