import java.util.*;

public class String_assignment {

//    public static String countlowercase(String str){
//        int c=0;
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                c++;
//            }
//        }
//        return String.valueOf(c);
//    }

    //Anagram or not

    public static void checkAnagram(String str,String str1){
        String s1,s2;
        s1=str.toLowerCase();
        s2=str1.toLowerCase();
        if(s1.length()==s2.length()){
            char[] s1chararr=s1.toCharArray();
            char[] s2chararr=s2.toCharArray();
            Arrays.sort(s1chararr);
            Arrays.sort(s2chararr);

            boolean res=Arrays.equals(s1chararr,s2chararr);
            if(res){
                System.out.println(s1+ " and "+s2+" are anagrams of each other.");
            }else{
                System.out.println(s1+ " and "+s2+" are not anagrams of each other.");
            }

        }
        else {
            System.out.println(s1+ " and "+s2+" are not equal so they can't be anagram.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string:");
        String str=sc.nextLine();
        System.out.println("Enter the 2nd string:");
        String str1=sc.nextLine();

        //System.out.println(countlowercase(str));
        //System.out.println(count);
        checkAnagram(str,str1);
    }
}
