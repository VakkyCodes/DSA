//Basic
//step 1
// 'a' + 1 = 'b'
// 'b' - 'a' = 1

//step 2
//index = ch - 'a';
//STEP 3: Reverse (index → char)
// char ch = (char)(index + 'a');

//STEP 4: Uppercase ↔ Lowercase
// ch = (char)(ch + 32); // A → a
// ch = (char)(ch - 32); // a → A




public class ascii {
    public static void tolower(){
        String s="ABC";
        for(char c:s.toCharArray()){
            System.out.print((char)(c+32));
            
        }

    }
    public static void toupper(){
        String s="abc";
        for(char c:s.toCharArray()){
            System.out.print((char)(c-32));
            
        }

    }
    public static void countFrequency(){
       String input = "banana";

        // Array to store frequency of ASCII characters
        int[] freq = new int[256];

        // Count frequency
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }

        // Print only non-zero frequencies
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " → " + freq[i]);
            }
        }
        
    }
    public static void main(String[] args) {
        tolower();
        toupper();
        countFrequency();
    }
}
