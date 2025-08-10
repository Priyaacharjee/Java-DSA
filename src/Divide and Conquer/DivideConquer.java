public class DivideConquer {

    public static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

//    public static void mergesort(int a[],int lb,int ub){
//        if(lb<ub){
//            int mid=(lb+ub)/2;
//            mergesort(a,lb,mid);
//            mergesort(a,mid+1,ub);
//            merge(a,lb,mid,ub);
//        }
//    }
//
//    public static void merge(int a[],int lb,int mid,int ub) {
//        //int temp[]=new int[ub-lb+1];
//        int temp[] = new int[20];
//        int i = lb;
//        int j = mid + 1;
//        int k = lb;
//
//        while (i <= mid && j <= ub) {
//            if (a[i] <= a[j]) {
//                temp[k++] = a[i++];
//            } else {
//                temp[k++] = a[j++];
//            }
//        }
//        while (i > mid && j <= ub) {
//            temp[k++] = a[j++];
//        }
//        while (j > ub && i <= mid) {
//            temp[k++] = a[i++];
//        }
//
//        for (k = lb; k <= ub; k++) {
//            a[k] = temp[k];
//        }
//    }

    public static void mergesort(int a[],int lb,int ub){
//        if(lb>=ub){
//           return;
//        }
        if(lb<ub) {
            int mid = lb + (ub - lb) / 2;   //(lb+ub)/2
            mergesort(a, lb, mid);
            mergesort(a, mid + 1, ub);
            merge(a, lb, mid, ub);
        }
    }

        public static void merge(int a[],int lb,int mid,int ub){
            int temp[]=new int[ub-lb+1];
            int i=lb;
            int j=mid+1;
            int k=0;

            while(i<=mid && j<=ub){
                if(a[i]<a[j]){
                    temp[k++]=a[i++];
                }else{
                    temp[k++]=a[j++];
                }
            }
            while(j<=ub){
                temp[k++]=a[j++];
            }
            while(i<=mid){
                temp[k++]=a[i++];
            }

            for(k=0,i=lb;k<temp.length;k++,i++){
                a[i]=temp[k];
            }
        }


        public static void quicksort(int a[],int lb,int ub){
         if(lb>=ub){
             return;
         }
        int loc=partition(a,lb,ub);
        quicksort(a,lb,loc-1);
        quicksort(a,loc+1,ub);
        }
        public static int partition(int a[],int lb,int ub){
           int pivot=a[ub];
           int i=lb-1;

           for(int j=lb;j<ub;j++){
               if(a[j]<=pivot){
                   i++;

                   //swap
                   int temp=a[j];
                   a[j]=a[i];
                   a[i]=temp;
               }
           }
           i++;
           int temp=pivot;
           a[ub]=a[i];
           a[i]=temp;
           return i;
        }

        //Rotated Sorted array
    public static int RotatedSearch(int a[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }

        //kaam
        int mid=si+(ei-si)/2;

        //case found
        if(a[mid]==tar){
            return mid;
        }

        //Line 1
        if(a[si]<=a[mid]){
            if(a[si]<=tar && tar<=a[mid]){
                return RotatedSearch(a,tar,si,mid);
            }else{
                return RotatedSearch(a,tar,mid+1,ei);
            }
        }

        //Line 2
        else{
            if(a[mid]<=tar && tar<=a[ei]){
                return RotatedSearch(a,tar,mid+1,ei);
            }else{
                return RotatedSearch(a,tar,si,mid-1);
            }

        }
    }

    public static void main(String[] args) {
        int a[]={6,3,9,5,0,2,8};
        //mergesort(a,0,a.length-1);
        //quicksort(a,0,a.length-1);
        int target=5;
        int index=RotatedSearch(a,target,0,a.length-1);
        //display(a);
        System.out.println(index);
    }
}
