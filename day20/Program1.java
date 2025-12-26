class Program1 {
	public static void printAtEvenIndex(int arr[]) {
        for(int i=0;i <=arr.length-1; i++)
        	if(i%2==0)
        		System.out.print(arr[i]+" ");
        System.out.println();
	}

	public static void printAtOddIndex(int arr[]) {
        for(int i=0;i <=arr.length-1; i++)
        	if(i%2==1)
        		System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void printEvenElements(int arr[]) {
        for(int i=0;i <=arr.length-1; i++){
        	if(arr[i]%2==0)
        		System.out.print(arr[i]+" ");
        }
        System.out.println();
	}

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int arr2[] = {1,2,3,4,5};

        // printAtEvenIndex(arr);
        // printAtOddIndex(arr);
        printEvenElements(arr2);
    }
}