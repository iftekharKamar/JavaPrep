package leacture;
public class loop {
    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int a = x;
        if(x<0){
            return false;
        }
        while(x>0){
            int temp =x%10;
            reverse = reverse*10+temp;
            x=x/10;

        }
        if(a!=reverse){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
       int n =121;
       System.out.print(isPalindrome(n));



    }
}
