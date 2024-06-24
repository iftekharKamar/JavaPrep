package Hashing;

import java.util.
*;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class hashset {
    public static void main(String[] args) {
        TreeSet<Integer> hs = new TreeSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(3);
        hs.add(4);
        hs.add(1);
        hs.add(3);


        hs.add(8);
        hs.add(9);
        hs.add(30);
//        Iterator it = hs.iterator();
//        while (it.hasNext()){
//            System.out.print(it.next());
//        }

        for(Integer i :hs){
            System.out.print(i+" ");
        }

    }
}
