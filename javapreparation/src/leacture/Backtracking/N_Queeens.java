package leacture.Backtracking;

public class N_Queeens {
    public static void nQueens(char ch[][],int i){

        if(i==ch.length){
            printBoard(ch);
            return;
        }
        for(int j=0;j<ch.length;j++){
            if(issafe(ch,i,j)) {
                ch[i][j] = 'Q';
                nQueens(ch, i + 1);
                ch[i][j] = 'x';
            }
        }
    }

    public static boolean issafe(char ch[][],int row,int col){
        //vertical up
        for(int k=row-1;k>=0;k--){
            if(ch[k][col]=='Q'){
                return false;
            }
        }

        //diagonal left up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(ch[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1,j=col+1;i>=0&&j<ch.length;i--,j++){
            if(ch[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char ch[][]){
        System.out.println("--------chessBoard---------");
        for(int i =0;i<ch.length;i++){
            for(int j=0;j<ch.length;j++){
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char ch[][] = new char[4][4];
        for(int i =0;i<ch.length;i++){
            for(int j =0;j<ch.length;j++){
                ch[i][j]='x';
            }
        }

        nQueens(ch,0);
    }
}
