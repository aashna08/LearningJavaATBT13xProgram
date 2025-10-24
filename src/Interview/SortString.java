package Interview;

import java.util.*;

public class SortString {



    public void sortStringdesc(String str)
    {
        Map<Character,Integer>hm =new  HashMap<>();
        for (Character c : str.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> sortedList=new ArrayList<>(hm.entrySet());
        Comparator<Map.Entry<Character,Integer>> comp = (a1, a2) -> a2.getValue()-a1.getValue();
        sortedList.sort(comp);

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : sortedList)
        {
            for (int i=0;i<entry.getValue();i++)
            {
                sb.append(entry.getKey());
            }

        }
        sb.toString();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        SortString ss =new SortString();
        ss.sortStringdesc("abcde");
    }
}
