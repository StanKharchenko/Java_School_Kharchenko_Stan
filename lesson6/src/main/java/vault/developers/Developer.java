package vault.developers;

/**
 * Created by 12 on 06.04.2017.
 */
public class Developer {
    private String name;
    private Integer iq;

    public String getName() {
        return name;
    }

    public Integer getIq() {
        return iq;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }

    public Developer(String name, Integer iq) {
        this.name = name;
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", iq=" + iq +
                '}';
    }
}
