import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        int ch = sc.next().toLowerCase().charAt(0);

        if(ch>='a' && ch<='z')
            System.out.println("letter");
        else if(ch>='0' && ch<='9')
            System.out.println("digit");
        else
            System.out.println("special character");
    }
}
