public class CountingTrees {
    //Same like Catalans no
    public static int countBSTs(int n){
        int dp[] = new int [n+1];
        dp[0]=1;
        dp[1]=1;

        for (int i = 2; i <n+1 ; i++) {
            //Ci -> BST (i nodes) -> dp[i]
            for (int j = 0; j < i; j++) {
                //ci = cj * ci-j-1
                int left=dp[j];
                int right=dp[i-j-1];
                dp[i]+=left*right;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(countBSTs(n));
    }
}
