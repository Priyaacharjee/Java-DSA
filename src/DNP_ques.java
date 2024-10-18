import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class DNP_ques {
    public static int Nonrepeateddig(int n){
        int c=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (n > 0) {
            int x=(int)(n%10);
            map.put(x, map.getOrDefault(x, 0) + 1);
            n=n/ 10;
        }
        for (int el : map.values()) {
            if (el == 1) {
                c++;
            }
        }
        return c;
    }


    public static int sumOfUniqueDigits(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        // Populate the map with digit counts
        int originalN = n;  // Preserve the original value of n for further processing
        while (n > 0) {
            int digit = n % 10;
            map.put(digit, map.getOrDefault(digit, 0) + 1);
            n = n / 10;
        }

        // Sum the digits that appear exactly once
      n = originalN;  // Reset n to its original value for another traversal
        while (n > 0) {
            int digit = n % 10;
            if (map.get(digit) == 1) {
                sum += digit;
            }
            n = n / 10;
        }

        return sum;
    }

    public static void Weightofhill(int input1,int input2,int input3) {
        int total_weight = 0;
        int weight = input2;
        for (int i = 0; i < input1; i++) {
            if (i == 0) {
                total_weight = weight;
            } else {
                weight += input3;
                total_weight += (weight * (i + 1));
            }
        }
        System.out.println("\nTotal weight: " + total_weight);
    }

    public static int Nthfib(int n){
        int fib,a=0,b=1,c=0;

         if(n==0|| n==1){
            return 0;
        }
        for(int i=2;i<n;i++){
            c=a+b;
            //System.out.println(c);
            a=b;
            b=c;
        }
        return b;
    }


    public static int generatePIN(int input1, int input2, int input3) {
            // Extracting units, tens, and hundreds digits
            int unit1 = input1 % 10;
            int unit2 = input2 % 10;
            int unit3 = input3 % 10;

            int tens1 = (input1 / 10) % 10;
            int tens2 = (input2 / 10) % 10;
            int tens3 = (input3 / 10) % 10;

            int hundreds1 = (input1 / 100) % 10;
            int hundreds2 = (input2 / 100) % 10;
            int hundreds3 = (input3 / 100) % 10;

            // Determine the least values for units, tens, and hundreds positions
            int unitPosition = Math.min(unit1, Math.min(unit2, unit3));
            int tensPosition = Math.min(tens1, Math.min(tens2, tens3));
            int hundredsPosition = Math.min(hundreds1, Math.min(hundreds2, hundreds3));

            // Determine the maximum value among all digits
            int maxDigit = Math.max(Math.max(unit1, unit2), Math.max(unit3, Math.max(tens1, Math.max(tens2, Math.max(tens3, Math.max(hundreds1, Math.max(hundreds2, hundreds3)))))));

            // Construct the PIN
            int pin = maxDigit * 1000 + hundredsPosition * 100 + tensPosition * 10 + unitPosition;

            return pin;
        }


        public static List<List<Integer>> findConsecutiveSums(int N) {
            List<List<Integer>> result = new ArrayList<>();
            int start = 1;
            int end = 1;
            int sum = 0;

            while (start <= N / 2 + 1) {
                if (sum < N) {
                    sum += end;
                    end++;
                } else if (sum > N) {
                    sum -= start;
                    start++;
                } else {
                    List<Integer> sequence = new ArrayList<>();
                    for (int i = start; i < end; i++) {
                        sequence.add(i);
                    }
                    result.add(sequence);
                    sum -= start;
                    start++;
                }
            }

            return result;
        }

        public static int returnNum(int c,int n){
          int x=n/c;
          if(n%c!=0){
              x++;
          }
          return x;
        }

        public static int subArray3(int a[],int n){
        int c=0;
//         for(int i=0;i<=a.length-3;i++){
//                 for(int j=i;j<i+3;j++){
//                     //System.out.print(a[j] + " ");
//
//                 }
//                 System.out.println();
//                 c++;
//    }
 //            return c;

            for(int i=0;i<a.length-2;i++){
                if(a[i]+a[i+2]==a[i+1]){
                    c++;
                }
            }
            return c;
        }

    public static int togglebit(int n,int i){
        int pow=0;
        int bin=0;
        int a=n;
        int newDec;
        while(n>0){
            int rem=n%2;
            bin=bin+(rem* (int)Math.pow(10,pow));
            n=n/2;
        }
        System.out.println("Entered no is:"+a);
        if(i==0){
            int bitmask=~(1<<i);
            newDec=bin & bitmask;
        }else{
            int bitmask=1<<i;
            newDec=bin|bitmask;
        }
        return (newDec-1);
    }

    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }


    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
       System.out.println("\nEnter the value of n:");
       int n=sc.nextInt();
//
       //System.out.println(Nonrepeateddig(n));
       // System.out.println(sumOfUniqueDigits(n));

//        System.out.print("Intput1: ");
//        int input1=sc.nextInt();
//        System.out.print("Intput2: ");
//        int input2=sc.nextInt();
//        System.out.print("Intput3: ");
//        int input3=sc.nextInt();
//
//        Weightofhill(input1,input2,input3);

        //System.out.println(Nthfib(n));
        //System.out.println(generatePIN(input1,input2,input3));
        //System.out.print(findConsecutiveSums(15));

//        int c=sc.nextInt();
//        int n=sc.nextInt();
//        System.out.println(returnNum(c,n));

//        int a[]={1,2,1,3,5,2,4,2};
//        int n=8;
//
//        System.out.println(subArray3(a,n));

//        System.out.print("Enter number:");
//        int n= sc.nextInt();

//        System.out.print("Enter index:");
//        int idx=sc.nextInt();
//
//        System.out.println("the new no is:"+togglebit(n,idx));

        System.out.println(reverse(n));

    }
}



