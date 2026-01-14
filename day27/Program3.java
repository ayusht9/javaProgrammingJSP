class Program3 {
    public static void main(String[] args) {
        String s = "ABBACCABB";
        while(true){
        	boolean flag = true;
        	for (int i=0; i<s.length()-1; i++) {
        		if(s.charAt(i) == s.charAt(i+1)){
        			s = s.substring(0,i)+s.substring(i+2);
        			flag = false;
        			break;
        		}
        		
        	}
        	if(flag){
        		System.out.println(s);
        		break;
        	}
        }
    }
}