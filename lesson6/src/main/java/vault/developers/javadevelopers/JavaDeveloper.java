package vault.developers.javadevelopers;

import vault.developers.Developer;

/**
 * Created by 12 on 06.04.2017.
 */
public class JavaDeveloper extends Developer{
    private boolean workInPPRB;

    public JavaDeveloper(String name, Integer iq, boolean workInPPRB) {
        super(name, iq);
        this.workInPPRB = workInPPRB;
    }

    public boolean isWorkInPPRB() {
        return workInPPRB;
    }

    public void setWorkInPPRB(boolean workInPPRB) {
        this.workInPPRB = workInPPRB;
    }

    @Override
    public String toString() {
        return "JavaDeveloper{" +
                "name='" + super.getName()+ "\'" +
                ", iq=" + super.getIq() +
                ", workInPPRB=" + workInPPRB +
                '}';
    }
}
