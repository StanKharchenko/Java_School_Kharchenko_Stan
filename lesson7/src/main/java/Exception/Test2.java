package Exception;

/**
 * Created by 12 on 11.04.2017.
 */
public class Test2 {
    private static class Employee{
        private int grade;

        public void setGrade(int grade) {
            if(grade < 0 || grade >16){
                throw new IllegalArgumentException("Некорректный грейд");
            }
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setGrade(80);
    }
}
