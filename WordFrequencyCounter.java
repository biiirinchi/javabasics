import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String sentence = "The cat and the dog.";
        sentence = sentence.toLowerCase().replaceAll("[^a-z\\s]", "");
        String[] words = sentence.split("\\s+");
        Map<String, Integer> freqMap = new LinkedHashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
