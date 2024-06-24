package leacture.xtra;
import java.util.*;
public class functionsAndMethod {



    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    public static int binomialCoefficient(int n,int r){
        int bc= factorial(n)/(factorial(r)*factorial(n-r));
        return bc;
    }

    public static boolean isPrime(int a){
        //corner cases
        if(a==1 || a==2){
            return true;
        }

        boolean isPrime  =true;
        for(int i =2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                isPrime = false;
                break;
            }

        }
        return isPrime;
    }

    public static void primeInRange(int n){
        for(int i =2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }


        }
        System.out.println();
    }

    public static void BinaryToDecimal(int n){
        int myno = n;
        int pow =0;
        int dec =0;
        while(n>0){
            int lD =n%10;
            dec =dec+(lD*(int)Math.pow(2,pow));
            pow++;
            n =n/10;
        }
        System.out.println("decimal no of:"+myno+"="+dec);
    }
public static void decimalTobinary(int n){
        int Myno = n;
        int pow = 0;
        int binNum =0;
        while(n>0){
            int rem = n%2;
            binNum = binNum+(rem*(int)(Math.pow(10,pow)));
            pow++;
            n=n/2;
        }
        System.out.print("Binary no : "+Myno+"="+binNum);
}
    public static void main(String[] args) {

//        int ans = binomialCoefficient(5,2);
//        System.out.print(ans);
//        primeInRange(20);
        decimalTobinary(13);
    }
}
