package leacture.Backtracking;

public class practice {

    public static boolean isSafe(int n[][] ,int x,int y){
        return (x>=0&&x<n.length&&y>=0&&y<n.length&&n[x][y]==1);
    }

    public static boolean solveMaze(int n[][]){
        int N = n.length;
        int sol[][] =new int[N][N];
        if(solveMazeUntil(n,0,0,sol)==false){
            System.out.print("Solution does'nt exist");
            return false;
        }
        printSolution(sol);
        return true;
    }

    public static boolean solveMazeUntil(int n[][],int x, int y,int sol[][]){
        if(x==n.length-1&&y==n.length-1&&n[x][y]==1){
            sol[x][y]=1;
            return true;
        }
        if(isSafe(n,x,y)==true){
            if(sol[x][y]==1)
                return false;
            sol[x][y]=1;
            if(solveMazeUntil(n,x+1,y,sol))
                return  true;
            if(solveMazeUntil(n,x,y+1,sol))
                return true;
            sol[x][y]=0;
            return false;
        }
        return false;
    }


    public static void printSolution(int sol[][]){
        for(int i =0;i<sol.length;i++){
            for(int j =0;j<sol.length;j++){
                System.out.print(" "+sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    /// keypad combination

    final static char [][] L ={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'}
    ,{'t','u','v'},{'w','x','y','z'}};


    public static void letterCombinations(String D){
        int len = D.length();
        if(len==0){
            System.out.println("");
            return;
        }
        bfs(0,len,new StringBuilder(),D);
    }

    public  static void bfs(int pos,int len,StringBuilder sb,String D){
        if(pos == len){
            System.out.println(sb.toString());
        }
        else{
            char[] letters =L[Character.getNumericValue(D.charAt(pos))];
            for(int i =0;i<letters.length;i++){
                bfs(pos+1,len,new StringBuilder(sb).append(letters[i]),D);
            }
        }
    }


    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

          solveMaze(maze);
    }
}
