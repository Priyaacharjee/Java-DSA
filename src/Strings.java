import java.util.*;
public class Strings {
//    public static void printletters(String str){
//        for(int i=0;i<str.length();i++){
//            System.out.print(str.charAt(i)+" ");
//        }
//        System.out.println();
//    }

    //Palindrome String
//    public static boolean checkpalindrome(String str){
//        for(int i=0;i<str.length()/2;i++){
//            int n=str.length();
//            if(str.charAt(i)!=str.charAt(n-i-1)){
//                 return false;
//            }
//        }
//        return true;
//    }

    //find Shortest path
//    public static float shortpath(String str){
//          int x=0,y=0;
//
//          for(int i=0;i<str.length();i++){   //O(n)
//              char dir=str.charAt(i);
//
//              //south
//              if(dir=='S'){
//                  y--;
//              }
//              //North
//              else if(dir=='N'){
//                  y++;
//              }
//              //West
//              else if(dir=='W'){
//                  x--;
//              }
//              //East
//              else{
//                  x++;
//              }
//          }
//          int X2=x*x;
//          int Y2=y*y;
//          return (float)Math.sqrt(X2+Y2);
//    }

    //finding Substring
//    public static String substring(String str,int si,int ei){
//        String substr="";
//        for(int i=si;i<ei;i++){
//            substr+=str.charAt(i);
//        }
//        return substr;
//    }

    //convert to uppercase
//    public static String toUpperCase(String str){        //O(n)
//        StringBuilder sb=new StringBuilder("");
//
//        char ch=Character.toUpperCase(str.charAt(0));
//        sb.append(ch);
//
//        for(int i=1;i<str.length();i++){
//            if(str.charAt(i)==' ' && i<str.length()-1){
//                sb.append(str.charAt(i));
//                i++;
//                sb.append(Character.toUpperCase(str.charAt(i)));
//            }else{
//                sb.append(str.charAt(i));
//            }
//        }
//        return sb.toString();
//    }

    //String Compression --->Amazon ques
    public static String Compression(String str){
        String newStr="";

        for(int i=0;i<str.length();i++){   //O(n)
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
               newStr+=count.toString();
            }
        }
        return newStr;
    }


    public static void main(String[] args) {
//        char arr[]={'a','b','c','d'};
//        String str="abcd";
//        String str2=new String("xyz");
//
//        //Strings are IMMUTABLE
        Scanner sc=new Scanner(System.in);
//        String path=sc.nextLine();
        String name=sc.nextLine();
        System.out.println(name);

//        String fullname="Priya Acharjee";
//        System.out.println(fullname.length());
//
//        //concatenation
//        String fn="Priya";
//        String ln="Acha";
//        String Fulln=fn+" "+ln;
//        System.out.println(Fulln.charAt(1));
//        printletters(Fulln);

        //System.out.println(checkpalindrome(name));

        //System.out.print("The shortest path is:"+shortpath(path));


        //-------------Check Equality of String------------
//        String s1="Tony";
//        String s2="Tony";
//        String s3=new String("Tony");
//
//        if(s1.equals(s3)){
//            System.out.println("Strings are equal");
//        }else{
//            System.out.println("Strings are not equal.");
//        }

        //System.out.println(substring(name,0,5));

        //without using function
       // System.out.println(name.substring(0,6));

        //Print largest string

//        String fruits[]={"apple","mango","banana"};
//
//        String largest=fruits[0];
//        for(int i=1;i<fruits.length;i++){
//            if(largest.compareTo(fruits[i])<0){
//                largest=fruits[i];
//            }
//        }
//
//        System.out.println(largest);

        //--------------STRINGBUILDER-----------

//        StringBuilder sb=new StringBuilder("");   //O(26)
//        for(char ch='a';ch<='z';ch++){
//            sb.append(ch);
//        }
//        System.out.println(sb);
//        System.out.println(sb.length());


        //System.out.println(toUpperCase(name));
        System.out.println(Compression(name));
    }
}
