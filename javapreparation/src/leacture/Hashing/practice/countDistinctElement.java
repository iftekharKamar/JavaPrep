package leacture.Hashing.practice;

import java.util.HashSet;

public class countDistinctElement {
    public static void main(String[] args) {
        int nums[] ={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }

        System.out.print(hs.size());
    }
}
