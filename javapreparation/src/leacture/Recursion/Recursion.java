package leacture.Recursion;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.plaf.synth.SynthTextAreaUI;

public class Recursion {
    static  String digits[]={"zero","one","two","three","four","five","six","eight","nine"};
    public static void printIncreasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
    }

    public static int printFactorial(int n){
        if(n==0){
            return 1;
        }
        int fn = n*printFactorial(n-1);
        return fn;

    }


    public static int sum(int  n) {
        if (n == 1) {
            return 1;
        }
        int sumn = n + sum(n - 1);
        return sumn;
    }

    public static int fib(int n){
        if(n<=1){

            return n;
        }

        return  fib(n-1)+fib(n-2);

    }

    public static boolean isSorted(int arr[] ,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static int firstOccurance(int arr[] ,int key,int i){
       if(i==arr.length){
           return -1;
       }
        if(arr[i]==key){
           return i;
        }
        return firstOccurance(arr,key,i+1);

    }
    public static int lastOccurance(int arr[] ,int key,int i){
        if(i<0){
            return -5;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurance(arr,key,i-1);

    }
  public static int printPower(int x,int n){
        if(n==1){
            return x;
        }
        return x*printPower(x,n-1);
  }


  public static int printPowerOptimize(int x,int n){
        if(n==1){
            return x;
        }
       int halfPowerSq = printPowerOptimize(x,n/2);

        int ans = halfPowerSq*halfPowerSq;

       if(n%2==0){
           return ans;
       }else{
           return x*ans;
       }

  }

  public static int tilingProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        //vertical choice
      int fnm1 = tilingProblem(n-1);

      //horizontal choice

      int fnm2 = tilingProblem(n-2);

      int totalWays = fnm1 +fnm2;
      return totalWays;
  }
  public static void removeDublicate(String str,int idx,StringBuilder newStr,boolean map[]){
if(idx ==str.length()){
    System.out.println(newStr);
    return;
}
char currChar = str.charAt(idx);
if(map[currChar-'a']==true){
    removeDublicate(str,idx+1,newStr,map);
}else{
    map[currChar-'a']=true;
    removeDublicate(str,idx+1,newStr.append(currChar),map);
}
  }

  public static int friendsPairing(int n){

        if(n==1||n==2){
            return n;
        }
        //single
        int  fnm1 =friendsPairing(n-1);


      //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1)*fnm2;

        //totalWays
      int totalWays = fnm1+pairWays;
      return totalWays;
  }

  public static void printBinaryString(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
//        if(lastPlace==0){
//            printBinaryString(n-1,0,str.append("0"));
//            printBinaryString(n-1,1,str.append("1"));
//        }else{
//            printBinaryString(n-1,0,str.append("0"));
//        }
      printBinaryString(n-1,0,str+"0");
        if(lastPlace==0){
            printBinaryString(n-1,1,str+"1");
        }

  }
  public static void printOccurance(int arr[],int n,int key){
        if(n==arr.length){
//            System.out.print(-1);
            return;
        }
        if(arr[n]==key){
           System.out.print(n+" ");
        }
      printOccurance(arr,n+1,key);

  }

  public static void printDigits(int n){
        if(n==0){
            return;
        }
        int lastDigit = n%10;
        printDigits(n/10);
        System.out.print(digits[lastDigit]+" ");
  }

  public static int printStringLength(String str){
        if(str.length()==0){
            return 0;
        }
        return printStringLength(str.substring(1))+1;

  }
    public static void main(String[] args) {
//        int arr[] ={5,3,4,7,8,5};
//        System.out.print(lastOccurance(arr,5,arr.length-1));
//        System.out.print(printPower(5,6));
//        System.out.print(tilingProblem(4));
//        String str ="appnacollege";

//       removeDublicate(str,0,new StringBuilder(""),new boolean[26]);
//        System.out.print(friendsPairing(3));

        int arr[] ={3,2,4,5,6,2,7,2,2} ;
        int n =2001;
        String s = "abcde";


//      System.out.print(printStringLength(s));
//        printDigits(n);

        System.out.print(s.substring(1));
    }

}
