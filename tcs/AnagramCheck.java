public class AnagramCheck {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26]; // for lowercase a-z

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false; // mismatch found
        }

        return true; // all counts balanced
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        System.out.println(isAnagram(s, t)); // Output: true
    }
}


//easy way out there

// public class AnagramCheckSorting {
//     public static boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) return false;

//         char[] sArr = s.toCharArray();
//         char[] tArr = t.toCharArray();

//         Arrays.sort(sArr);
//         Arrays.sort(tArr);

//         return Arrays.equals(sArr, tArr);
//     }

//    