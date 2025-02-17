package WorkTogether.Week1.ProblemSet1;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        System.out.print("Enter the mark of a student :");
        Scanner scan = new Scanner(System.in);

        int mark = scan.nextInt();

        if(mark >= 90)
            System.out.println("Garde A");
        else if(mark >= 80)
            System.out.println("Garde B");
        else if(mark >= 60)
            System.out.println("Garde C");
        else if(mark <35)
            System.out.println("Fail");

        scan.close();
    }
}
