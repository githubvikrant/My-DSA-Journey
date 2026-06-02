import java.util.Stack;

public class reverseString {

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("v");
        st.push("i");
        st.push("k");
        st.push("r");
        st.push("a");
        st.push("n");
        st.push("t");
        
        System.out.println(st.toString());
        String newSt = Reverse(st);
        System.out.println(newSt);
    }

    public static String Reverse(Stack<String> st) {
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            String top = st.pop();
            sb.append(top);
        }
        return sb.toString();
    }

}
