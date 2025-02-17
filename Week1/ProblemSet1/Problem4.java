package WorkTogether.Week1.ProblemSet1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        System.out.print("Enter T-Shirt size  :");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        switch(size){
            case 28 -> System.out.print("Small");
            case 30 -> System.out.print("Medium");
            case 38 -> System.out.print("Large");
            case 42 -> System.out.print("XLarge");
            default -> System.out.print("Invalid");
        }

        scan.close();
    }
}
