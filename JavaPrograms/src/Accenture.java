import java.util.*;
public class Accenture {

    public static void findSecondlargestsum(int a[],int n){
        //adding elements to even and odd
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                even.add(a[i]);
            }else{
                odd.add(a[i]);
            }
        }

        //sort the arrays
        Collections.sort(even);
        Collections.sort(odd);

        System.out.print("Sorted even array:");
        System.out.println(even);
        System.out.print("Sorted odd array:");
        System.out.println(odd);

        //find 2nd largest element in array
        int evensec=even.get(even.size()-2);
        int oddsec=odd.get(odd.size()-2);
        System.out.print("even sec:"+evensec);
        System.out.print("\nodd sec:"+oddsec);

        //sum
        System.out.println("\nThe sum of the 2nd largest elements of both the arrays is: "+(evensec+oddsec));
    }

//    public static int CheckPassword(char str[],int n){
//        int num=0,cap=0;
//        if(n<4){
//            return 0;
//        }
//        if(str[0]>=0 && str[0]<=9){
//            return 0;
//        }
//        for(int i=0;i<n;i++){
//            if(str[i]>=0 && str[i]<=9)
//                num++;
//            if(str[i]>='A' && str[i]<='Z')
//                cap++;
//            if(str[i]==' ' || str[i]=='/'){
//                return 0;
//            }
//        }
//        if(cap>0 && num>0){
//            return 1;
//        }else{
//            return 0;
//        }
//    }

    public static int CheckPassword(String str,int n){
        int num=0,cap=0;
        if(n<4){
            return 0;
        }
        if(str.charAt(0)>='0' && str.charAt(0)<='9'){
            return 0;
        }
        for(int i=0;i<n;i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                num++;
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                cap++;
            if(str.charAt(i)==' ' || str.charAt(i)=='/'){
                return 0;
            }
        }
        if(cap>0 && num>0){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size:");
//        int n=sc.nextInt();
//        int a[]=new int[n];
//        for(int i=0;i<n;i++){
//            System.out.print("Enter the element at "+i+"th index:");
//            a[i]=sc.nextInt();
//        }

       // findSecondlargestsum(a,n);
//        char str[]={'P','r','i','@',5,6};
//        char str1[]={5,'p','y',' ','o'};
        String str="aA1_67";
        String str1="a987 aBc012";
        System.out.println(CheckPassword(str1,str1.length()));
    }
}
