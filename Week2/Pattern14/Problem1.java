package WorkTogether.Week2.Pattern14;

import java.util.Scanner;

public class Problem1 {
      public static void main(String[] args) {
        System.out.println("Enter the n :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
