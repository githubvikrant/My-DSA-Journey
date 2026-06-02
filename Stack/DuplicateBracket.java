
import java.util.*;

public class DuplicateBracket {

    public static void main(String[] args) {
        String exp = "((a+b)+c)";
        System.out.println("duplicates:" + isValid(exp));
    }

    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (st.peek() != '(') {
                    st.pop();
                    count++;
                }
                if (count < 1) {
                    return true; //duplicate 
                } else {
                    st.pop(); //opening pair
                }
            } else {
                //opening
                st.push(ch);
            }
        }
        return false;
    }
}
