import java.util.HashMap;
class Program6 {
	public static void isAnagram(String s1, String s2) {
		if(s1.length()!=s2.length())
			System.out.println("no");

		HashMap<Character, Integer> h1 = new HashMap<>();
		HashMap<Character, Integer> h2 = new HashMap<>();

		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(5));

		for(int i=0; i<s1.length(); i++){
			char ch = s1.charAt(i);

			h1.put(ch,h1.get(ch)+1);

			System.out.println(h1);
		}

		// for(int j=0; j<s2.length(); j++)
		// 	h2.put(s2.charAt(j),j+1);

		System.out.println(h1);
		// System.out.println(h2);
	    
	}
    public static void main(String[] args) {
        isAnagram("listen","silent");
    }
}