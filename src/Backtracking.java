public class Backtracking {
    public static void changeArr(int a[],int i,int val){
         //base case
         if(i==a.length){
             display(a);
             return;
         }
        //recursion
        a[i]=val;
        changeArr(a,i+1,val+1);  //func call
        a[i]=a[i]-2;  //backtracking step
    }

    public static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    //find subsets of string
    public static void findSubset(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //yes choice
        findSubset(str,ans+str.charAt(i),i+1);
        //No choice
        findSubset(str,ans,i+1);
    }


    //find permutations
    public static void findPermutations(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion ------O(n*n!)
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
           String newstr=str.substring(0,i)+ str.substring(i+1);
            findPermutations(newstr,ans+curr);
        }
    }

    //------------------N-queens------------------
    //public static void nQueens(char board[][],int row)
    public static boolean nQueens(char board[][],int row){
        //base case
        if(row==board.length){
            count++;
            //printBoard(board);
            return true;
            //return;
        }
        //column
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nQueens(board,row+1)){
                    return true;
                }
                //nQueens(board,row+1);
                board[row][j]='x';
            }
        }
        return false;
    }

    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]== 'Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diag right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    static int count=0;

    public static void printBoard(char board[][]){
        System.out.println("------ chess board --------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    //-----------------------N-Queens-----------------------------------

    public static int facto(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*facto(n-1);
        }
    }

    //Grid ways
    public static int gridWays(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){  //cond for last cell
            return 1;
        }else if(i==n || j==n){  //boundary condition
           return 0;
        }
        //int w1=gridWays(i+1,j,n,m);  //O(2^(n+m)) too much bad time complexity
        //int w2=gridWays(i,j+1,n,m);
        //return w1+w2;
        return facto(n-1+m-1)/(facto(n-1)*facto(m-1));  //O(n) good time complexity

    }

     //-----------Sudoku solver------------

    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        //base case
        if(row==9){
            return true;
        }
        //recursion
        int nextRow=row,nextCol=col+1;
        if(col+1 == 9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku,nextRow,nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafes(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }

    public static boolean isSafes(int sudoku[][],int row,int col,int digit){
        //column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }

        //row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }

        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        //3x3 grid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[]=new int[5];
        //changeArr(a,0,1);
        //display(a);

        String str="abc";
       // findSubset(str," ",0);
        //findPermutations(str," ");


       // int n=4;
//        char board[][]=new char [n][n];
//        //initialize
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                board[i][j]='x';
//            }
//        }
        //nQueens(board,0);
//        if(nQueens(board,0)){
//            System.out.println("Solution is possible.");
//            printBoard(board);
//        }else{
//            System.out.println("Solution is not possible.");
//        }
        //System.out.println("Total ways to solve n queens= "+count);

        //int n=3,m=3;
        //System.out.println(gridWays(0,0,n,m));

        //System.out.println(facto(n));

        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                {4,9,0,1,5,7,0,0,2},
                {0,0,3,0,0,4,1,9,0},
                {1,8,5,0,6,0,0,2,0},
                {0,0,0,0,2,0,0,6,0},
                {9,6,0,4,0,5,3,0,0},
                {0,3,0,0,7,2,0,0,4},
                {0,4,9,0,3,0,0,5,7},
                {8,2,7,0,0,9,0,1,3}};

        if(sudokuSolver(sudoku,0,0)){
            System.out.println("solution exists");
            printSudoku(sudoku);
        }else {
            System.out.println("solution does not exists.");
        }


    }

}
