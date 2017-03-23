/**
 * Created by 12 on 23.03.2017.
 */
public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }
    /**
     * This method checks gender of persons. If genders are not equal - tries to marry.
     * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife. Example: if both persons have spouses - then divorce will set 4 spouse to null) and then executes marry().
     * @param person - new husband/wife for this person.
     * @return - returns true if this person has another gender than passed person and they are not husband and wife, false otherwise
     */
    public boolean marry(Person person) {
        if(man!=person.man){
            System.out.println("Ура, не однополый брак");
            if(spouse == null && person.spouse == null){
                spouse = person;
                person.spouse = this;
                System.out.println("Совет да любовь, " + this.name);
            }else{
                divorce();
                person.divorce();
            }
        }else{
            System.out.println("Ахтунг!");
        }

        if(man!=person.man && spouse == null && person.spouse ==null){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Sets spouse = null if spouse is not null
     * @return true - if person status has been changed
     */
    public boolean divorce() {
        if(spouse != null){
            spouse = null;
            System.out.println("Успешно развели " + this.name);
            return true;
        }else {
            return false;
        }
    }
}
