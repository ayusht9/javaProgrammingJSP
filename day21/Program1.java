import java.util.Arrays;

class Program1 {
	public static int[] reverseArrayElements(int[] a) {	
		int b[] = new int[a.length];
        for(int i=0; i<=a.length-1; i++){
        	b[a.length-i-1]=a[i];
        }
        return b;
	}
    public static int[] reverseArrayElements2(int[] a) { 
        int b[] = new int[a.length];
        for(int i=a.length-1; i>=0; i--){
            b[i]=a[a.length-i-1];
        }
        return b;
    }

    public static void main(String[] args) {
    	int a[] = {1,2,3,4,5};
    	int b[] = reverseArrayElements(a);

        System.out.println(Arrays.toString(b));
        int c[] = reverseArrayElements2(a);
        System.out.println(Arrays.toString(c));
    }	
}