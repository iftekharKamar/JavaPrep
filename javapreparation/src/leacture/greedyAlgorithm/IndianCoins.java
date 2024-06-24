package greedyAlgorithm;

import java.util.ArrayList;

public class IndianCoins {
    public static void main(String[] args) {
        int coins[] ={1,2,5,10,20,50,100,500,2000};
        ArrayList<Integer> l = new ArrayList<>();
        int amount =105900;
        int count =0;
        for(int i=coins.length-1;i>=0;i--){
            if(coins[i]<=amount){
                while(coins[i]<=amount) {
                    count++;
                   l.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println(count);
        System.out.println(l);
    }
}
