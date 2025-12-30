import java.util.Arrays;
import java.util.ArrayList;
class Program1 {
	public static int[] mergeArrays(int a[], int b[]){
		int c[] = new int[a.length+b.length];
		int i=0;
		for(int j:a)
			c[i++]=j;

		for(int k:b)
			c[i++]=k;

		return c;
	}

	public static ArrayList<Integer> mergeArrays2(int a[], int b[]){

		ArrayList<Integer> c = new ArrayList<>();

		for(int i:a)
			c.add(i);
		for(int j:b)
			c.add(j);

		return c;

	}

    public static void main(String[] args) {
    	int a[] = {1,2,3,4};
    	int b[] = {5,6,7};
    	System.out.println(Arrays.toString(mergeArrays(a,b)));
    	System.out.println(mergeArrays2(a,b));
        
    }
}