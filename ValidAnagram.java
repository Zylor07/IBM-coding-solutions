
import java.util.HashMap;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters in first string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Check characters in second string
        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }

    public static void main(String[] args) {

        ValidAnagram obj = new ValidAnagram();

        String s = "anagram";
        String t = "nagaram";

        System.out.println(obj.isAnagram(s, t));
    }
}


/*class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        
        return Arrays.equals(sArr, tArr);
    }
}*/