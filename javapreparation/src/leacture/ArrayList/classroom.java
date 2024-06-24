package leacture.ArrayList;

import java.util.ArrayList;



public class classroom {
    //O(n*n)
    public static int printMostWate(ArrayList<Integer> list){
        int maxWater =0;
        for(int i =0;i<list.size();i++){
            for(int j =i+1;j<list.size();j++){
             int ht = Math.min(list.get(i), list.get(j));
             int wdt = j-i;
             int currWater = ht*wdt;
             maxWater=Math.max(maxWater,currWater);

            }
        }
        return maxWater;
    }
    //O(n)
    public static int twoPointerApporach(ArrayList<Integer> l){
        int maxWater = 0;
        int x =0;
        int y =l.size()-1;
        while (x<y) {
            int ht = Math.min(l.get(x), l.get(y));
            int wdt = y-x;
            int currrWater = ht * wdt;
            maxWater=Math.max(maxWater,currrWater);
            if (l.get(x) <l.get(y)) {
                x++;
            } else {
                y--;
            }
        }
        return maxWater;
    }

    public static boolean sortedroated(ArrayList<Integer> l,int target){
        int bp = breakingPoint(l);
        int lp =bp+1;
        int rp =bp;
        int n =l.size();

        while(lp!=rp){
            if(l.get(lp)+l.get(rp)==target){
                return true;
            }
            if(l.get(lp)+l.get(rp)<target){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static int breakingPoint(ArrayList<Integer> l){
        int bp =-1;
        for(int i =0;i<l.size();i++){
            if(l.get(i)> l.get(i+1)){
                bp =i;
                break;
            }
        }
        return bp;
    }

    public static ArrayList<Integer> beautifulArray(int n){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
       while(l.size()<n){
            ArrayList<Integer> temp = new ArrayList<>();

            for(Integer e:l){
                if(2*e-1<=n)temp.add(e*2-1);
            }
            for(Integer e:l){
                if(2*e<=n)temp.add(e*2);
            }
            l = temp;
        }
        return l;
    }
    public static void main(String[] args) {
        int n=4;

        System.out.print(beautifulArray(n));
    }
}
