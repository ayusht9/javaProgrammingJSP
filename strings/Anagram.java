// anagram check

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() == s2.length()) {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            String res1 = new String(ch1);
            String res2 = new String(ch2);

            return res1.equals(res2);
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("silent", "listen"));
    }

}
