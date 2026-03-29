public class StringPermutations {

    // Recursive function to generate all permutations
    public static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // Choose 1 character
            char ch = str.charAt(i);

            // Remaining string without the chosen character
            String rest = str.substring(0, i) + str.substring(i + 1);

            // Recurse with new result and reduced string
            permute(rest, result + ch);
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("Permutations of " + input + " are:");
        permute(input, "");
    }
}
