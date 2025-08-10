import java.util.*;
public class Recursion {
    public static void printdec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printdec(n-1);
    }

    public static void printinc(int n){
       if(n==1){
           System.out.println(n+" ");
           return;
       }
        printinc(n-1);
        System.out.println(n+" ");
    }

    public static int fact(int n) {       //TC & SC=O(n)
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static int sumofN(int n){
        int sum=0;
        if(n==1){
            return 1;
        }else{
            sum=n+sumofN(n-1);
        }
        return sum;
    }

    //Nth fibonacci number
    public static int fib(int n){              //TC=O(2^n)  SC=O(n)
        if(n==0 ||n==1){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }

    //Check sorted array or not
    public static boolean isShorted(int a[],int i) {         //TC=O(n)
        if(i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return isShorted(a,i+1);
    }

    //first occurance of element    O(n)
    public static int occurance1st(int a[],int key,int i) {              //TC=O(2^n)  SC=O(n)
        if(i==a.length){
            return -1;
        }
        if (a[i]==key) {
            return i;
        }
        return occurance1st(a,key,i+1);

    }

    public static int occurancelast(int a[],int key,int i) {              //TC=O(2^n)  SC=O(n)
        if(i==a.length){
            return -1;
        }
        int found=occurancelast(a,key,i+1);
        if(found ==-1 && a[i]==key){
            return i;
        }
        return found;

    }

    public static int calpower(int x,int n){     //O(n)
        if(n==0){
            return 1;
        }
        return x*calpower(x,n-1);
    }

    public static int calpowerop(int x,int n){     //O(logn)
        if(n==0){
            return 1;
        }
        int halfpower=calpowerop(x,n/2);

        int halfpowerSq =halfpower*halfpower;

        if(n%2!=0){
            halfpowerSq=x*halfpowerSq;
        }
        return halfpowerSq;
    }

    //Tiling Problem
    public static int Tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        return Tiling(n-1)+Tiling(n-2);

//        int Vtile=Tiling(n-1);
//        int Htile=Tiling(n-2);
//        int TotalWays=Vtile+Htile;
//        return TotalWays;
    }

    //Remove Duplicate
    public static void duplicateString(String str,int idx,StringBuilder sb,boolean map[]){
       if(idx==str.length()){
           System.out.println(sb);
           return;
       }
       char currchar=str.charAt(idx);
        if (map[currchar-'a']==true){
             duplicateString(str,idx+1,sb,map);
        }else{
            map[currchar-'a']=true;
            duplicateString(str,idx+1,sb.append(currchar),map);
        }
    }

    //friends pairing
    public static int friendPairing(int n){
        if(n==1||n==2){
            return n;
        }

        return friendPairing(n-1)+(n-1)*friendPairing(n-2);

        //single choice
//        int fnm1=friendPairing(n-1);
//
//        //pair
//        int fnm2=friendPairing(n-2);
//        int pairways=(n-1)*fnm2;
//
//        //total
//        int totways=fnm1+pairways;
//        return totways;
    }

    //Binary Strings
    public static void BinaryString(int n,int lp,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        BinaryString(n-1,0,str+"0");
        if(lp==0){
            BinaryString(n-1,1,str+"1");
        }
    }


    //-----------------------Assignment-----------------------
    //find all occurences
    public static void alloccurences(int a[],int key,int i){
        if(i==a.length){
            return;
        }
        if(a[i]==key){
            System.out.print(i+" ");
        }
        alloccurences(a,key,i+1);
    }

    //convert number to string
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int n){
        if(n==0){
            return ;
        }
        int ld=n%10;
        printDigits(n/10);
        System.out.print(digits[ld]+" ");
    }

    //length of a string
    public static int length(String str){
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1))+1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
       // int n=sc.nextInt();
        //printdec(n);
        //printinc(n);
        //System.out.println(fact(n));
        //System.out.println(sumofN(n));
       // System.out.println(fib(n));
        //int a[]={8,3,6,9,5,10,2,5,3};
//        System.out.println(isShorted(a,0));
        //System.out.println(occurance1st(a,5,0));
        //System.out.println(occurancelast(a,5,0));
        //System.out.println(calpower(2,3));
       // System.out.println(calpowerop(2,5));
       //System.out.println(Tiling(n));

//        String str="appnnacollege";
//        duplicateString(str,0,new StringBuilder(""),new boolean[26]);

        //System.out.println(friendPairing(n));
        //BinaryString(3,0,"");
//        int a[]={3,2,4,5,6,2,7,2,2};
//        int key=2;
//        alloccurences(a,key,0);
//        System.out.println();

        //printDigits(n);
        String str="Priya";
        System.out.println(length(str));
    }
}


