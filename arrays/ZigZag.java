import java.util.Arrays;
class ZigZag {
	public static int[] zigZagArray(int a[], int b[]) {

		int[] c = new int[a.length+b.length];

		int j=0;
		int k=0;

		for(int i=0; i<c.length;){			
			if(j<a.length){
				c[i++]=a[j++];
			}
			if(k<b.length)
				c[i++]=b[k++];
		}
        return c;   
	}

	
    public static void main(String[] args) {
        
        int[] a = {10,30,50};
        int[] b = {20,40,60,65,75,85};

        int c[] = zigZagArray(a,b);

        c = zigZagArray(a,b);

        System.out.println(Arrays.toString(c));

    }
}