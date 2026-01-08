class Program3 {
	public static String toReverse(String str) {
		char ch[] =  str.toCharArray();
		int st = 0, end = ch.length-1;

		while(st<=end){
			char temp = ch[st];
			ch[st] = ch[end];
			ch[end] = ch[st];
			end--;st++;
		}

		String res = new String(ch);
		return res;
	    
	}
    public static void main(String[] args) {
    	System.out.println(toReverse("hello"));
    }
}