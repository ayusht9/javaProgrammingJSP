import java.util.LinkedHashSet;
import java.util.Arrays;

class RemoveDuplicate {
	public static LinkedHashSet<Integer> removeDuplicate(int[] arr) {

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();

		for(int i:arr)
			linkedHashSet.add(i);

		return linkedHashSet;

	}
    public static void main(String[] args) {
    	int arr[] = {10,20,10,20,30,40,10,30};

    	int res[] = Arrays.stream(arr).distinct().toArray();

    	System.out.println(Arrays.toString(res));
    	System.out.println(removeDuplicate(arr));
        
    }
}