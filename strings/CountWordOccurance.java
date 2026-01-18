import java.util.HashMap;
import java.util.Map;

class CountWordOccurance {
	public static void wordOccurance(String str) {

		Map<String,Integer> map = new HashMap<String, Integer>();

		for(String ch: str.split("\\s+")){
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch,1);
		}

		System.out.println(map);
	    
	}
    public static void main(String[] args) {
    	String str = "java is java is an   oop lang   lang lang  ";
    	wordOccurance(str);
        
    }
}