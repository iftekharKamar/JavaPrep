package Hashing.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class itinearyTicket {
    public static String startKey(HashMap<String,String> s1,HashMap<String,String> s2 ){
        for(String key: s1.keySet()){
            if(!s2.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String s [][]={{"Chennai","Bengaluru"},
                {"Mumbai","Delhi"},
                {"Goa","Chennai"},
                {"Delhi","Goa"}};
        HashMap<String,String> from_To =new HashMap<>();
        for(int i=0;i<s.length;i++){
            from_To.put(s[i][0],s[i][1]);
        }
        System.out.println(from_To);
        HashMap<String,String> to_From =new HashMap<>();
        for(int i=0;i<s.length;i++){
            to_From.put(s[i][1],s[i][0]);
        }
        System.out.println(to_From);
        String start = startKey(from_To,to_From);
        System.out.print(start);
        for(String key:from_To.keySet()){
            System.out.print("->"+from_To.get(start));
            start =from_To.get(start);
        }
    }
}
