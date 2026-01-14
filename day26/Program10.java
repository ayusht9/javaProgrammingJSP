import java.util.LinkedHashSet;
import java.util.Set;

class Program10 {
	public static void removeDuplicate(String str) {

		Set<Character> set = new LinkedHashSet<Character>();

		for(char ch: str.toCharArray())
			set.add(ch);



		System.out.println(set);
	}

	public static void removeDuplicate2(String s) {

		String res = "";
		while(s.length()>0){
			char ch = s.charAt(0);
			res+=ch;
			s=s.replace(ch+"","");
		}

		System.out.println(res);
	}

	public static void getDuplicate(String s) {


		String res = "";
		int count=0;
		while(s.length()>0){
			char ch = s.charAt(0);
			res+=ch;
			s=s.replace(ch+"","");
			count++;
		}

		System.out.println(count);

	}

    public static void main(String[] args) {
    	String str = "daddddyyyy";
    	removeDuplicate(str);
    	removeDuplicate2(str);
    	getDuplicate(str);
        
    }
}