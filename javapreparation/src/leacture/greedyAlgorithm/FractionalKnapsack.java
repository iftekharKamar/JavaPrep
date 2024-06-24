package greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void Knapsack(int value[],int weight[],int W){
        double arr[][] = new double[value.length][2];
        for(int i =0;i<arr.length;i++){
            arr[i][0] =i;
            arr[i][1] =value[i]/(double)weight[i];
        }
        //ascendind order
        Arrays.sort(arr, Comparator.comparingDouble(o->o[1]));
        int capacity =W;
        int finalVal =0;
        for(int i = arr.length-1;i>=0;i--){
            int idx = (int)arr[i][0];
            if(capacity>=weight[idx]){//include fullItem
                finalVal +=value[idx];
                capacity -=weight[idx];
            }else{
                //inclue fractional item
                finalVal += (arr[i][1]*capacity);
                    capacity=0;
                    break;
                }
        }
        System.out.println("final value = "+ finalVal);
    }
    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[] ={10,20,30};
        int W =50;

        Knapsack(value,weight,W);
    }
}
