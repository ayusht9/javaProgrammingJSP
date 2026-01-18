// remove duplicate characters collection method
import java.util.LinkedHashSet;
import java.util.Set;

class RemoveDuplicate {
	public static void removeDuplicate(String str) {
		Set<Character> set = new LinkedHashSet<Character>();
		for(char ch: str.toCharArray())
			set.add(ch);
		System.out.println(set);
	}

    public static void main(String[] args) {
    	String str = "daddddyyyy";
    	removeDuplicate(str);
    }
}