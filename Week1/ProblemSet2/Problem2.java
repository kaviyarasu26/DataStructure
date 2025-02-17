package WorkTogether.Week1.ProblemSet2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int i =1;
        while( i * num1 <= 1000){
            System.out.println(i * num1);
            i++;
        }
        scan.close();
    }
}
