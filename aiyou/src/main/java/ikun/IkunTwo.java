package ikun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IkunTwo {
    public static void main(String[] args) {
        System.out.println(findAnagrams("abab", "ab"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        if (s.length()==0) return result;
        char[] chars = p.toCharArray();
        Arrays.sort(chars);
        String str=new String(chars);
        for (int i=0;i<s.length()-p.length()+1;i++){
            String s1 = s.substring(i, i + p.length());
            char[] chars1 = s1.toCharArray();
            Arrays.sort(chars1);
            String str1=new String(chars1);
            if (str1.equals(str)){
                result.add(i);
            }
        }
        return result;
    }
}
