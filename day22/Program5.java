import java.util.Arrays;

class Program5 {
	public static int findSecondMin(int a[]){
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (int i=0; i<=a.length-1; i++ ) {
			if(a[i]<min1){
				min2 = min1;
				min1 = a[i];
			}
			else if(a[i]<min2 && a[i]!=min1)
				min2 = a[i];
		}
		return min2;
	}

	public static int findThirdMin(int a[]){
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int min3 = Integer.MAX_VALUE;

    	for (int i = 0; i < a.length; i++) {
	        if (a[i] < min1) {
	            min3 = min2;
	            min2 = min1;
	            min1 = a[i];
        	} else if (a[i] < min2 && a[i] != min1) {
            	min3 = min2;
            	min2 = a[i];
        	} else if (a[i] < min3 && a[i] != min1 && a[i] != min2) 
            	min3 = a[i];
        }
		return min3;
	}

	public static int findThirdMax(int a[]){
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;

    	for (int i = 0; i < a.length; i++) {
	        if (a[i] > max1) {
	            max3 = max2;
	            max2 = max1;
	            max1 = a[i];
        	} else if (a[i] > max2 && a[i] != max1) {
            	max3 = max2;
            	max2 = a[i];
        	} else if (a[i] > max3 && a[i] != max1 && a[i] != max2) 
            	max3 = a[i];
        }
		return max3;
	}

    public static void main(String[] args) {
    	int arr[] = {10,5,5,12,12,7,3,13,13,14};
    	int arr1[] = {1,2,3,4,5,6};
    	System.out.println(findSecondMin(arr));
    	System.out.println(findThirdMin(arr1));
    	System.out.println(findThirdMax(arr1));
    }
}