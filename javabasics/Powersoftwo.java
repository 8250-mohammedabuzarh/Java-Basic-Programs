package javabasics;
import java.util.Scanner;

public class Powersoftwo {
    public static void main(String[] args) {
        int N;
        System.out.println("Enter value of N: ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        if(N<=31){
            for (int i = 0; i <= N; i++) {
                System.out.println((int) Math.pow(2, i));
            }
        }
        else {
            System.out.println("Enter a number less than or equal to 31");
        }
    }
}
