public class permutation {
    public static void permutat(String Str, String ans) {
        if (Str.length() == 0) {
            if (ans.length() > 0 && ans.charAt(0) == 'a') {
                System.out.println(ans);
            }
            return;
        }

        for (int i = 0; i < Str.length(); i++) {
            char ch = Str.charAt(i);
            String left = Str.substring(0, i);
            String right = Str.substring(i + 1);
            permutat(left + right, ans + ch);
        }
    }

    public static void main(String[] args) {
        permutat("aab", "");
    }
}