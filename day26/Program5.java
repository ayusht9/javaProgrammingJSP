import java.util.Arrays;

public class Program5 {
    public static boolean isAnagram(String s1, String s2){
       if(s1.length()!=s2.length())
           return false;

        char[] cs1 = s1.toCharArray();
        char[] cs2 = s2.toCharArray();
        
        for (int j=0; j<cs1.length-1; j++)
            for (int i=0; i<cs1.length-1-j; i++)
                if(cs1[i]>cs1[i+1]){
                    char t1 = cs1[i];
                    char t2 = cs2[i];
                    cs1[i]=cs1[i+1];
                    cs1[i+1]=t1;
                    cs2[i]=cs2[i+1];
                    cs2[i+1]=t2;
                }

        s1 = "";
        s2 = "";

        for (int i = 0; i < cs1.length; i++)
            s1 += cs1[i];
        for (int i = 0; i < cs2.length; i++)
            s2 += cs1[i];

        return s1.equals(s2);
    }

    public static boolean isAna(String s1, String s2) {
        if(s1.length()==s2.length()){
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            char [] ch1 = s1.toCharArray();
            char [] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            String res1 = new String(ch1);
            String res2 = new String(ch2);

            return res1.equals(res2);
        }

        return false;
        
    }
    
    public static void main(String[] args) {
        System.out.println(isAnagram("silent","listen"));
        System.out.println(isAnagram("hello","olleh"));
        System.out.println(isAna("hello","olleh"));

    }
}
