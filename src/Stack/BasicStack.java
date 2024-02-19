package Stack;

import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(9);
        st.push(7);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
    }

}
