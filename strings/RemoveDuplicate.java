// remove duplicate characters collection method
import java.util.LinkedHashSet;
import java.util.Set;

class RemoveDuplicate {
	public static Set<Character> removeDuplicate(String str) {
		Set<Character> set = new LinkedHashSet<Character>();
		for(char ch: str.toCharArray())
			set.add(ch);
		return set;
	}

    public static void main(String[] args) {
    	String str = "daddddyyyy";
    	System.out.println(removeDuplicate(str));
    }
}