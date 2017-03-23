/**
 * Created by 12 on 23.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        Person ivanov = new Person(true,"Иванов Иван Иванович");
        Person petrov = new Person(true,"Петров Петр Петрович");
        Person sidorova = new Person(false,"Сидорова Марья Ивановна");
        Person kuznetcova = new Person(false,"Кузнецова Иванна Марьевна");

        System.out.println("Пытаемся поженить Иванова и Петрова ");
        System.out.println("Пытаемся поженить Иванова и Петрова ");
        System.out.println("boolean marry вернул " + ivanov.marry(petrov));
        System.out.println("Пытаемся поженить Петрова и Иванова");
        System.out.println("boolean marry вернул " + petrov.marry(ivanov));
        System.out.println("Пытаемся поженить Иванова и Сидорову");
        System.out.println("boolean marry вернул " + ivanov.marry(sidorova));
        System.out.println("Пытаемся поженить Петрова и Кузнецову");
        System.out.println("boolean marry вернул " + petrov.marry(kuznetcova));
        System.out.println("Пытаемся поженить Петрова и Сидорову");
        System.out.println("boolean marry вернул " + petrov.marry(sidorova));
        System.out.println("Пытаемся поженить Петрова и Сидорову");
        System.out.println("boolean marry вернул " + petrov.marry(sidorova));
    }
}
