import java.util.Arrays;
class Program3 {
	public static int getMissing(int[] a){
		int last = a[a.length-1];
		int idealSum = (a[0]+last)*last/2;
		int actualSum = 0;

		for(int i=0; i<a.length; i++){
			actualSum+=a[i];
		}

		int missing = idealSum - actualSum;

		return missing;
	}
    public static void main(String[] args) {
    	int[] a = {1,2,4,5};
    	System.out.println(getMissing(a));    
    }
}