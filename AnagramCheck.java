import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase().replaceAll("[^a-z]", "");
        s2 = s2.toLowerCase().replaceAll("[^a-z]", "");

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        System.out.println("Input: \"" + str1 + "\", \"" + str2 + "\"");
        System.out.println("Output: " + isAnagram(str1, str2));
    }
}
