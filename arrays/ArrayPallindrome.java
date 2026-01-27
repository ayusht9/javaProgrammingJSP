import java.util.Arrays;

class ArrayPallindrome {
    public static boolean pallindrome(char[] c){
        int start = 0;
        int end = c.length-1;

        while(start<end){
            if(c[start++]!=c[end--])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        char a[] = {'m','a','d','a','m'};
        char b[] = {'r','a','c','c','a','r'};
        
        System.out.println(pallindrome(a));
        System.out.println(pallindrome(b));
    }	
}