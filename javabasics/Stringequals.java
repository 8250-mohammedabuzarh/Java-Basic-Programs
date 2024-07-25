package javabasics;

import java.util.Scanner;

public class Stringequals {

    public static void main(String[] abc) {
        String s1;
        String s2;
        Stringequals obj = new Stringequals();
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        if (s1.equals(s2)) {
            System.out.println("Both Strings are equal");
        } else {
            System.out.println("Both Strings are not equal");
        }
    }
}
