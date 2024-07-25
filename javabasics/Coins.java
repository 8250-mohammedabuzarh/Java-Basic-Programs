package javabasics;

import java.util.Random;
import java.util.Scanner;

public class Coins {
    public static void main(String[] abcd) {
        int n;
        int heads = 0;
        int tails = 0;
        Random r = new Random();
        System.out.println("Enter number of Flips:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (r.nextDouble()<=0.5) {
                tails++;
            } else {
                heads++;
            }
        }
        double headpercent = (heads * 100.0) / n;
        double tailpercent = (tails * 100.0) / n;
        System.out.println("Heads  " + heads + " Tails  " + tails);
        System.out.println("Percentage of Heads: " + headpercent + " Percentage of Tails: " + tailpercent);

    }
}