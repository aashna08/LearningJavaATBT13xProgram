package Interview;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring01 {

    //gives length of longest substring
    public static void longestString(String str)
    {
        int start=0;
        int end=0;
        int maxLength=0;
        Map<Character,Integer> hm=new HashMap<>();
        for(end=0;end<str.length();end++)
        {
            if(hm.containsKey(str.charAt(end)))
            {
                start=Math.max(start,hm.get(str.charAt(end))+1); //update start
            }
            hm.put(str.charAt(end),end);
            maxLength=Math.max(maxLength,(end-start)+1);
        }

        System.out.println(maxLength);
    }

    public static void longestSubstringwithPrint(String str)
    {
        int start=0;
        int end=0;
        int maxLength=0;
        int maxStart=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(end=0;end<str.length();end++)
        {
            if(hm.containsKey(str.charAt(end)))
            {
                start=Math.max(start,hm.get(str.charAt(end))+1);
            }
            hm.put(str.charAt(end),end);
            if(maxLength<(end-start)+1)
            {
                maxLength=(end-start+1);
                maxStart=start;
            }

        }
        System.out.println("Max Length is "+maxLength);
        System.out.println("SubString is "+str.substring(maxStart,maxStart+maxLength));
    }

    public static void main(String[] args) {
        longestSubstringwithPrint("abcab");

    }
}
