import java.util.Scanner;

class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char al = sc.next().charAt(0);

//        String al2 = "A";
//        System.out.println(al2.codePointAt(0));

        
        if((al>='a' && al<='z') || (al>='A' && al<='Z')){
            System.out.println("its a letter");
            if(al >= 'a' && al <= 'z')
                System.out.println("its lowercase");
            if(al >= 'A' && al <= 'Z')
                System.out.println("its uppercase");
        }
        else 
            System.out.println("Its not a letter");

    }
}
