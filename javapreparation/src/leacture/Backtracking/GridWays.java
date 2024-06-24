package leacture.Backtracking;

public class GridWays {
    public static int gridWays(int i,int j, int n,int m){
        //base case
        if(i==n-1&&j==m-1){
            return 1;
        } else if (i==n ||j==n) {
            return 0;
        }
        int w1 = gridWays(i+1,j,n,m);
        int w2 = gridWays(i,j+1,n,m);
        return w1+w2;
    }

    public static void gridWaysLinear(int n,int m){
        int fnm = factorial(n+m-2);
        System.out.println(fnm);
        int fnm1 =factorial(n-1);
        System.out.println(fnm1);
        int fmm1 = factorial(m-1);
        System.out.println(fmm1);

        int ans = fnm/(fnm1*fmm1);
        System.out.println(ans);
    }

    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }

       return n*factorial(n-1);

    }
    public static void main(String[] args) {
        int n=3;
        int m =3;
        gridWaysLinear(3,3);

    }
}
