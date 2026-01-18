// remove duplicate character replace method
class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String s = "ABBACCBBADDE";

        String res = "";

        while(s.length()>0){
        	char ch = s.charAt(0);
        	res+=ch;
        	s=s.replace(ch+"","");
        }

        System.out.println(res);
    }
}