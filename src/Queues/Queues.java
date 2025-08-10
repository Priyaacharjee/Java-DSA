import java.util.*;

public class Queues {

    //-----------------Que using array----------------------------------
//    static class Queue{
//        static int arr[];
//        static int size;
//        static int rear;
//        static int front;
//
//        Queue(int n){
//            arr=new int[n];
//            size=n;
//            rear=-1;
//            front=-1;
//        }
//
//        public static boolean isEmpty(){
//            return rear ==-1 && front==-1;
//        }
//
//        //circular queue
//        public static boolean isFull(){
//           return (rear+1)%size==front;
//        }
//
//        //add simple queue
////        public static void add(int data){
////            if(rear==size-1){
////                System.out.println("Queue is full");
////                return;
////            }
////
////            rear=rear+1;
////            arr[rear]=data;
////        }
//
//        public static void add(int data){
//            if(isFull()){
//                System.out.println("Queue is full");
//                return;
//            }
//            //add 1st ele
//            if(front == -1){
//                front=0;
//            }
//            rear=(rear+1)%size;
//            arr[rear]=data;
//        }
//
//        //remove simple queue
////        public static int remove(){
////            if(isEmpty()){
////                System.out.println("Empty Queue");
////                return -1;
////            }
////            int front=arr[0];
////            for(int i=0;i<rear;i++){
////                arr[i]=arr[i+1];
////            }
////            rear--;
////            return front;
////        }
//
//        //circular queue
//        public static int remove(){
//            if(isEmpty()){
//                System.out.println("Empty Queue");
//                return -1;
//            }
//            int res=arr[front];
//
//            //last el del
//            if(rear==front){
//                rear=front=-1;
//            }else{
//                front=(front+1)%size;
//            }
//            return res;
//        }
//
//        //peek
//        public static int peek(){
//            if(isEmpty()){
//                System.out.println("Empty Queue");
//                return -1;
//            }
//            //for simple queue
//            //return arr[0];
//
//            //circular queue
//            return arr[front];
//        }
//    }
    //-----------------Que using array----------------------------------

    //-----------------Queue using Linked list----------------------------------

//    static class Node{
//        int data;
//        Node next;
//
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    static class Queue{
//         static Node head=null;
//         static Node tail=null;
//
//         public static boolean isEmpty(){
//             return head == null & tail==null;
//         }
//
//         public static void add(int data){
//             Node newnode=new Node(data);
//             if(head==null){
//                 head=tail=newnode;
//                 return;
//             }
//             tail.next=newnode;
//             tail=newnode;
//         }
//
//        public static int remove(){
//            if(isEmpty()){
//                System.out.println("Empty Queue");
//                return -1;
//            }
//
//            int front=head.data;
//            if(tail==head){
//              tail=head=null;
//            }else{
//                head=head.next;
//            }
//            return front;
//        }
//
//        public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Empty queue.");
//                 return -1;
//             }
//             return head.data;
//        }
//    }

    //-----------------Queue using Linked list----------------------------------




    public static void main(String[] args) {
        //Queue q=new Queue();
       // Queue<Integer> q=new LinkedList<>(); //ll or ArrayDeque
        Queue <Integer> q= new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
//        System.out.println(q.remove());
//        q.add(4);
//        System.out.println(q.remove());
//        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
