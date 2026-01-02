import java.util.Arrays;
class Program4 {
	public static void bubbleSort(int[] a) {
		for(int i=0; i<a.length-1;i++){
			for(int j=0; j<a.length-1-i; j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}System.out.println(Arrays.toString(a));

			}System.out.println();
		}
	    
	}
    public static void main(String[] args) {
        int[] a = {10,5,11,6,20,1,3};
        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}