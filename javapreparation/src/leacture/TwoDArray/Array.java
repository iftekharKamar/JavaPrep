package leacture.TwoDArray;

import java.sql.SQLSyntaxErrorException;

public class Array {

    public static int linearSearch(int n[],int key){
        for(int i =0;i<n.length;i++){
            if(n[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int largetNumber(int n[]){
        int max =0;
        for(int i =0;i<n.length;i++){
            if(n[i]>max){
                max=n[i];
            }

        }
        return max;
    }

    public static void swap(int a,int b){
        int temp =a;
         a=b;
         b=temp;
    }
    public static void reverseArray(int n[]){
        int start =0;
        int end =n.length-1;
        while(start<end){
            int temp = n[end];
            n[end] =n[start];
            n[start] = temp;
            start++;
            end--;
        }

    }

    public static int binarysearch(int n[],int key){
        int start=0;
        int end=n.length-1;

        while(start<=end){
            int mid =(start+end)/2;
            if(n[mid]==key){
                return mid;
            }
            if(n[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void printPairs(int n[]){
        int tp =0;
        for(int i=0;i<n.length;i++){
            int curr = n[i];
            for(int j =i+1;j<n.length;j++){
                System.out.print("("+curr+","+n[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("total number of pair : "+tp);
    }

    public static void printSubArray(int n[]){
        for(int i =0;i<n.length;i++){
            int start = i;
            for(int j =i;j<n.length;j++){
               int end =j;
               for(int k =start;k<=end;k++){
                   System.out.print(n[k]+" ");
               }
               System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxSubarray(int n[]){
        int max =Integer.MIN_VALUE;
        int maxcount =0;
        int prefix[]  =new int[n.length];
        prefix[0] = n[0];

        for(int i=1;i<n.length;i++){
          prefix[i]=  prefix[i-1]+n[i];
        }
        for(int i =0;i<n.length;i++){
            int start =i;
            for(int j =i;j<n.length;j++){
                int end =j;

                maxcount =start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(max<maxcount){
                    max=maxcount;
                }


            }

        }
        System.out.print("max sum = "+max);

    }

    public static boolean NegativeOrNot(int n[]){

        for(int i =0;i<n.length;i++){
            if(n[i]>=0){
                return true;
            }

        }
        return false;
    }

    public static void KADANES_ALGORITHM(int n[]){
        int maxSum =Integer.MIN_VALUE;
        int currentSum =0;
        if(NegativeOrNot(n)==true){
            for(int i =0;i<n.length;i++){
                currentSum +=n[i];
                if(currentSum<0){
                    currentSum=0;
                }
                maxSum  =Math.max(currentSum,maxSum);
            }

            System.out.println("max sum = "+ maxSum);
        }else{
            int max =Integer.MIN_VALUE;
            int maxcount =0;
            int prefix[]  =new int[n.length];
            prefix[0] = n[0];

            for(int i=1;i<n.length;i++){
                prefix[i]=  prefix[i-1]+n[i];
            }
            for(int i =0;i<n.length;i++){
                int start =i;
                for(int j =i;j<n.length;j++){
                    int end =j;

                    maxcount =start==0?prefix[end]:prefix[end]-prefix[start-1];
                    if(max<maxcount){
                        max=maxcount;
                    }


                }

            }
            System.out.print("max sum = "+max);
        }




    }

    public static int TrappedWater(int n[]){
        //calculate left max boundary
        int leftMax[] = new int[n.length];
        leftMax[0] = n[0];
        for(int i =1;i<n.length;i++){
            leftMax[i] =Math.max(n[i],leftMax[i-1]);
        }
        //calculate right max boundary
        int rightMax[]= new int[n.length];
        rightMax[n.length-1] = n[n.length-1];
        for(int i =(n.length-2);i>=0;i--){
            rightMax[i]  =Math.max(n[i],rightMax[i+1]);
        }
        int trappedWater =0;
        //loop
        for(int i =0;i<n.length;i++){
           int waterlevel = Math.min(leftMax[i],rightMax[i]);
           trappedWater += waterlevel-n[i];
        }
        return trappedWater;


    }

    public static int BuySellStock(int prices[]){
        int n = prices.length;
        int buyPrice  =Integer.MAX_VALUE;
        int maxProfit =0;

        for(int i =0;i<n;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] -buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }




    public static void main(String[] args) {
        int n[]={0,1,0,2,1,0,1,3,2,1,2,1};


        System.out.print(TrappedWater(n));
       }
    }
//        int marks[] ={1,50,7,8,40,3,6,9};
//        int max =Integer.MIN_VALUE;
//        for(int i =0;i<marks.length;i++){
//            if(marks[i]>max){
//                max=marks[i];
//            }
//        }
//        System.out.print(max);
//    }


