package WorkTogether.Week2.Pattern6;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input :");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for(int j =0 ; j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
