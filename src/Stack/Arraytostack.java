package Stack;

public class Arraytostack {
    public static class Stack1 {
        private int arr[] = new int[5];
        private int idx = 0;

        void push(int x) {
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            arr[idx] = x;
            idx++;

        }

        int peek() {
            if(idx == 0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }

        int pop() {
            if(idx ==0){
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] =0;
            idx --;
            return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }
        boolean isEmpty(){
            if(idx == 0){
                return true;
            }
            else {
                return false;
            }
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }
        int capacity(){
            return arr.length;
        } 
    }


    public static void main(String[] args) {
        Stack1 st =new Stack1();
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
