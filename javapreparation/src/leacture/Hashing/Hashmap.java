package Hashing;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm = new HashMap<>();

        //insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        System.out.println(hm);

        //get O(n)

        System.out.println(hm.get("India"));
    }
}
