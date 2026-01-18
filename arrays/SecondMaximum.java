class SecondMaximum {
	public static int findSecondMax(int a[]){
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i=0; i<=a.length-1; i++ ) {
			if(a[i]>max1){
				max2 = max1;
				max1 = a[i];
			}
			else if(a[i]>max2 && a[i]!=max1)
				max2 = a[i];
		}
		return max2;
	}

    public static void main(String[] args) {
    	int arr[] = {10,5,5,12,12,7,3,13,13,14};
    	System.out.println(findSecondMax(arr));
    }
}