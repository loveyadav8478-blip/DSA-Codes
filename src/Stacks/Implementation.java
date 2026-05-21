package Stacks;
public class Implementation {
    public static class Stack{
        private int[] arr = new int[5];
        private int n = arr.length;
        int idx = 0;
        void push(int x) {
            if(isFull()){
                System.out.println("Stack is Full!");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        void display() {
            for (int i = 0; i < n-1; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int peek(){
            if (idx == 0){
                System.out.println("Stack is Empty..");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if (idx == 0){
                System.out.println("Stack is Empty..");
                return -1;
            }
            int top = arr[idx-1];
            idx--;
            return top;
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==n) return true;
            else return false;
        }
        int capacity(){
            return arr.length;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(2);
        st.push(5);
        st.push(6);
        st.push(10);
        st.display();
        System.out.println(st.capacity());

    }
}
