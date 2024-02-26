package Stack;

import java.util.Stack;

public class Display {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(9);
        st.push(7);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Displayreverse(st);
        Display(st);
    }
    public static void Displayreverse(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        System.out.print(top + " ");
        Displayreverse(st);
        st.push(top);
    }
    public static void Display(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        Displayreverse(st);
        System.out.print(top + " ");
        st.push(top);
    }
}
