import java.util.*;
public class Stack2 {
    public static boolean isValid(String str){            //O(n)
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')')
                || (s.peek()=='{' && ch=='}')
                || (s.peek()=='[' && ch==']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean duplicateParentheses(String str){
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            //closing
            if(ch==')') {
                int count=0;
                while(s.pop()!='('){
                    count++;
                }
                if(count<1){
                    return true;  //duplicate
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void maxArea(int arr[]){
        int maxArea=0;
        int n=arr.length;
        int nsr[]=new int[n];
        int nsl[]=new int[n];

        //next smaller right --O(n)
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //next smaller left ---O(n)
        s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //current area---O(n)
        for(int i=0;i<n;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(currArea,maxArea);
        }
        System.out.println("Max area in histogram= "+maxArea);
    }


    public static void main(String[] args) {
        //String str = "(({})[])";
        //System.out.println(isValid(str));

//        String str="((a+b))";
//        String str2="(a-b)";
//        System.out.println(duplicateParentheses(str));

        //int arr[]={2,1,5,6,2,3};
        int arr[]={2,4};
        maxArea(arr);
    }
}
