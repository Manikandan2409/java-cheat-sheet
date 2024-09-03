import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Optional;

public class Test1 {
    public static void main(String[] args) {
        String str = " HELLO World how to use it hi im manikandan" +
                " Hare ram Hare ram rama rama hare hare";
        String[] words = str.split("\\s");
        HashMap<Character, Integer> unique_letters = new HashMap<>();
        for (String word : words) {

            for (char letter : word.toCharArray()) {
                unique_letters.put(letter, unique_letters.getOrDefault(letter, 0) + 1);
            }
        }

        Optional<Map.Entry<Character, Integer>> maxEntry = unique_letters.entrySet().stream()
                .max(Map.Entry.comparingByValue());
        System.out.println(unique_letters);
        if (maxEntry.isPresent()) {
            System.out.println(maxEntry);
        } else {
            System.out.println("No entry");
        }
    }

}
