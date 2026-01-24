import java.util.Arrays;

class ArrayPallindrome {
    public static boolean pallindrome(char[] c){
        int start = 0;
        int end = c.length-1;

        while(start<end){
            if(c[start]!=c[end])
                return false;
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
    	int a[] = {1,2,3,4,5,6};
        char c[] = {'m','a','d','a','m'};
        char d[] = {'r','a','c','c','a','r'};
        System.out.println(Arrays.toString(reverseArrayElementsOP(a)));
        
        System.out.println(pallindrome(c));
        System.out.println(pallindrome(d));
    }	
}