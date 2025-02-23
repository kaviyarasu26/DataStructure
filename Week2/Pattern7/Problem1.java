package WorkTogether.Week2.Pattern7;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the n :");
        int n =scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
