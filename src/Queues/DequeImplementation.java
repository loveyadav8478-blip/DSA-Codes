package Queues;
public class DequeImplementation {
    public static class deque{
        int[] arr = new int[100];
        int f = -1;
        int r = -1;
        int size = 0;
        public void AddFirst(int val){
            if (size == arr.length) {
                System.out.println("Dequeue if full!");
                return;
            }
            else if (size == 0) {
                f = r = 0;
            }
            else{
                f = (f-1+arr.length)%arr.length;
            }
            arr[f] = val;
            size++;
        }
        public void AddLast(int val){
            if (size == arr.length) {
                System.out.println("Dequeue if full!");
                return;
            }
            else if (size == 0) {
                f = r = 0;
            }
            else{
                r = (r+1)%arr.length;
            }
            arr[r] = val;
            size++;
        }
        public void RemoveFirst(){
            if (size == 0) {
                System.out.println("Dequeue is Empty!");
                return;
            }
            f = (f+1)%arr.length;
            size--;
            if (size == 0) {
                f = r = -1;
            }
        }
        public void RemoveLast(){
            if (size == 0) {
                System.out.println("Dequeue is Empty!");
                return;
            }
            r = (r-1+arr.length)%arr.length;
            size--;
            if (size == 0) {
                f = r = -1;
            }
        }
        public int getF(){
            if (size == 0) {
                System.out.println("Dequeue is Empty!");
                return -1;
            }
            return arr[f];
        }
        public int getL(){
            if (size == 0) {
                System.out.println("Dequeue is Empty!");
                return -1;
            }
            return arr[r];
        }
        public void display(){
            if (size == 0) {
                System.out.println("Dequeue is Empty!");
                return;
            }
            int j = f;
            for (int i = 0; i < size; i++) {
                System.out.print(arr[j]+" ");
                j = (j+1)%arr.length;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        deque dq = new deque();
        dq.AddFirst(10);
        dq.AddFirst(20);
        dq.AddFirst(30);
        dq.AddFirst(40);
        dq.display();
        dq.AddLast(50);
        dq.AddLast(100);
        dq.display();
    }
}
