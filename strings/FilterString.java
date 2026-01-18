// Filter other than alphabets
public class FilterString {
	public static void filterString(String s) {
		String res = "";

		for(int i=0; i<s.length(); i++){		
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
				res+=ch;
		}
		System.out.println(res);
	}
    public static void main(String[] args) {
        filterString("babc124ABC");
    }
}