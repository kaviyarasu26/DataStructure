package WorkTogether.Week2.Pattern13;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        int count = 1 ;
        System.out.println("Enter the n :");
        Scanner scanner = new Scanner(System.in);
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
