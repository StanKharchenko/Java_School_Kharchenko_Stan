/**
 * Created by sbt-harchenko-ss on 18.04.2017.
 */
public class WrongPet {
    private String name;
    private String age;
    private Person owner;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Person getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public WrongPet(String name, String age, Person owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", owner=" + owner +
                '}';
    }
}
