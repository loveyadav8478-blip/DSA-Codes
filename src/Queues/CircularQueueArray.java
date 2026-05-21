package Queues;
public class CircularQueueArray {
    public static class CirQArr{
        int[] arr = new int[6];
        int f = -1;
        int r = -1;
        int size = 0;
        int n = arr.length;
        public void add(int x) throws Exception{
            if (size == 0) {
                f = r = 0;
                arr[0] = x;
            }
            else if(size == n){
               throw new Exception("Queue if full!");
            }
            else if(r<n-1){
                arr[++r] = x;
            }
            else if (r==n-1) {
                r = 0;
                arr[0] = x;
            }
            size++;
        }
        public int remove() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is empty!");
            } else if (f==n-1) {
                int val = arr[f];
                f = 0;
                return val;
            }else{
                int val = arr[f];
                f++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is empty!");
            }
            return arr[f];
        }
        public void display() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is empty!");
            } else if (f<=r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i]+" ");
                }
            }else{
                for (int i = f; i <= n; i++) {
                    System.out.print(arr[i]+" ");
                }
                for (int i = 0; i <= r; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        CirQArr q = new CirQArr();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.remove();
        q.display();
        q.add(70);
        q.display();
    }
}
