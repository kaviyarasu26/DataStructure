package WorkTogether.Week1.ProblemSet1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        System.out.print("Enter three angle in same line  :");
        Scanner scan = new Scanner(System.in);


        int angleA = scan.nextInt();
        int angleB = scan.nextInt();
        int angleC = scan.nextInt();

        if(angleA+angleB+angleC == 180)
            System.out.print("It's form a triangle.");
        else
            System.out.print("Triangle cannot be formed.");


        scan.close();
    }
}
