package WorkTogether.Week1.ProblemSet2;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String secondName = scan.nextLine();
        int num = scan.nextInt();
        for(int i = 0 ; i<num;i++){
            System.out.println(firstName + secondName );
        }
        scan.close();
    }
}
