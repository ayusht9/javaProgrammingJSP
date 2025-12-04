package condition.nestedIf;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose your drink (Coffee, Tea, Soda): ");
        String drink = sc.next().toLowerCase();

        
        if(drink.equals("coffee") || drink.equals("tea") || drink.equals("soda")){
            System.out.print("Select size (small, large, medium): ");
            String size = sc.next().toLowerCase();
            if(drink.equals("coffee")){
                if(size.equals("large"))
                    System.out.println("Your have selected "+size+" "+drink+" cost: 5");
                else if(size.equals("medium"))
                    System.out.println("Your have selected "+size+" "+drink+" cost: 10");
                else
                    System.out.println("Your have selected "+size+" "+drink+" cost: 20");
            }
            else if(drink.equals("tea")){
                if(size.equals("large"))
                    System.out.println("Your have selected "+size+" "+drink+" cost: 5");
                else if(size.equals("medium"))
                    System.out.println("Your have selected "+size+" "+drink+" cost: 10");
                else
                    System.out.println("Your have selected "+size+" "+drink+" cost: 20");
            }
            else {
                if(size.equals("large"))
                    System.out.println("Your have selected "+size+" "+drink+" ");
                else if(size.equals("medium"))
                    System.out.println("Your have selected "+size+" "+drink+" ");
                else
                    System.out.println("Your have selected "+size+" "+drink+" ");
            }
        }
        else 
            System.out.println("wrong drink");

    }
}
