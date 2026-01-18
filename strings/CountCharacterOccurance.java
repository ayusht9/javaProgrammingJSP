// count occurance of each character

import java.util.HashMap;
import java.util.Map;

class CountCharacterOccurance {
	public static void characterOccurance(String str) {
		Map<Character,Integer> map = new HashMap<Character, Integer>();

		for(Character ch: str.toCharArray()){
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch,1);
		}

		System.out.println(map);
	    
	}
    public static void main(String[] args) {
    	characterOccurance("banana");
        
    }
}