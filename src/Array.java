import java.util.*;
public class Array {

    //linear search

//    public static void linearSearch(int marks[],int n,int num){
//        int s=0;
//        for(int i=0;i<n;i++){
//            if(marks[i]==num)
//            {
//                if(s==0)
//                    {
//                        System.out.print(num+" is present at index:");
//                        s=1;
//                    }
//                System.out.print(i+" ");
//            }
//        }
//        if(s==0)
//        {
//            System.out.println("The element is not present in array.");
//        }
//    }

    //largest-smallest in array
//    public static void largest(int marks[],int n){
//        int largest=Integer.MIN_VALUE;
//        int smallest=Integer.MAX_VALUE;
//        for(int i=0;i<n;i++){
//            if(marks[i]> largest){
//                largest=marks[i];
//            }
//            if(marks[i]<smallest){
//                smallest=marks[i];
//            }
//        }
//        System.out.println("\nThe smallest ele is:"+smallest);
//        System.out.print("\nThe largest ele is:"+largest);;
//    }

    //Binary Search
//    public static int BianrySearch(int marks[],int n,int num){
//        int s,e,mid;
//        s=0;e=n-1;
//        while(s<=e) {
//            mid = (s + e) / 2;
//
//            if (marks[mid] == num) {
//                return mid;
//            }
//            if(marks[mid]>num){
//                e=mid-1;
//            }else{
//                s=mid+1;
//            }
//        }
//        return -1;
//    }

    //Reverse array
//    public static void reverse(int marks[],int n){
//        int s=0,e=n-1;
//
//        while(s<e){
//            int temp=marks[e];
//            marks[e]=marks[s];
//            marks[s]=temp;
//            s++;
//            e--;
//        }
//
//    }

    //find pairs
//    public static void printPairs(int marks[],int n){
//        int tp=0;
//        for(int i=0;i<n;i++){
//            int curr=marks[i];
//            for(int j=i+1;j<n;j++){
//                System.out.print("("+curr+","+marks[j]+")");
//                tp++;
//            }
//            System.out.println();
//        }
//        System.out.println("The total pairs:"+tp);
//    }



    //-------------------Advaced Array Problems---------------------//



    //find subarrays

//    public static void findSubarray(int a[],int n){
//        int ts=0;
//        for(int i=0;i<n;i++){
//            int start=i;
//            for(int j=i;j<n;j++){
//                int end=j;
//                for(int k=start;k<=end;k++){
//                    System.out.print(a[k]+" ");
//                }
//                ts++;
//                System.out.println();
//            }
//            System.out.println();
//        }
//        System.out.println("\nTotal subarrays:"+ts);
//    }


    //Max subarray sum (brute force)
//    public static void findSubarraysum(int a[],int n){
//        int sum=0,maxsum=Integer.MIN_VALUE;
//        int ts=0;
//        for(int i=0;i<n;i++){
//            int start=i;
//            for(int j=i;j<n;j++){
//                sum=0;
//                int end=j;
//                for(int k=start;k<=end;k++){
//                    System.out.print(a[k]+" ");
//                    sum=sum+a[k];
//                }
//                if(maxsum<sum){
//                    maxsum=sum;
//                }
//                System.out.print(" {The sum is:"+sum+"}");
//                ts++;
//                System.out.println();
//            }
//            System.out.println();
//        }
//        System.out.println("\nThe maximum subarray sum is:"+maxsum);
//        System.out.println("\nTotal subarrays:"+ts);
//    }



    //optimized max subarray(Prefix sum)

//    public static void Opmaxsub(int a[],int n){
//        int sum=0;
//        int maxsum=Integer.MIN_VALUE;
//        int prefix[]=new int[a.length];
//
//        prefix[0]=a[0];
//        for(int i=1;i<prefix.length;i++){
//           prefix[i]=prefix[i-1]+a[i];
//        }
//      for(int i=0;i<n;i++){
//          int start=i;
//          for(int j=i;j<n;j++){
//              int end=j;
//              sum= start==0 ? prefix[end]:prefix[end]-prefix[start-1];
//
//              if(maxsum<sum){
//                  maxsum=sum;
//              }
//          }
//      }
//        System.out.println("\nmax subarray sum is:"+maxsum);
//
//    }

    //Kadanes approach of max sum subarray(Most optimized)

    public static void kadanmaxsub(int a[],int n) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<n;i++)
        {
            cs=cs+a[i];
            ms=Math.max(cs,ms);
            if(cs<0) {
                cs = 0;
            }
        }
        System.out.println("\nthe max subarray sum is:"+ms);
    }


    //------------------Trapping Rainwater-----------------

//    public static int trappedRainwater(int height[],int n){
//        //int h=height.length;
//        //calulate left max boundary -array
//        int leftmax[]=new int[n];
//        leftmax[0]=height[0];
//        for(int i=1;i<n;i++){
//            leftmax[i]=Math.max(height[i],leftmax[i-1]);
//        }
//        //calculate right max boundary - array
//        int rightmax[]=new int[n];
//        rightmax[n-1]=height[n-1];
//        for(int i=n-2;i>=0;i--){
//            rightmax[i]=Math.max(height[i],rightmax[i+1]);
//        }
//
//        int trappedwater=0;
//        //loop
//        for(int i=0;i<n;i++){
//            //waterlevel = min(leftmax bound, rightmax bound)
//            int waterlevel=Math.min(leftmax[i],rightmax[i]);
//
//            //trapped water = waterlevel-height
//            trappedwater += waterlevel -  height[i];
//        }
//        return trappedwater;
//
//    }

    //Buy and Sell Stocks
    public static int BuyandsellStocks(int prices[],int n){
        int bp=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<n;i++){
            if(bp<prices[i]){ //profit
                int profit= prices[i]-bp; //todays profit
                maxprofit=Math.max(maxprofit,profit);
            }else{
                bp=prices[i];
            }
        }
        return maxprofit;
    }


    public static void main(String args[]){

        int marks[]=new int[10];
       // int numbers[]={1,2,3};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of ele in array:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element marks["+i+"]:");
            marks[i]=sc.nextInt();
        }

        System.out.print("The array elements are:");
        for(int i=0;i<n;i++){
            System.out.print(marks[i]+" ");
        }

//        System.out.print("\nEnter the element to be searched:");
//        int num=sc.nextInt();

        //linearSearch(marks,n,num);
        //largest(marks,n);
//        int index=BianrySearch(marks,n,num);
//        if(index==-1){
//            System.out.println("Item not found");
//        }else{
//            System.out.println(num+" is present at index:"+index);
//        }

//        reverse(marks,n);
//        System.out.println("\nThe reversed array is:");
//        for(int i=0;i<n;i++){
//            System.out.print(marks[i]+" ");
//        }

//        System.out.println("\nthe pairs are:");
//        printPairs(marks,n);
//        System.out.println("\nthe Subarrays are:");
        //findSubarray(marks,n);
//       findSubarraysum(marks,n);
       // Opmaxsub(marks,n);
        kadanmaxsub(marks,n);
//        System.out.print("\nThe sum of the trapped water is:");
//       System.out.print(trappedRainwater(marks,n));

//        System.out.print("\nThe maximum profit is:");
//       System.out.print(BuyandsellStocks(marks,n));

    }

}
