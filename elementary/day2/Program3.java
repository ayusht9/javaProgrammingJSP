import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=0;

        try{
            num = sc.nextInt();
        }
        catch (Exception e){
            System.out.println("Invalid Input "+e);
            // InputMismatchException
        }

        if(num>0)
            System.out.println(num+" is Positive");
        else if(num<0)
            System.out.println(num+" is Negative");
        else 
            System.out.println(num+" is Zero");
    }
}
