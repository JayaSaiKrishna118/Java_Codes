package String_codes;
/*A java program to find the longest substring length which doesn't
contain any repeating characters in given string
Input: abbac - Output - bac - count -3
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class Longest_Substring_count {
    public static void main(String[] args) {
    lenghtoftheLongestsubstring("java");
    }

    public static void lenghtoftheLongestsubstring(String s) {
        String longestSubstring = null;
        int longestSubstringlength = 0;

        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        char[] arr = s.toCharArray();

        for(int i=0;i < arr.length; i++){
            char ch = arr[i];
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }
            else{
                i = map.get(ch);
                map.clear();
            }

            if(map.size()>longestSubstringlength){
                longestSubstringlength = map.size();
                longestSubstring = map.keySet().toString();
            }
        }
        System.out.println("The longest substring: "+longestSubstring);
        System.out.println("The longest substring lenght: "+longestSubstringlength);
    }
}
