import java.util.HashMap;

class CountOccurance {
	public static HashMap<Integer,Integer> occurance(int[] a) {
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i: a){
			if(hm.containsKey(i))
				hm.put(i,hm.get(i)+1);
			else
				hm.put(i,1);
		}
		return hm;	    
	}

    public static void main(String[] args) {
    	int arr[] = {10,20,10,20,30,40,10,30};
    	System.out.println(occurance(arr));
    }
}