import java.util.*;

public class Sorting {
//    public static void Bubble_sort(int a[],int n){
//       for(int i=0;i<n-1;i++){
//           for(int j=0;j<n-i-1;j++){
//               if(a[j]>a[j+1]){
//                   int temp=a[j];
//                   a[j]=a[j+1];
//                   a[j+1]=temp;
//               }
//           }
//       }
//    }

//    public static void Selection_sort(int a[],int n){
//        for(int i=0;i<n-1;i++){
//            int min=i;
//            for(int j=i+1;j<n;j++){
//                if(a[min]>a[j]){
//                    min=j;
//                }
//            }
//            int temp=a[min];
//            a[min]=a[i];
//            a[i]=temp;
//        }
//    }

//    public static void Insertionsort(int a[],int n){
//        for(int i=1;i<n;i++){
//            int curr=a[i];
//            int prev=i-1;
//            while(prev>=0 && a[prev]>curr){
//                a[prev+1]=a[prev];
//                prev--;
//            }
//            a[prev+1]=curr;
//        }
//    }

    public static void CountingSort(int a[],int n){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest=Math.max(largest,a[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void display(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]=new int [20];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num of ele :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the ele a["+i+"] :");
            arr[i]=sc.nextInt();
        }
        display(arr,n);
        //Bubble_sort(arr,n);
       // Selection_sort(arr,n);
        //Insertionsort(arr,n);
       // CountingSort(arr,n); //used for positive numbers only
        //Arrays.sort(arr,0, n);
        //Arrays.sort(arr,Collections.reverseOrder()); //works on Integer keyword only
        System.out.print("\nThe sorted array is:");
        display(arr,n);


    }
}



