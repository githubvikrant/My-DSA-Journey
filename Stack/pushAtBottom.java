
import java.util.*;

public class pushAtBottom {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(2);
        st.push(1);

        System.out.println(st.toString());
        pushBottom(st, 4);
        System.out.println(st.toString());
        st.pop();
        System.out.println(st.toString());

    }

    public static void pushBottom(Stack<Integer> stk, int item) {

        if (stk.isEmpty()) {
            stk.push(item);
            return;
        }
        int top = stk.pop();
        pushBottom(stk, item);
        stk.push(top);
    }
}
