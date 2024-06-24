package Hashing.practice;

import java.util.HashSet;

public class Union_Intersection {

    public static void union(int arr1[],int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i:arr1){
            hs.add(i);
        }
        for(int i:arr2){
            hs.add(i);
        }

        for(int i:hs){
            System.out.print(i+" ");
        }
    }
    public static void Intersection(int arr1[],int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i:arr1){
            hs.add(i);
        }
        for(int i:arr2){
            if(hs.contains(i)){
                System.out.print(i+" ");
            }
        }
    }


    public static void main(String[] args) {
        int arr[] ={7,3,9};
        int arr2[] ={6,3,9,2,9,4};
//        union(arr,arr2);
        Intersection(arr,arr2);
    }
}
