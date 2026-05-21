package Recursion.RecursionWithArray;

public class frogJump {
    public static void main(String[] args) {
        int[] height = {10, 30, 40, 20};
        System.out.println(bestFG(height, height.length,0));
    }
    static int bestFG(int[] height, int n, int index){
        if (index == n-1) return 0;
        int op1 = bestFG(height,height.length,index+1) + Math.abs(height[index]-height[index+1]);
        if (index == n-2) return op1;
        int op2 = bestFG(height,height.length,index+2) + Math.abs(height[index]-height[index+2]);
        return Math.min(op1,op2);
    }
}
