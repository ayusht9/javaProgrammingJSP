class ReverseString {
    public static void main(String[] args) {
    	String string = "java";
    	
		// method 1
		char[] ch = string.toCharArray();
    	int st = 0, end = ch.length-1;
    	while(st<end){
    		char temp = ch[st];
    		ch[st]=ch[end];
    		ch[end]=temp;
    		st++;
    		end--;
    	}
    	System.out.println(ch);

		// method 2
    	String rev = new StringBuffer(string).reverse().toString();
    	System.out.println(rev);
    }
}