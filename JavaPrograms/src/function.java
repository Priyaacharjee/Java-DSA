import java.util.*;

public class function {
    public static int multiply(int a,int b)
    {
        int prod=a*b;
        return prod;
    }

   // table
    public static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
    }

    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f= f*i;
        }
        return f;
    }

    public static int bino(int n,int r){
        int n_fact=fact(n);
        int r_fact=fact(r);
        int nmr_fact=fact(n-r);
        int bin=n_fact/(r_fact*nmr_fact);

        return bin;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,int b,int c){
        return a+b+c;
    }

    public static void checkprime(int n){
        int flag =1;
      for(int i=2;i<=n-1;i++){
          if(n%i==0){
              flag=0;
          }
      }
      if(flag==1)
          System.out.println(n+ " is prime");
      else {
          System.out.println(n+ " is not prime");
      }
    }


    //optimized Prime
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void Primerange(int a,int n){
        for(int i=a;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

//    public static void main (String arg[]){
//        Scanner sc= new Scanner(System.in);
////        System.out.print("Enter a:");
//        System.out.print("Enter lower num:");
//        int a=sc.nextInt();
//        System.out.print("Enter the upper num:");
//        int b=sc.nextInt();
//
////        System.out.println("The bin coeff is:"+sol);
//        Primerange(a,b);
//    }


    //Binary to Dec & dec to Bin
    public static void bintodec(int n){
        int pow=0,a=n;
        int decnum=0;

        while(n>0){
           int ld=n%10;
           decnum = decnum + (ld* (int)Math.pow(2,pow));
           pow++;
           n=n/10;
        }
        System.out.println("decimal of "+a+" is:"+decnum);
    }

    public static void dectobin(int n){
          int pow=0;
          int bin=0;
          int a=n;

          while(n>0){
              int rem=n%2;
              bin=bin + (rem * (int)Math.pow(10,pow));
              pow++;
              n=n/2;
          }
        System.out.println("binary of " +a+ " is :"+bin);
    }
//
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the no:");
//        int a=sc.nextInt();
//        bintodec(a);
//        dectobin(a);
//    }

    //avg
    public static int calAvg(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }

    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }

    //Palindrome
    public static void CheckPalindrome(int n){
        int a,rev=0;
        a=n;
        while (n != 0) {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if (rev==a){
            System.out.println(a+" is a palindrome number.");
        }
        else{
            System.out.println(a+" is not a palindrome number.");
        }
    }

//


    public static void hollow_rectangle(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || i== row || j==1 || j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row:");
        int r=sc.nextInt();
        System.out.println("Enter the row:");
        int c=sc.nextInt();

        hollow_rectangle(r,c);
        //table(5);

    }

}
