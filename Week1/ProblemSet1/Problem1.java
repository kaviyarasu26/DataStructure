package WorkTogether.Week1.ProblemSet1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        System.out.print("Enter the input :");
        Scanner scan = new Scanner(System.in);


        int integer = scan.nextInt();
        String string = scan.next();
        char letter = scan.next().charAt(0);

        System.out.println(integer);
        System.out.println(string);
        System.out.println(letter);

        scan.close();
    }
}
