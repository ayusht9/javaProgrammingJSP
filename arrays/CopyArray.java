import java.util.Arrays;

class CopyArray {

	public static int[] copyArray(int[] a) {
		int b[] = new int[a.length];
        for(int i=0; i<=a.length-1; i++){
        	b[i]=a[i];
        }
        return b;
	}

	public static void printArray(int[] a) {
        for(int element:a)
        	System.out.print(element+" ");
        System.out.println();
	}

    public static void main(String[] args) {
        int a[] = {10,20,30};

        int b[] = copyArray(a);
        printArray(b);

        // print array built in method
        System.out.println(Arrays.toString(b));
    }
}