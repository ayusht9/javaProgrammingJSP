class LinearSearch {
	public static boolean linearSearch(int[] arr, int search) {
		boolean res = false;
		for(int i: arr)
			if(i==search){
				res = true;
				break;			
			}
		return res;
	}

    public static void main(String[] args) {
    	int[] arr = {10,20,30,40,50};
		int search = 30;
		
    	System.out.println(linearSearch(arr,search));
    }
}