public class CoinChange {
    public static int coinChangeTab(int coins[],int sum){
        int n = coins.length;
        int dp[][]=new int[n+1][sum+1];
        
        //initialize - sum is 0
        //i = coins, j= sum
        for (int i = 0; i < n+1; i++) {
            dp[i][0]=1;
        }
        for (int j = 1; j < sum+1; j++) {
            dp[0][j]=0;
        }
        //O(n*sum)
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(coins[i-1]<=j){ //valid
                   dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
                }else{ //invalid
                    dp[i][j]=dp[i-1][j];
                }
            }

        }
        print(dp);
        return dp[n][sum];
    }
    public static void print(int dp[][]){
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int coins[]={2,5,3,6};
        int sum=10; //ans=4
        System.out.println(coinChangeTab(coins,sum)); //ways to give change
    }
}
