
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


    public static int findMinHouse(int r,int unit,int a[]){
    int totfood=r*unit;
    int sum=0;
    int house=0;
    if(a.length==0){
        return -1;
    }
    for(int i=0;i<a.length;i++){
        sum+=a[i];
        house++;
        if(sum>=totfood){
            return house;
        }
    }
    return -1;
}

public static int PasswordCheck(String str,int n,int min){
    int num=0,cap=0;
    if(n<min){
        return 0;
    }
    if(str.charAt(0)>='0' && str.charAt(0)<='9'){
        return 0;
    }
    for(int i=1;i<n;i++){
        if(str.charAt(i)>='0' && str.charAt(i)<='9'){
            num++;
        }
        if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
            cap++;
        }
        if(str.charAt(i)==' ' || str.charAt(i)=='+'){
            return 0;
        }
    }
    if(num>0 && cap>0){
        return 1;
    }
    else{
        return 0;
    }

}

public static int countDistinctElements(int[] arr, int n) {
    Set<Integer> distinctSet = new HashSet<>();

    for (int i = 0; i < n; i++) {
        distinctSet.add(arr[i]);
    }

    return distinctSet.size();
}

public static boolean checkpalindrome(String str){
    for(int i=0;i<str.length()/2;i++){
        int n=str.length();
        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
    }
    return true;
}

public static String OddEven(int a[],int n){
    if(a.length==0){
        return null;
    }
    String ans=" ";
    for(int i=0;i<n;i++){
        if(a[i]%2==0){
            ans+="Even";
        }
        else{
            ans+="Odd";
        }
    }
    return ans;
}

public static int fact(int n){
    if(n==0||n==1){
        return 1;
    }
    else{
        return n* fact(n-1);
    }
}

public static int helper(String s){
    if(s.length()==0) return 0;

    HashSet<Character> vowel=new HashSet<>();
    vowel.add('A');
    vowel.add('E');
    vowel.add('I');
    vowel.add('O');
    vowel.add('U');
    vowel.add('a');
    vowel.add('e');
    vowel.add('i');
    vowel.add('o');
    vowel.add('u');

    int count=0;

    for(int i=0;i<s.length();i++){
        if(!vowel.contains(s.charAt(i)))
            count++;
    }
    if(count==0)
        return 0;

    return fact(count);

}

public static void reverseArr(int a[]){
    int n=a.length;
    for(int i=0;i<n/2;i++){
        int temp=a[i];
        a[i]=a[n-i-1];
        a[n-i-1]=temp;
    }
}
public static int SumOfEvenIndex(int a[],int n){
    reverseArr(a);
    int sum=0;
    for(int i=0;i<n;i++){
        if(i%2==0) {
            sum += a[i];
        }
    }
    return sum;
}

public static boolean prime(int n){
    if(n<=1){
        return false;
    }
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

public static int PrimeSum(int a[]){
    int n= a.length;
    int sum=0;
    for(int i=0;i<n;i++){
        if(prime(i)){
            sum+=a[i];
        }
    }
    return sum;
}

public static int Canopyarea(int r){
    double area=3.14*r*r;
    return (int)Math.floor(area);
}

public static int subSum(int a[]){
    int ms=Integer.MIN_VALUE;
    int cs=0;
    for(int i=0;i<a.length;i++){
        cs=cs+a[i];
        ms=Math.max(cs,ms);
        if(cs<0){
            cs=0;
        }
    }
    return ms;
}

public static int SongsColl(String str,int k){
    int maxCount=0,currentcount=0;
    for(int i=0;i<k;i++){
        if(str.charAt(i)=='a'){
            currentcount++;
        }
    }
    maxCount=currentcount;

    for(int i=k;i<str.length();i++){
        if(str.charAt(i-k)=='a'){
            currentcount--;
        }

        if(str.charAt(i)=='a'){
            currentcount++;
        }
        maxCount=Math.max(maxCount,currentcount);
    }
    return maxCount;
}

public static int countHouse(int a[],int r,int unit){
    int totfood=r*unit;
    int sum=0,house=0;
    if(a.length==0){
        return -1;
    }
    for(int i=0;i<a.length;i++) {
        sum += a[i];
        house++;
        if(sum>=totfood){
            return house;
        }
    }
    return 0;
}

//    public static int pivotIndex(){
//
//    }

public static int vehicle(int v,int w){
    if(w<=2 || v>w){
        System.out.println("INVALID INPUT");
    }
    int four=0;
    for(int two=0;two<=v;two++) {
        four = v - two;
        if ((two * 2) + (four * 4) == w) {
            System.out.println("Two Wheeler:" + two);
            System.out.println("Four wheeler:" + four);

        }
    }
    return 0;
}

public static int Findseclarg(int a[]){
    int n=a.length;
    int odd[]=new int[n];
    int even[]=new int[n];

    for(int i=0;i<n;i++){
        if(a[i]%2==0){
            even[i]=a[i];
        }
        else{
            odd[i]=a[i];
        }
    }

    Arrays.sort(odd);
    Arrays.sort(even);

    int oddsec=odd[n-2];
    int evensec=even[n-2];

    int sum=oddsec+evensec;
    return sum;
}

public static String alphabet(String str){
    int count=0;
    String ans=" ";
    int n=str.length();
    for(int i=0;i<n;i++){
        if(str.charAt(i)=='1'){
            count++;
        }
        if(count>0 && (str.charAt(i)=='0' || i==(str.length()-1))){
            ans+=(char)('A'+count-1);
            count=0;
        }

    }
    return ans;

}

public static String googlyPrime(int num){
    int sum=0;
    if(num==0){
        return null;
    }
    while(num>0){
        int rem=num%10;
        sum+=rem;
        num=num/10;
    }
    if(prime(sum)){
        return "Yes";
    }
    return "No";
}

public static int favLetter(String str,int len,char c){
    int count=0;
    if(str.length()<len){
        return 0;
    }
    for(int i=0;i<len;i++){
        if(str.charAt(i)==c){
            count++;
        }
    }
    return count;
}

public static int finddistinctCount(int a[],int len){
    int count=0;

    for(int i=0;i<len;i++){
        int flag=0;
        for(int j=i+1;j<len;j++){
            if(a[i]==a[j]){
                flag=1;
                break;
            }
        }
        if(flag==0){
            count++;
        }
    }
    return count;
}

public static int reverse(int num){
    int rev=0;
    while(num>0){
        int rem=num%10;
        rev=rev*10+rem;
        num=num/10;
    }
    return rev;
}

public static int largest(int a[]){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
        max= Math.max(max,a[i]);
    }
    return max;
}

public static int Subsum(int a[]){
    int ms=Integer.MIN_VALUE;
    int cs=0;
    for(int i=0;i<a.length;i++){
        cs+=a[i];
        ms=Math.max(cs,ms);
        if(cs<0){
            cs=0;
        }
    }
    return ms;
}

public static int findTarget(int a[],int target){
    int s=0;int e=a.length-1;
    while(s<e){
        int mid=(s+e)/2;
        if(a[mid]==target){
            return mid;
        }else if(a[mid]>target){
            e=mid-1;
        }else{
            s=mid+1;
        }
    }
    return -1;
}

public static boolean isAnagram(String s,String t){
    String s1,s2;
    s1=s.toLowerCase();
    s2=t.toLowerCase();

    if(s1.length()!=s2.length()){
        return false;
    }
    char [] sarr=s1.toCharArray();
    char [] tarr=s2.toCharArray();

    Arrays.sort(sarr);
    Arrays.sort(tarr);

    return Arrays.equals(sarr,tarr);
}

public static int findMissingnum(int a[]){
    int n=a.length;
    int sum1=0;int sum2=0;
    sum1=(n*(n+1))/2;
    for(int i=0;i<n;i++){
        sum2+=a[i];
    }
    return sum1-sum2;
}

public static String replacesb(String str){
    StringBuilder sb =new StringBuilder(str);
    for(int i=0;i<str.length();i++){
        if(sb.charAt(i)=='a'){
            sb.setCharAt(i,'b');
        }else if(sb.charAt(i)=='b'){
            sb.setCharAt(i,'a');
        }
    }
    return sb.toString();
}

//approach 2
public static String replace2(String str){
    char a[]=str.toCharArray();
    for(int i=0;i<a.length;i++){
        if(a[i]=='a')
            a[i]='b';
        else if(a[i]=='b')
            a[i]='a';
    }
    return new String(a);
}

public static String reversestr(String str){
    String a[]=str.split(" ");
    String ans=" ";
    for(int i=a.length-1;i>=0;i--){
        //System.out.println(a[i]+ " ");;
        ans+=a[i]+" ";
    }
    return ans;
}

public static int countele(int a[],int key){
    int c=0;
    for(int i=0;i<a.length;i++){
        if(a[i]==key)
            c++;
    }
    return c;
}

public static int sumOfRoots(int m,int n){
    int sum1=0;int sum2=0;
    for(int i=m;i<n;i++){
        double sqrt=Math.sqrt(i);
        if(i%2==0){
            sum1+=sqrt;  //sum1+=(int)Math.sqrt(i)
        }else{
            sum2+=sqrt;
        }
    }
    return sum1-sum2;
}

public static boolean searchin2D(int a[][],int key){
    int row=a.length,col=a[0].length;
    int r=0,c=col-1;
    while(r<row && c>=0){
        if(a[r][c]==key)
            return true;

        if(key<a[r][c]){
            c--;
        }else{
            r++;
        }
    }
    return false;
}

public static boolean arrayStringAreEqual(String[] word1,String[] word2){
    String ans1="";
    String ans2="";
    for(int i=0;i<word1.length;i++){
        ans1+=word1[i];
    }
    for(int i=0;i<word2.length;i++){
        ans2+=word2[i];
    }
    if(ans1.equals(ans2))
        return true;
    return false;

    //-------Approach2- Using StringBuilder------
//        StringBuilder sb1=new StringBuilder();
//        StringBuilder sb2=new StringBuilder();
//        for(int i=0;i<word1.length;i++){
//            sb1.append(word1[i]);
//        }
//        for(int i=0;i<word2.length;i++){
//            sb2.append(word2[i]);
//        }
//        if(sb1.toString().equals(sb2.toString())){
//            return true;
//        }
//        return false;
}

public static int buyandSellStocks(int prices[]){
    int bp=Integer.MAX_VALUE;
    int maxprofit=0;
    for(int i=0;i<prices.length;i++) {
        if(bp<prices[i]){
            int profit=prices[i]-bp;
            maxprofit=Math.max(profit,maxprofit);
        }else{
            bp=prices[i];
        }
    }
    return maxprofit;

    //Approach 2- takes more time than previous one(avoid if possible)
//        int min=Integer.MAX_VALUE;
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<prices.length;i++){
//            min=Math.min(min,prices[i]);
//            max=Math.max(max,prices[i]-min);
//        }
//        return max;
}

public static int fibonacci(int n){
    if(n<=1){
        return n;
    }
    return fibonacci(n-1)+fibonacci(n-2);
//        int a=0,b=1,c=0;
//        if(n==0||n==1){
//            return n;
//        }
//        for(int i=2;i<=n;i++){
//            c=a+b;
//            a=b;
//            b=c;
//        }
//        return c;
}

public static int nthFib(int n){
    if(n<=1){
        return n;
    }
    int a=0,b=1,c=0;
    for(int i=2;i<=n;i++){
        c=a+b;
        a=b;
        b=c;
    }
    return c;
}
public static void occurencesOfNums(int a[]){
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int ele:a){
        map.put(ele,map.getOrDefault(ele,0)+1);
    }
    for(int key:map.keySet()){
        System.out.println("element:"+key+" Frequency: "+map.get(key));
    }
}

public static int[] RearrangeBySign(int a[]) {
    ArrayList<Integer> plist = new ArrayList<>();
    ArrayList<Integer> nlist = new ArrayList<>();

    // Separate positive and negative numbers
    for (int i = 0; i < a.length; i++) {
        if (a[i] < 0) {
            nlist.add(a[i]);
        } else if (a[i] > 0) {
            plist.add(a[i]);
        }
    }

    int[] newarr = new int[a.length];
    int k = 0;
    int c = 0;

    // Merge positive and negative lists into newarr
    while (c < plist.size() && c < nlist.size()) {
        newarr[k] = plist.get(c);
        newarr[k + 1] = nlist.get(c);
        k += 2;
        c++;
    }

    // If plist has remaining elements, add them
    while (c < plist.size()) {
        newarr[k++] = plist.get(c++);
    }

    // If nlist has remaining elements, add them
    while (c < nlist.size()) {
        newarr[k++] = nlist.get(c++);
    }

    return newarr; // Return the rearranged array
}

public static boolean leapyear(int year){
    if(year%400==0 || year%4==0 && year%100!=0){
        return true;
    }
    return false;
}

public static int facto(int n){
//       if(n==0||n==1){
//           return n;
//       }
//       return n*facto(n-1);
    int fact=1;
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    return fact;
}

public static int divisor(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            sum+=i;
        }
    }
    return sum;
}

public static void merge(int a1[],int m,int a2[],int n){
    int i=0,j=0,k=0;
    int arr[]=new int [m+n];
    while(i<m && j<n){
        if(a1[i]<a2[j]){
            arr[k++]=a1[i++];
        }else{
            arr[k++]=a2[j++];
        }
    }
    while(i<m){
        arr[k++]=a1[i++];
    }
    while(j<n){
        arr[k++]=a2[j++];
    }
    for(int c=0;c<arr.length;c++){
        a1[c]=arr[c];
    }
}

public static int RecursionSum(int n){
    if(n==0)
        return n;
    return n+RecursionSum(n-1);
}

public static int reboundHeight(int h,int v,int vn){

    int e=v/vn;
    int en=(int)Math.pow(e,2);
    int height=h*en;
    return height;
}

//---------------------danger ques(23rd aug)---------------------
public static int HiddenCode(String s1,String s2){
    int m = s1.length();
    int n = s2.length();

    // DP table
    int[][] dp = new int[m + 1][n + 1];
    int maxLength = 0;
    int endIndex = -1; // endIndex will point to the last character of the longest common substring

    // Fill DP table
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                dp[i][j] = dp[i - 1][j - 1] + 1;
                if (dp[i][j] > maxLength) {
                    maxLength = dp[i][j];
                    endIndex = i - 1; // update the end index
                }
            } else {
                dp[i][j] = 0; // no common substring at this point
            }
        }
    }

    // No common substring found
    if (maxLength == 0) {
        return 0;
    }

    // Calculate the ASCII sum of the longest common substring
    int asciiSum = 0;
    for (int i = endIndex - maxLength + 1; i <= endIndex; i++) {
        asciiSum += (int) s1.charAt(i);
    }

    return asciiSum;
}

public static int convertBinary(int n){
    int bin=0;
    int pow=0;
    while(n>0) {
        int rem=n%2;
        bin=bin+(rem* (int)Math.pow(10,pow));
        pow++;
        n=n/2;
    }
    return bin;
}

public static String BinaryConvert(int n){
    if(n==0)
        return "0";
    if(n==1)
        return "1";
    String ans="";

    while(n>0){
        if((n&1)==1){
            ans='1'+ ans;
        }else{
            ans='0'+ ans;
        }
        n=n>>1;
    }
    return ans;
}

public static int occurrencesOfSecondLargest(int a[]){
    int c=0;
    int max=Integer.MIN_VALUE;
    int smax=Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
        if(max!=Integer.MIN_VALUE && a[i]>max){
            smax=max;
            max=a[i];
        }else if(max==Integer.MIN_VALUE){
            max=Math.max(max,a[i]);
        }
    }
    if(smax==Integer.MIN_VALUE){
        return 0;
    }
    for(int i=0;i<a.length;i++){
        if(smax==a[i]){
            c++;
        }
    }
    return c;
//        int n=a.length;
//        if(a.length==0)
//            return 0;
//        int smax=0;
//        for(int i=n-2;i>=0;i--){
//            if(a[i]!=a[i+1]){
//                smax=a[i];
//                break;
//            }
//        }
//        int c=0;
//        for(int i=0;i<n;i++){
//            if(a[i]==smax){
//                c++;
//            }
//        }
//        return c;
}

public static String oppositeStr(String s1,char c1,char c2){
    char a[]=s1.toCharArray();
    for(int i=0;i<s1.length();i++){
        if(a[i]==c1){
            a[i]=c2;
        }else if(a[i]==c2){
            a[i]=c1;
        }
    }
    return new String(a);
}

public static int dividend(int a[],int q,int divi,int rem){
    int D=q*divi+rem;
    for(int i=0;i<a.length;i++){
        if(a[i]==D)
            return i;
    }
    return -1;
}

public static int midElement(int a[]){
    int n=0;
    int arr[]= new int[a.length];
    for(int i=0;i<a.length;i++){
        if(a[i]>=0){
            arr[n++]=a[i];
        }
    }
    if(n%2==0){
        return arr[(n-1)/2];
    }
    return arr[n/2];
}

//    public static int fileVersion(String a[],int len){
//        int lver=Integer.MIN_VALUE;
//        for(int i=0;i<a.length;i++){
//            if(a[i].length()>=6 && a[i].substring(0,5).equals("File_")){
//                lver=Math.max(lver,Integer.parseInt(a[i].substring(5,a[i].length())));
//            }
//        }
//        return lver;
//    }

//30th aug + 3rd sept
public static int fileVersion(String a[]){
    int lver=-1;
    for(int i=0;i<a.length;i++) {
        if (isValid(a[i])){
            String ans[]=a[i].split("_");
            lver=Math.max(lver,Integer.parseInt(ans[1]));
        }
    }
    return lver;
}

public static boolean isValid(String str){
    String a[]=str.split("_");
    if(a.length!=2){
        return false;
    }
    if(!a[0].equals("File")){
        return false;
    }
    for(int i=0;i<a[1].length();i++){
        if(!Character.isDigit(a[1].charAt(i))){
            return false;
        }
    }
    return true;
}

public static void floyds(int r){
    for(int i=0;i<=r;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

public static void sumofEvenOdd(int a[]){
    int even=0,odd=0;
    for(int i=0;i<a.length;i++){
        if(a[i]%2==0){
            even+=a[i];
        }else{
            odd+=a[i];
        }
    }
    System.out.println(even);
    System.out.println(odd);
    // return new int[]{even,odd};
}

//    public static int specialFibonacci(int n){
//        if(n==1||n==0) {
//            return n;
//        }else {
//            return (specialFibonacci((n - 1) * (n - 1)) + specialFibonacci((n - 2) * (n - 2))) % 47;
//        }
//    }

public static int specialFibonacci(int n){
    if(n==1||n==0) {
        return n;
    }
    int a=1,b=1;
    for(int i=2;i<=n;i++){
        int c=(a*a+b*b)%47;
        a=b;
        b=c;
    }
    return b;
}

public static int islandSurvive(int n,int e,int d){
    if(n==0){
        return -1;
    }
    if(e==0|| d==0){
        return 0;
    }
    if(d<7){
        return ((d*e)%n==0)?d*e/n:d*e/n+1;
    }
    if(n*6<e*7){
        return -1;
    }
    int ans=0;

    //complete weeks
    int week=d/7;
    ans+=((week*e*7)%n==0)?((week*e*7)/n):((week*e*7)/n)+1;
    int left=ans*n-week*e*7;

    //remaining days
    int days=d%7;
    int req=(days*e-left);
    ans+=(req%n==0)?(req/n):(req/n)+1;
    return ans;
}

//30th aug + 2nd sep
public static int longestWord(String str){
    String longword="";
    String words[]=str.split("\\.");
    for(String word:words){
        if(word.length()>longword.length()){
            longword=word;
        }
    }
    return longword.length();
}

public static int factorial(int n){
    if(n==0||n==1)
        return n;
    return n*factorial(n-1);
}

//30th aug + 2nd sept + 4th sept + 10th sept (VVVI Ques)
public static int PermutationVowels(String str){
    Set<Character> vowels = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
    HashMap<Character,Integer> consonants =new HashMap<>();

    int c=0;
    for(int i=0;i<str.length();i++){
        if(!vowels.contains(str.charAt(i))) {
            c++;
            consonants.put(str.charAt(i),consonants.getOrDefault(str.charAt(i),0)+1);
        }
    }
    if(c==0){
        return 1;
    }
    int result=factorial(c);

    for(int freq:consonants.values()){
        if(freq>1){
            result/=factorial(freq);
        }
    }
    return result;
}

//4th sep
public static int tempDrop(int a[]){
    int c=0,maxcount=0;
    for(int i=1;i<a.length;i++){
        if(a[i]<a[i-1]){
            c++;
        }else{
            maxcount=Math.max(c,maxcount);
            c=0;
        }
    }
    maxcount=Math.max(c,maxcount);
    return maxcount;
}

//5th sept
public static int smallestSecArr(int a[]){
        if (a.length < 2) {
        System.out.println("Array should have at least two elements.");
        return -1;
    }
     int min=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;
     for(int i=0;i<a.length;i++){
         if(a[i]<min){
             min2=min;
             min=a[i];
         }else if(a[i]<min2 && a[i]!=min){
             min2=a[i];
         }
     }
     if(min2==Integer.MAX_VALUE){
         System.out.println("There is no smallest element.");
         return -1;
     }
     return min2;
}

//5th sept
public static int binarysetbits(int n){
      int count=0;
      while(n>0){
         count+=n&1;
         n>>=1;
      }
      return count;
}

//5th sept
public static String maxGoal(String s){
        int A=0,B=0;
        for(int i=4;i<s.length();i+=6){
            if(s.charAt(i)=='A'){
                A++;
            }else{
                B++;
            }
        }
        return (A>B)?"TeamA":"TeamB";
}

//6th sept
    public static int[] targetSum(int a[],int target){
        Arrays.sort(a);
        int start=0,end=a.length-1,prod=0;
        int[] result=new int[2];
        while(start<end){
            int sum=a[start]+a[end];
            if(sum==target){
                if(prod<a[start]*a[end]){
                    prod=a[start]*a[end];
                    result[0]=a[start];
                    result[1]=a[end];
                }
                start++;
                end--;
            }else if(sum<target) {
                start++;
            }
            else {
                end--;
            }
        }
        return result;
    }

    //6th sept
    public static void rotate(int a[],int k){
        k=k%a.length;
        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
    }
    public static void reverse(int a[],int s,int e){
        while(s<e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }

   //9th sept
    public static void indianCoins(){
        Integer coins[]={186,419,83,408};
        Arrays.sort(coins,Comparator.reverseOrder());
        int c=0;
        int amount=6249;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
          if(coins[i]<=amount){
            while(coins[i]<=amount){
                c++;
                ans.add(coins[i]);;
                amount-=coins[i];
            }
          }
        }
        System.out.println("no of coins:"+c);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }

    //9th sept
    public static int solve(int n, List<Integer> candy, int h) {
            int low = 1;
            int high = Collections.max(candy);

            int c = 0;

            while (low <= high) {
                int mid = (low + high) / 2;
                int rh = 0;

                for (int i = 0; i < n; i++) {
                    rh += candy.get(i) / mid + (candy.get(i) % mid != 0 ? 1 : 0);
                }

                if (rh > h) {
                    low = mid + 1;
                } else {
                    c = mid;
                    high = mid - 1; // Search for lesser c value
                }
            }

            return c;
        }

        //10th sept
        public static int findCharOcc(String str,char c){
        int count=0;
         for(int i=0;i<str.length();i++){
             if(str.charAt(i)==c){
                 count++;
             }
         }
         return count;
        }

        //11th sept
        // Method to delete occurrences of vowels surrounded by consonants
        public static String delOccurOfVowel(String str) {
            String ans = "";

            // Append the first character since it will not be deleted
            ans += str.charAt(0);

            // Iterate through the string from the second character to the second-to-last
            for (int i = 1; i <= str.length() - 2; i++) {
                // Check if the current character is a vowel and both its adjacent characters are consonants
                if (isVowel(str.charAt(i)) && isConst(str.charAt(i - 1)) && isConst(str.charAt(i + 1))) {
                    continue; // Skip adding this character to the result
                } else {
                    ans += str.charAt(i); // Append the character to the result
                }
            }

            // Append the last character since it will not be deleted
            ans += str.charAt(str.length() - 1);

            return ans;
        }

        public static boolean isVowel(char c){
        if(c=='A' ||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
          return false;
        }
    public static boolean isConst(char c){
        if(!isVowel(c) && Character.isLetter(c)){
                return true;
            }
        return false;
    }

    public static int findMinimumK(int[][] mat) {
        int n = mat.length; // Size of the NxN matrix

        // Iterate through each index to check for the condition
        for (int k = 0; k < n; ++k) {
            boolean rowCheck = true, colCheck = true;

            // Check the K-th row excluding (k, k)
            for (int j = 0; j < n; ++j) {
                if (j != k && mat[k][j] != 0) {
                    rowCheck = false;
                    break;
                }
            }

            // Check the K-th column excluding (k, k)
            for (int i = 0; i < n; ++i) {
                if (i != k && mat[i][k] != 0) {
                    colCheck = false;
                    break;
                }
            }
            if (rowCheck && colCheck) {
                return k; // Return the first K that satisfies the condition
            }
        }

        return -1; // If no such K exists, return -1
    }

    //12th sept
    public static boolean happyNumber(int n) {
        return happyNumberHelper(n, new HashSet<>()); // Start with an empty set
    }

    // Helper function with a set to track previously seen numbers
    private static boolean happyNumberHelper(int n, Set<Integer> set) {
        if (n == 1) return true; // Base case: Happy number

        // If n is already in the set, a cycle is detected, return false
        if (set.contains(n)) return false;

        // Add n to the set to mark it as visited
        set.add(n);

        int newNum = 0;
        while (n > 0) {
            int digit = n % 10;
            newNum += (digit * digit);
            n /= 10;
        }

        // Recur with the new number and the same set
        return happyNumberHelper(newNum, set);
    }

    //12th sept
    public static int climbStairs(int n){
       int prev1=1;
       int prev2=1;

       for(int i=2;i<=n;i++){
           int curr=prev1+prev2;
           prev1=prev2;
           prev2=curr;
       }
       return prev2;
    }

    //12th sept //Leetcode
    public static int delAndEarn(int[] nums){
        int N = nums.length;
        int mx = 0;
        for (int num : nums) {
            mx = Math.max(mx, num);
        }

        // Create a map to store the total value earned by taking each element
        Map<Integer, Integer> val = new HashMap<>();
        for (int num : nums) {
            val.put(num, val.getOrDefault(num, 0) + num);
        }

        // Initialize pick and notpick for base cases
        int pick = val.getOrDefault(1, 0);
        int notpick = 0;

        // Iterate through elements from 2 to max element
        for (int i = 2; i <= mx; i++) {
            int newPick = notpick + val.getOrDefault(i, 0);
            int newNotpick = Math.max(pick, notpick);

            notpick = newNotpick;
            pick = newPick;
        }

        // Return the maximum value between picking and not picking the last element
        return Math.max(pick, notpick);
    }

    //13th sept
    public static int diceNum(int n,int d){
        int num=0,sum1=0,sum2=0;
        boolean flag=false;
        while(n>0){
            if(!flag){
                sum1+=n%10;
            }else{
                sum2+=n%10;
            }
            n/=10;
            num++;
            flag=!flag;
        }
        int even,odd;
        if(num%2==0){
            even=sum1;
            odd=sum2;
        }else{
            even=sum2;
            odd=sum1;
        }
        if(d%2==0){
            return even;
        }else{
            return odd;
        }
    }

    //13th sept
    public static int colourfulStones(String s,String t){
        int index=0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(i)==t.charAt(i)){
                index++;
            }
            if(index==s.length()){
                break;
            }
        }
        return index+1;
    }

    //13th sept
    public static int avgArray(int arr[]){
        int sum=0,c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%6==0) {
                sum+=arr[i];
                c++;
            }
        }
        int avg=sum/c;

        if(c!=0){
            return avg;
        }
        return 0;
    }

    //13th sept //Find the winner of circular game //LeetCode
    public static int delKthele(int n,int k){
        int winner=1;
        for(int i=2;i<=n;i++){
            winner=(winner+(k-1))%i+1;
        }
        return winner;
    }

    //13th sept
    public static int pairHour(int n,List<Integer>arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            int d=arr.get(i)/60;
            d++;

            int req=(60*d)-arr.get(i);

            // If there's an existing pair, increase the count
            if(map.getOrDefault(req,0)!=0){
                count+=map.get(req);
                map.put(req,0);
            }else{
                // Otherwise, store the current element's count
                map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
            }
        }
        return count;
    }

    //14th sept
    public static boolean reverseSubarray(int arr[],int n){
            int front = 0, back = n - 1;
            // Find the first point where the array is unsorted
            while (front < n - 1 && arr[front] <= arr[front + 1]) {
                front++;
            }
            // If the entire array is sorted
            if (front == n - 1) {
                return true;
            }
            // Find the last point where the array is unsorted
            while (back > 0 && arr[back] >= arr[back - 1]) {
                back--;
            }
            // Check if the subarray from front to back is in decreasing order
            for (int i = front; i < back; i++) {
                if (arr[i] < arr[i + 1]) {
                    return false;
                }
            }
            // Check if reversing the subarray fixes the order
            return (front == 0 || arr[front - 1] <= arr[back]) &&
                    (back == n - 1 || arr[front] <= arr[back + 1]);
    }

    //14th sept
    public static int perfectSquare(int n,int x,int dp[][]){
        if (n == 0) return 0;

        // If x*x is greater than n, we can't pick it
        if (x * x > n) return Integer.MAX_VALUE - 1;

        // Memoization: If result already computed, return it
        if (dp[n][x] != -1) return dp[n][x];

        // Option 1: Pick x, add 1 to the result and subtract x*x from n
        int pick = 1 + perfectSquare(n - (x * x), x, dp);

        // Option 2: Move to the next number x + 1 without picking x
        int notPick = perfectSquare(n, x + 1, dp);

        // Store and return the minimum of the two options
        return dp[n][x] = Math.min(pick, notPick);
    }

    //16th sept
    public static int maxCandies(int a[],int M){
        Arrays.sort(a);  //not needed though
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%5==0){
                c++;
            }else if(a[i]<=M){
                c++;
                M-=a[i];
            }
        }
        return c;
    }



        public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size:");
//        findSecondlargestsum(a,n);
//        char str[]={'P','r','i','@',5,6};
//        char str1[]={5,'p','y',' ','o'};
//        String str="aA1_67";
//        String str1="a987 aBc012";
//        System.out.println(CheckPassword(str1,str1.length()));

//        int a[]={2,8,3,5,7,4,1,2};
//        System.out.println(findMinHouse(7,2,a));

        //long number = 6210001000;
        // int result = countDistinctDigits(number);
        //System.out.println("Result: " + result);

//            String str="c281 pbY012!";
//            int n=str.length();
//            int min=2;
//            if(PasswordCheck(str,n,min)==1){
//                System.out.println("Valid");
//            }else{
//                System.out.println("Invalid");
//            }


//        int[] arr = {1, 2, 3, 2, 1, 4, 5};
//        int n = arr.length;
//        int distinctCount = countDistinctElements(arr, n);
//        System.out.println("Number of distinct elements: " + distinctCount);

//        String str="racecar";
//        System.out.println(checkpalindrome(str));

//        int a[]={1,2,3,4,5,6};
//        //int n=a.length;
//        System.out.println(OddEven(a,6));

//        String str="aCD";
//        System.out.println(helper(str));

//       int a[]={-1,-2,-3,3,4,-7};
//       //System.out.println(SumOfEvenIndex(a,6));
//        System.out.println(PrimeSum(a));

//         int r=5;
//        System.out.println(Canopyarea(r));

//        int a[]={-2,-3,4,-1,-2,1,5,-3};
//        System.out.println(subSum(a));

//        String str="abcaca";
//        System.out.print(SongsColl(str,3));

//        int arr[]={2,8,3,5,7,4,1,2};
//        System.out.println(countHouse(arr,7,2));

        //vehicle(200,540);

//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter size of the array :");
//        int n=sc.nextInt();
//        int a[]=new int[n];
//        for(int i=0;i<n;i++){
//            System.out.print("Enter element at the "+i+" index:");
//            a[i]=sc.nextInt();
//        }
        //System.out.println(Findseclarg(a));

//        String str="10111101111";
//        System.out.println(alphabet(str));

//        int num=123;
//        System.out.println(googlyPrime(num));

//        String str="PriyaandKeya";
//        int len=12;
//        char c='a';
//        System.out.println(favLetter(str,len,c));

//        int a[]={5,7,5,7,3,6,10};
//        int len=a.length;
//        System.out.println(finddistinctCount(a,len));

//        int num=987654;
//        System.out.println(reverse(num));

//        int a[]={1,4,6,7,8,9,12};
//        System.out.println(largest(a));

//        int a[]={-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(Subsum(a));

//          int a[]={2,3,4,10,40};
//        System.out.println(findTarget(a,10));

//        String s="anagram";
//        String t="nagaram";
//        System.out.println(isAnagram(s,t));

//        int a[]={3,0,1};
//        System.out.println(findMissingnum(a));

//        String str="aabbbaba";
//        System.out.println(replacesb(str));

//        String str="Hello World";
//        System.out.println(reversestr(str));

//        int a[]={5,2,4,1,2};
//        System.out.println(countele(a,2));

//        int m=1,n=10;
//        System.out.println(sumOfRoots(m,n));

//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the row:");
//        int row=sc.nextInt();
//        System.out.print("Enter the coloumn:");
//        int col=sc.nextInt();
//        int matrix[][]= new int[row][col];
//
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                System.out.print("Enter the value matrix["+i+"]["+j+"]:");
//                matrix[i][j]=sc.nextInt();
//            }
//        }
//
//        System.out.println(searchin2D(matrix,3));

//        String[]word1={"a","bc"};
//        String[]word2={"ab","c"};
//        System.out.println(arrayStringAreEqual(word1,word2));

//        int a[]={7,1,5,3,6,4};
//        System.out.println(buyandSellStocks(a));

//        int n=2;
//        System.out.println(fibonacci(n));

//        int a[]={1,2,2,3,4,4,4,5};
//        occurencesOfNums(a);

//        int[] a={1,2,-3,-4,5,6,-7,-8};
//        int[] result = RearrangeBySign(a);
//        for (int i : result) {
//            System.out.print(i + " ");
//        }

//        int year=2024;
//        System.out.println(leapyear(year));

        // System.out.println(facto(5));

//        System.out.println(divisor(48));

//        int a1[]={1,2,3,0,0,0};
//        int a2[]={2,5,6};
//        merge(a1,3,a2,3);
////        for(int i:a1){
////            System.out.print(i+" ");
////        }
//        for(int i=0;i<a1.length;i++){
//            System.out.print(a1[i]+" ");
//        }

//        int n=10;
//        System.out.println(RecursionSum(n));

        // System.out.println(reboundHeight(10,20,5));

//        System.out.println(HiddenCode("adventure","future"));

//        System.out.println(fibonacci(9));

//        System.out.println(convertBinary(10));
//        System.out.println(BinaryConvert(10));

//        int a[]={1,2,8,4,4,9,5,7,8};
//        System.out.println(occurrencesOfSecondLargest(a));

//        System.out.println(oppositeStr("apples",'a','p'));

//        int a[]={2,4,6,8};
//        System.out.println(dividend(a,2,4,1));

//        int a[]={1,-2,-3,-4,5};
//        System.out.println(midElement(a));

//        String a[]={"File_1","File_2","File_3x","File_6x","File_9"};
//        System.out.println(fileVersion(a));

        //floyds(4);

//        int n=5;
//        int a[]=new int[5];
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<n;i++){
//            System.out.print("Enter a["+i+"]:");
//            a[i]=sc.nextInt();
//        }
//        sumofEvenOdd(a);

//        System.out.println(specialFibonacci(4));

//        System.out.println(islandSurvive(6,3,5));

//        System.out.println(longestWord("hi.this.is.Priya"));


        //System.out.println(PermutationVowels("abbced"));

//        int a[]={2,3,2,1,0};
//        System.out.println(tempDrop(a));

//    int a[]={111,13,25,9,34,1};
//    System.out.println(smallestSecArr(a));

  //  System.out.println(binarysetbits(15));

   // System.out.println(maxGoal("TeamA TeamB TeamA TeamB TeamB"));

//  int a[]={10,30,30,50,60};
//  int target=60;
//  int[] result=targetSum(a,target);
//
//    System.out.println("pair is:"+result[0]+" and "+result[1]);

//    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    int arr[]=new int[n];
//    for(int i=0;i<n;i++){
//        arr[i]=sc.nextInt();
//    }
//    int k=sc.nextInt();
//    rotate(arr,k);
//    System.out.println("Rotated array is: "+Arrays.toString(arr));

//    indianCoins();

//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            List<Integer> candy = new ArrayList<>(n);
//            for (int i = 0; i < n; i++) {
//                candy.add(sc.nextInt());
//            }
//            int h = sc.nextInt();
//
//            System.out.println(solve(n, candy, h));

//            Scanner sc=new Scanner(System.in);
//            String str=sc.next();
//            char c=sc.next().charAt(0);
//            System.out.println(findCharOcc(str,c));

//            String str="abcedefogu";
//            System.out.println(delOccurOfVowel(str));

//            Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt();
//            int mat[][]=new int[n][n];
//            for(int i=0;i<n;i++){
//                for(int j=0;j<n;j++){
//                    System.out.print("Enter the value of mat["+i+"]["+j+"]:");
//                    mat[i][j]=sc.nextInt();
//                }
//            }
//                System.out.println(findMinimumK(mat));

           // System.out.println(happyNumber(25));

        //    System.out.println(climbStairs(5));

//            int a[]={3,3,5,4,5,4,4};
//            System.out.println(delAndEarn(a));

            //System.out.println(diceNum(12345,3));

        //    System.out.println(colourfulStones("RRRBGBRBBB","BBBR"));

//            int arr[]={12,24,3,5,6,7,8,9,18};
//            System.out.println(avgArray(arr));
//
//            System.out.println(delKthele(5,3));

//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            List<Integer> arr = new ArrayList<>();
//
//            for (int i = 0; i < n; i++) {
//                arr.add(sc.nextInt());
//            }
//            System.out.println(pairHour(n, arr));

//            int[] arr = {1, 2, 5, 4, 3};
//            int n = arr.length;
//
//            if (reverseSubarray(arr, n)) {
//                System.out.println("Yes");
//            } else {
//                System.out.println("No");
//            }

//              int[] arr = {6, 4, 1, 15, 5};
//              System.out.println(maxCandies(arr,5));


    }


}

