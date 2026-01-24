import java.lang.Integer;

class MinMaxElement {
	public static int maxArrayElement(int arr[]) {
		int max=Integer.MIN_VALUE;

		for(int i=1; i<arr.length; i++){
			if(arr[i]>max)
				max=i;
		}
		return arr[max];
	}

	public static int minArrayElement(int arr[]) {
		int min=Integer.MAX_VALUE;

		for(int i=0; i<arr.length; i++){
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