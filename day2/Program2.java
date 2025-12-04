package condition.ifElseLadder;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1");
        int a = sc.nextInt();
        System.out.print("Enter num 2");
        int b = sc.nextInt();
        System.out.print("Enter num 3");
        int c = sc.nextInt();
        
        if(a>b && a>c)
            System.out.println(a+" is largest");
        else if (b>a && b>c) 
            System.out.println(b+" is largest");
        else 
            System.out.println(c+" is largest");
    }
}
