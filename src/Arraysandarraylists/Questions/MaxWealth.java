package Arraysandarraylists.Questions;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {4,1,6},
                {3,3,7}
        };
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts) {
        //persons are rows
        //accounts are cols
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int rSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                rSum += accounts[i][j];
            }
            if (rSum > max) {
                max = rSum;
            }
        }
        return max;
    }
}
