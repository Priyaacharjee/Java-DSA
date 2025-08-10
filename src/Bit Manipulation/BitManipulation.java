import java.util.*;
public class BitManipulation {
    //odd or even (good)
    public static void oddOreven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.print("even number");
        }else{
            System.out.print("odd number.");
        }
    }

    //Get ith bit
    public static int getithbit(int n,int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    //set ith bit
    public static int setithbit(int n,int i){
        int bitMask = 1<<i;
          return n | bitMask;
    }

    //clear ith bit
    public static int clrithbit(int n,int i){
        int bitMask = ~(1<<i);
        return (n&bitMask);

    }

    //Update ith bit
    public static int updateithbit(int n,int i,int newBit){
        if(newBit==0){
            return clrithbit(n,i);
        }else{
            return setithbit(n,i);
        }

//        n=clrithbit(n,i);
//        int bitMask=newBit<<i;
//        return n|bitMask;
    }

    //clear last I bits
    public static int  clrlastbits(int n,int i){
        int BitMask=(~0)<<i;
        return (n&BitMask);
    }

    //clear range of bits
    public static int clrrangebits(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    }

    //Power of 2 or not
    public static boolean isPowerofTwo(int n) {
        return (n & (n-1))==0;
    }

    //count set bits in a number
    public static int countsetbit(int n) {
        int c=0;
        while(n>0){
            if((n&1)!=0){
                c++;
            }
            n=n>>1;
        }
        return c;
    }

    //Fast Exponentiation
    public static int FastExponet(int a,int n) {
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }


    //---------------- Assignment---------------

    //Swaping using Xor operator
    public static void Swap(int a,int b){
        System.out.println("Before swap: a= "+a+" and b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap a= " +a+ "and b= "+b);
    }

    //add 1 to integer
    public static void addinteger(int n){
        System.out.println(n+" + "+1+" is "+-~n);
    }

    //convert to lowercase
    public static void tolowercase(){
        for(char ch='A';ch<='Z';ch++) {
            System.out.print((char) (ch | ' '));
        }
    }

    public static void main(String[] args) {
        //System.out.println((5<<2)); //left shift
        //System.out.println(6>>1); //right shift
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        //int i=sc.nextInt();
        //oddOreven(n);
       // System.out.println(getithbit(n,i));
        //System.out.println(setithbit(n,i));
        //System.out.println(clrithbit(n,i));
        //System.out.println(updateithbit(n,i,1));
        //System.out.println(clrlastbits(n,i));
        //System.out.println(clrrangebits(n,i,4));

//        if(isPowerofTwo(n)){
//            System.out.println(n+" is a power of 2");
//        }else{
//            System.out.println(n+" is not a power of two.");
//        }

        //System.out.println(countsetbit(n));
       // System.out.println(FastExponet(5,3));

        //Swap(15,10);
        //addinteger(n);
        tolowercase();

    }
}
