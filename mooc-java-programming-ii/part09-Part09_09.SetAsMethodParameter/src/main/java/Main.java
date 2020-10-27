
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // You can test your method here
        Map<String, String> translations = new HashMap<>();
        translations.put("ganbatte", "good luck");
        translations.put("hai", "yes");

        Set<String> keys = translations.keySet();
        Collection<String> keyCollection = keys;

        System.out.println("Keys:");
        for (String key : keyCollection) {
            System.out.println(key);
        }

        System.out.println();
        System.out.println("Values:");
        Collection<String> values = translations.values();

        for (String value : values) {
            System.out.println(value);
        }

    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.
    public static int returnSize(Set set) {
        return set.size();
    }
}
