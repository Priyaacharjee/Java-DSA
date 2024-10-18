import java.util.*;
public class MultiDimensionalArrays {

    public static void display(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean search(int matrix[][],int row,int col,int key){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==key){
                    System.out.println("Found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found.");
        return false;
    }

    public static void findmaxmin(int a[][],int row,int col){
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
                if(a[i][j]<min){
                    min=a[i][j];
                }
            }
        }
        System.out.print("The max element is:"+max);
        System.out.print("\nThe min element is:"+min);
    }

    //Spiral matrix
    public static void printSpiral(int a[][],int row,int col){
       int startRow=0,startCol=0,endrow=row-1,endcol=col-1;
       while(startRow<=endrow &&  startCol<=endcol){
           //top
           for(int j=startCol;j<=endcol;j++){
               System.out.print(a[startRow][j]+" ");
           }

           //right
           for(int i=startRow+1;i<=endrow;i++){
               System.out.print(a[i][endcol]+" ");
           }

           //bottom
           for(int j=endcol-1;j>=startCol;j--){
               if(startRow == endrow){
                   break;
               }
               System.out.print(a[endrow][j]+" ");
           }

           //left
           for(int i=endrow-1;i>=startRow+1;i--){
               if(startCol == endcol){
                   break;
               }
               System.out.print(a[i][startCol]+" ");
           }
           startCol++;
           startRow++;
           endrow--;
           endcol--;

       }
    }

    //Diagonal Sum
    public static int diagonalsum(int a[][],int row,int col){
        int sum=0;
//        for(int i=0;i<row;i++){          //TC=O(n^2)
//            for(int j=0;j<col;j++){
//                if(i==j){
//                    sum+=a[i][j];
//                }
//                else if(i+j==a.length-1){  //in place of a.length we can take the row no also
//                    sum+=a[i][j];
//                }
//            }
//        }

        //Optimized one = O(n)
        for(int i=0;i<row;i++){
            //pd
            sum+=a[i][i];

            //sd
            if(i!=row-1-i) {
                sum += a[i][row - i - 1];
            }
        }
        return sum;
    }

     //Search in sorted matrix //Staircase search //0(n+m)
    public static boolean staircasesearch(int a[][],int row,int col,int key){
          //int r=0,c=a[0].length-1;
        int r=0,c=col-1;
          while(r<row && c>=0){
              if(a[r][c]==key){
                  System.out.println("found key at ("+r+","+c+")");
                  return true;
              }
              else if(key<a[r][c]){
                  c--;
              }
              else{
                  r++;
              }
          }
        System.out.println("key not found!");
        return false;
    }


    //-----------------ASSIGNMENT-------------------

    public static int countnum(int a[][],int row,int col){
        int c=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(a[i][j]==7){
                    c++;
                }
            }
        }
        return c;
    }

    public static int findsum(int a[][],int row,int col){
        int sum=0;

        for(int j=0;j<col;j++){
                sum+=a[1][j];
            }

        return sum;
    }

    //Transpose of matrix
    public static void transpose(int a[][],int row,int col){
        int transpose[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=a[i][j];
            }
        }
        System.out.println("The transposed matrix is:");
        display(transpose);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row:");
        int row=sc.nextInt();
        System.out.print("Enter the coloumn:");
        int col=sc.nextInt();
        int matrix[][]= new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter the value matrix["+i+"]["+j+"]:");
                matrix[i][j]=sc.nextInt();
            }
        }

        display(matrix);
        transpose(matrix,row,col);



//        System.out.println("Enter the ele you want to search:");
//        int key=sc.nextInt();
//        search(matrix,row,col,key);
         //findmaxmin(matrix,row,col);
        //printSpiral(matrix,row,col);
        //System.out.println(diagonalsum(matrix,row,col));
        //staircasesearch(matrix,row,col,key);
        //System.out.println("The no of 7 is:"+countnum(matrix,row,col));
        //System.out.println("The sum of 2nd row is:"+findsum(matrix,row,col));

    }
}
