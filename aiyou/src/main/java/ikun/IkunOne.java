package ikun;

import java.util.*;

public class IkunOne {
    public static void main(String[] args) {

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        //使用哈希表解题
        Map<String,List<String>> map=new HashMap<>();
        for (String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            List<String> list=map.getOrDefault(key,new ArrayList<>());
            list.add(str);
            map.put(key,list);
        }

        return new ArrayList<List<String>>(map.values());
    }

//    给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
//
//    字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次
}
