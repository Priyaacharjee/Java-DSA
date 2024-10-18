import java.util.*;

public class StackB {

    //--------------------------------Stack Using LL------------------------
    //asked in amazon,oyo etc
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    static class Stack{
//        static Node head=null;
//
//        public static boolean isEmpty(){
//            return head==null;
//        }
//
//        //push
//        public static void push(int data){
//            Node newnode=new Node(data);
//            if(isEmpty()){
//                head=newnode;
//                return;
//            }
//
//            newnode.next=head;
//            head=newnode;
//        }
//
//        //pop
//        public static int pop(){
//            if(isEmpty()){
//                return -1;
//            }
//            int top=head.data;
//            head=head.next;
//            return top;
//        }
//
//        //peek
//        public static int peek(){
//            if(isEmpty()){
//                return -1;
//            }
//            return head.data;
//        }
//    }
    //------------------------------Stack using LL---------------------------------

    //------------------------Stack using Arraylist--------------------------------
//    static ArrayList<Integer> list=new ArrayList<>();
//    public static boolean isEmpty(){
//        return list.size()==0;
//    }
//
//    //push
//    public static void push(int data){
//        list.add(data);
//    }
//
//    //pop
//    public static int pop(){
//        if(isEmpty()){
//            System.out.println("Stack is empty.");
//        }
//        int top=list.get(list.size()-1);
//        list.remove(list.size()-1);
//        return top;
//    }
//
//    //peek
//    public static int peek(){
//        if(isEmpty()){
//            System.out.println("Stack is empty.");
//        }
//        return list.get(list.size()-1);
//    }

    //-----------------------------Stack using arraylist--------------------------------------


    //--------------------------problems-----------------------------------
    public static void pushatBottom(Stack<Integer> s,int data){
         if(s.isEmpty()){
             s.push(data);
             return;
         }
         int top=s.pop();
         pushatBottom(s,data);
         s.push(top);
    }

    public static String reverseString(String str){
      Stack<Character> s=new Stack<>();
      int idx=0;
      while(idx<str.length()){
          s.push(str.charAt(idx));
          idx++;
      }

      StringBuilder result=new StringBuilder();
      while(!s.isEmpty()){
          char curr=s.pop();
          result.append(curr);
      }
      return result.toString();
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void revStack(Stack<Integer> s){
         if(s.isEmpty()){
             return;
         }
         int top=s.pop();
         revStack(s);
         pushatBottom(s,top);
    }

    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i=1;i<stocks.length;i++){
            int currPrice=stocks[i];
            while(!s.isEmpty() && currPrice>stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }



    public static void main(String[] args) {
        // Stack s=new Stack();
//       Stack<Integer> s =new Stack<>();
//          s.push(1);
//          s.push(2);
//          s.push(3);

//          while(!s.isEmpty()){
//              System.out.println(s.peek());
//              s.pop();
//          }

       // pushatBottom(s,4);

//        while(!s.isEmpty()){
//              System.out.println(s.pop());
//              //s.pop();
//          }

//        String str="abc";
//        String res=reverseString(str);
//        System.out.println(res);

       // printStack(s);
//        revStack(s);
//        printStack(s);

//        int stocks[]={100,80,60,70,60,85,100};
//        int span[]=new int[stocks.length];
//        stockSpan(stocks,span);
//
//        for(int i=0;i<span.length;i++){
//            System.out.println(span[i]+" ");
//        }

        int a[]={8,4,6,3,9};
        Stack<Integer> s =new Stack<>();

        int nextGreater[]=new int[a.length];

        for(int i=a.length-1;i>=0;i--){    //1.for next greater right just reverse the loop means i=0...
            //1 while
            while(!s.isEmpty() && a[s.peek()]<=a[i]){  //2.for next smallest element >=
                s.pop();
            }
            //2 if-else
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=a[s.peek()];
            }
            //push in s
            s.push(i);
        }

        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }

    //next greater Right (what we did here)
    //next greater Left (just no 1 condition will be applied)
    //next smaller Right(just no 2 condition will be applied)
    //next smaller left (both no 1 and no 2 condition will be applied)
}
