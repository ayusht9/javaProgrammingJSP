package condition.ifElseLadder;

import java.util.Scanner;

public class Program1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ramu's age");
        int a = sc.nextInt();
        System.out.print("Enter Raghu's age");
        int b = sc.nextInt();
        System.out.print("Enter Raju's age");
        int c = sc.nextInt();

        if(a<b&&a<c)
            System.out.println("Ramu is youngest");
        else if (b<a && b<c)
            System.out.println("Raghu is youngest");
        else
            System.out.println("Raju is youngest");

    }
}
