
class longestContinuesSubstring {
    public int longestContinuousSubstring(String s) {

        int count = 1;
        int maxLength = 1;

        for (int i = 1; i < s.length(); i++) {
 
            if (s.charAt(i) == s.charAt(i - 1) + 1) {

                count++;

            } else {

                count = 1;
            }

            maxLength = Math.max(maxLength, count);
        }

        return maxLength;
    }

    public static void main(String[] args) {

       longestContinuesSubstring obj = new longestContinuesSubstring();

        String s = "abcde";

        System.out.println(obj.longestContinuousSubstring(s));
    }
}
