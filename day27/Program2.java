class Program2 {
    public static void main(String[] args) {
        String s = "ABBACCBBADDE";

        String res = "";

        for(int i=0; i<s.length(); i++){
        	char ch = s.charAt(i);
        	res+=ch;
        	s=s.replace(ch+"","");
        }

        System.out.println(res);
    }
}