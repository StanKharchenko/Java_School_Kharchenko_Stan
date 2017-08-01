/**
 * Created by Stan on 27.07.2017.
 */
public class Words {
    public static void main (String[] args) {
        //1 набор слов
        String[] wordListOne = {"кися", "собака", "пандочка", "крошик", "ежик"};

        String[] wordListTwo = {"медведь", "банифаций", "леопард", "пингвин", "мячик"};

        String[] wordListThree = {"нюшенька", "пирамидка", "машинка", "бабочка", "конструктор"};

        //вычисляем сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //генинрируем 3 случ числа

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //теперь строим фразу

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //выводим фразу на экран

        System.out.println("Лися сегодня будет играть с " + phrase);



    }
}
