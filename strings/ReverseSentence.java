// reverse sentence and words
class ReverseSentence {
	public static String sentenceReverse(String str) {
		String[] s1 = str.split(" ");
		String res = "";

		for (int i = s1.length-1; i >=0; i--) {
			String t = s1[i];
			for (int j = t.length() - 1; j >= 0; j--) {
				res += t.charAt(j);
			}
			res += " ";
		}
		return res.trim();
	}
	
	public static void main(String[] args) {
		String str = "java is an oop lang";
		System.out.println(sentenceReverse(str));
	}
}