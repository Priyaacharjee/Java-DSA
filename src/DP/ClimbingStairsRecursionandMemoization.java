import java.util.Arrays;

public class ClimbingStairsRecursionandMemoization {
    //Recursion //O(2^n)
    public static int countWays(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return countWays(n-1)+countWays(n-2);
    }
    //Memoization //O(n) //optimized and good one
    public static int countWays(int n,int ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){ //already calculated
            return ways[n];
        }
        ways[n]= countWays(n-1,ways)+countWays(n-2,ways);
        return ways[n];
    }
    public static void main(String[] args) {
        int n=5; //n=3 -> 3 & n=4 -> 5 => 8
        int ways[]=new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(countWays(n,ways));
    }
}
