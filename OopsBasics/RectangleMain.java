package OopsBasics;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args)
    {
        RectangleAreaandParameter rec = new RectangleAreaandParameter();
        System.out.println("Enter length and breadth of rectangle: ");
        Scanner sc = new Scanner(System.in);
        rec.length = sc.nextInt();
        rec.breadth = sc.nextInt();
        System.out.println("Area of Rectangle: " + rec.Area());
        System.out.println("Perimeter of Rectangle: " + rec.Perimeter());
    }
}
