package WorkTogether.Week2.Pattern11;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Enter the n : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); ;
        int counter = n*2;
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <counter ; j++) {
                System.out.print("*"+" ");
            }
            counter-=2;
            System.out.println();
        }
    }
}
