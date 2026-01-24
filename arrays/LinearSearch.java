class LinearSearch {
	public static boolean linearSearch(int[] arr, int search) {
		for(int i: arr)
			if(i==search){
				return true;		
			}
		return false;
	}

    public static void main(String[] args) {
    	int[] arr = {10,20,30,40,50};
		int search = 30;
		
    	System.out.println(linearSearch(arr,search));
    }
}