import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class stack {
    public static void basic() {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.pop();
        st.peek();

    }

    public static void reverse() {
        Stack<Character> st = new Stack<>();
        String s = "abc";
        for (char ch : s.toCharArray()) {
            st.push(ch);
        }
        String result = "";
        while (!st.isEmpty()) {
            result += st.pop();
        }

        System.out.println(result);
    }

    public static boolean isValid() {
        Stack<Character> stack = new Stack<>();
        String s = "{}()";
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If it's a closing bracket, check stack
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }

    public boolean isValid(String s) {//using deque
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != c)
                    return false;
            }
        }

        return stack.isEmpty();
    }
 public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse from right
        for (int i = n - 1; i >= 0; i--) {

            // Remove all smaller or equal elements
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // If stack empty → no greater element
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }

            // Push current element
            st.push(arr[i]);
        }

        return result;
    }
 public static int[] nextGreaterLeft(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse from left
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return result;
    }
       public static int[] stockSpan(int[] arr) {
        int n = arr.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Remove smaller elements
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }

            st.push(i); // store index
        }

        return span;
    }
    public static void main(String[] args) {
        basic();
        reverse();
    }
}