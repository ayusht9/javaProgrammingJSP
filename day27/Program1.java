class Program1 {
    public static void main(String[] args) {
        String s = "ABBACCBBADDE";

        System.out.println(s);
        System.out.println();

        for(int j=0;j<s.length();j++)
	        for(int i=0; i<s.length()-1;i++){
	        	String sChar = s.substring(i,i+2);
	            if(sChar.charAt(0)==sChar.charAt(1)){
	                s=s.replace(sChar,"");
	                System.out.println(s);
	            }
	        }

	    System.out.println();    
        System.out.println(s);
    }
}