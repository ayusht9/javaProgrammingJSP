import java.util.Arrays;
import java.lang.Integer;

class Program3 {
	public static int maxArrayElement(int arr[]) {
		int max=0;

		for(int i=1; i<=arr.length-1; i++){
			if(arr[i]>arr[max])
				max=i;
		}
		return arr[max];
	}

	public static int minArrayElement(int arr[]) {
		int min=Integer.MAX_VALUE;

		for(int i=0; i<=arr.length-1; i++){
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}

    public static void main(String[] args) {
        int arr[] = {-100,20,40,2};

        System.out.println(maxArrayElement(arr));
        System.out.println(minArrayElement(arr));
    }
}