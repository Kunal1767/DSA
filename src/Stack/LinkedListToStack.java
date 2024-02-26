package Stack;

public class LinkedListToStack {
    public static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    public static class Stack2{
        Node head = null;
        private int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void displayrev(){
            Node temp = head;
            while(temp!= null){
                System.out.println(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        void displayrec(Node h){
            if(h==null){
                return;
            }
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();

        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;

        }
        int peek(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }

    }

    public static void main(String[] args) {
        Stack2 st =new Stack2();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(89);
        st.push(75);
        st.push(36);
    }
}
