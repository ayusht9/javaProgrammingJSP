class Program1 {
    public static void main(String[] args) {
    	String string = "java";
    	char[] ch = string.toCharArray();
    	System.out.println(ch);

    	int st = 0, end = ch.length-1;
    	while(st<end){
    		char temp = ch[st];
    		ch[st]=ch[end];
    		ch[end]=temp;
    		st++;
    		end--;
    	}

    	System.out.println(ch); // overridden
    	// String res = new String(ch);
    	// System.out.println(res);

    	String rev = new StringBuffer(string).reverse().toString();
    	System.out.println(rev);
    }
}