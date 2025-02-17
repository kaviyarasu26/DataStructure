package WorkTogether.Week1.ProblemSet2;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println();
        int num2 = scan.nextInt();

        for(int i = 0 ; i < num2 ; i++){
            System.out.println(num1);
        }

        scan.close();
    }
}
