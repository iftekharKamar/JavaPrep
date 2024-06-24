package leacture.BitManupulation;

public class Bit {

    public static boolean isOdd(int n){
        if((n&1)!=0){
            return true;
        }
        return false;
    }

    public static void ithBit(int n ,int bit){
        if((n&(1<<bit))==0){
            System.out.print("ith bit is zero");
        }else{
            System.out.print("ith bit is 1");
        }
    }

    public static int setIthBit(int n,int i ){
         return n|(1<<i);
    }

    public static int clearIthBit(int n,int i){
        return n&(~(1<<i));
    }

    public static int clearLastIthBits(int n ,int i){
        int bitmask = (~0)<<i;
        return n&bitmask;

    }

    public static int updateIthBit(int n,int i,int newBit){
//        if(newBit ==0){
//            return clearIthBit(n,i);
//        }else{
//            return setIthBit(n,i);
//        }

        n= clearIthBit(n,i);
        int BitMask = newBit<<i;
        return n|BitMask;

    }

    public static int clearRangeBits(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n&bitMask;
    }

    public static boolean PowerOfTwo(int n){
        if((n&n-1)==0){
            return true;
        }
        return false;
    }

    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if(isOdd(n)==true){
                count++;

            }
           n= n>>1;
        }
        return count;
    }

    public static int fastExponentiation(int a,int n){
        int ans =1;
        while(n>0){
            if (isOdd(n) ==true) {
                ans = ans*a;
            }
            a =a*a;
            n=n>>1;
        }
        return ans;
    }

    public static void swapUsingBit(int a , int b){
        a=a^b;
        b= a^b;
        a=a^b;
        System.out.print("After swap : a = "+a+"After swap : b = "+b);
    }
    public static void main(String[] args) {
        char ch ='A';
       int value = ch;
       System.out.print(65|32);


        //Binary AND
//        System.out.print(5&6);

        //Binary OR
//        System.out.print((5|6));

        //Binary XOR
//        System.out.print((5^6));

        //Ones complement
//        System.out.print((~5));

        //Binary Left shift
//        System.out.print(5<<2);

        //Binary Right shift
//        System.out.print(7>>2);


    }
}
