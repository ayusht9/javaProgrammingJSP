import java.util.Arrays;

class CubeElements {
	public static int[] cubeArrayElements(int[] a) {	
		int b[] = new int[a.length];
        for(int i=0; i<=a.length-1; i++){
        	b[i]=a[i]*a[i]*a[i];
        }
        return b;
	}

    public static void main(String[] args) {
    	int a[] = {1,2,3,4,5};
    	int b[] = cubeArrayElements(a);

        System.out.println(Arrays.toString(b));
    }	
}