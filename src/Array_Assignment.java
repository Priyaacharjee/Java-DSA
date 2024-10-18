import java.util.*;
public class Array_Assignment {
//  public static boolean duplicateele(int a[],int n){
//      for(int i=0;i<n;i++){
//          for(int j=i+1;j<n;j++){
//              if(a[i]==a[j]){
//                  return true;
//              }
//
//          }
//      }
//      return false;
//  }

//    public static boolean duplicateele(int a[],int n){
//        HashSet<Integer> set= new HashSet<>();
//        for(int i=0;i<n;i++){
//            if(set.contains(a[i])){
//                return true;
//            }else{
//                set.add(a[i]);
//            }
//        }
//        return false;
//    }

    public static int Maxprofit(int prices[],int n){
        int bp=prices[0];
        int maxprofit=0;
        for(int i=0;i<n;i++){
            if(bp<prices[i]){
               int profit=prices[i]-bp;
               maxprofit=Math.max(profit,maxprofit);
            }else{
                bp=prices[i];
            }
        }
        return maxprofit;
    }

    

    public static void main(String args[]){
        int n;
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the number of elements in array:");
        n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("Enter the element a["+i+"]:");
            a[i]=sc.nextInt();
        }
        System.out.print("The array elements are:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        //System.out.println(duplicateele(a,n));
        System.out.print("The max profit day:");
        System.out.print(Maxprofit(a,n));
    }
}


