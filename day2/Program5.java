package condition.ifElseLadder;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        if(age>0 && age<=12)
            System.out.println("Children: $5");
        else if(age>=13 && age<=17)
            System.out.println("Teenager: $8");
        else if(age>=18 && age<=64)
            System.out.println("Adult: $12");
        else 
            System.out.println("Not allowed!");
    }
}
