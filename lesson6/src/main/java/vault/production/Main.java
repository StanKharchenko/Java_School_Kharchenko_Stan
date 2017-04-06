package vault.production;

import vault.concept.Predicate;
import vault.concept.UniVault;
import vault.developers.Developer;
import vault.developers.javadevelopers.JavaDeveloper;
import vault.implement.HashMapVault;
import vault.implement.HighIqPredicate;

/**
 * Created by 12 on 06.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        UniVault<String, JavaDeveloper> hashMapVault = new HashMapVault<>();
        hashMapVault.put("Yanis", new JavaDeveloper("Yanis",120, false));
        hashMapVault.put("Maxim", new JavaDeveloper("Maxim",121, false));
        hashMapVault.put("Irina", new JavaDeveloper("Irina",122, false));
        hashMapVault.put("Vadim", new JavaDeveloper("Vadim",130, false));

        System.out.println(hashMapVault.getAllByPredicate(new HighIqPredicate()));
    }
}
