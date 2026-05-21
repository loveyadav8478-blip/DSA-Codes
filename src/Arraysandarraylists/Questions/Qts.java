package Arraysandarraylists.Questions;
import java.util.Scanner;
public class Qts {
    public static void main(String[] args) {
//        int[] marks = {100,23,24,15,55,69,43,35};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.print("Enter the marks of students : ");
        for (int i = 0; i <= n-1; i++) {
                 marks[i] = sc.nextInt();
        }System.out.print("Fail students are :  ");
        for (int i = 0; i <= n-1; i++) {
            if (marks[i] < 35) {
                System.out.print(i+" ");

            }
        }
    }

}
