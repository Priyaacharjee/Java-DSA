import java.util.*;
public class Arraylist {

    //swap
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    //Container with most water  //Brute force //O(n^2)
    // public static int storeWater(ArrayList<Integer>height){
//        int maxWater=0;
//        for(int i=0;i<height.size();i++){
//            for(int j=i+1;j<height.size();j++){
//                int ht=Math.min(height.get(i),height.get(j));
//                int width=j-i;
//                int currWater=ht*width;
//                maxWater=Math.max(maxWater,currWater);
//            }
//        }
//        return maxWater;
//      }

    //Optimized with 2 pointer   //O(n)
//    public static int storeWater(ArrayList<Integer>height){
//        int maxWater=0;
//        int lp=0,rp=height.size()-1;
//
//        //calculate water area
//        while(lp<rp){
//             int ht=Math.min(height.get(lp),height.get(rp));
//             int width=rp-lp;
//             int currWater=ht*width;
//             maxWater=Math.max(maxWater,currWater);
//
//             //update ptr
//             if(height.get(lp)<height.get(rp)){
//                 lp++;
//             }else{
//                 rp--;
//             }
//
//        }
//        return maxWater;
//    }


    //Pair sum //brute force
//    public static boolean pairSum(ArrayList<Integer>list,int target){
//        for(int i=0;i<list.size();i++){
//            for(int j=i+1;j<list.size();j++){
//                if(list.get(i)+list.get(j)==target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

//    public static boolean pairSum(ArrayList<Integer>list,int target){
//        int lp=0,rp=list.size()-1;
//        while(lp<rp){
//            if(list.get(lp)+list.get(rp) == target){
//                return true;
//            }
//            if((list.get(lp)+list.get(rp))<target){
//                lp++;
//            }else{
//                rp--;
//            }
//        }
//        return false;
//    }

    //Sorted and Rotated Pair Sum   //O(n)
    public static boolean rotatedPairsum(ArrayList<Integer>list,int target){
        int bp=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;

        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }



    public static void main(String[] args) {
       // ArrayList<Integer> list=new ArrayList<>();
       // ArrayList<String>list2=new ArrayList<>();
        //ArrayList<Boolean>list3=new ArrayList<>();

        //add    //O(1)
//        list.add(3);
//        list.add(1);
//        list.add(5);
//        list.add(4);
//        list.add(2);
//
//        Collections.sort(list);  //ascending
//        Collections.sort(list,Collections.reverseOrder());  //descendind order  //comparator -fnx logic


//        list.add(1,9);   //O(n)
//
       //System.out.println(list);
//
//        //get
 //       int ele=list.get(2);  //O(1)
 //      System.out.println(ele);
//
//        //remove
//        list.remove(2);  //O(n)
//        System.out.println(list);
//
//        //set element
//        list.set(2,5);      //O(n)
//        System.out.println(list);
//
//        //contains
//        System.out.println(list.contains(5));
//        System.out.println(list.contains(10));
//
//        //size
//        System.out.println(list.size());
//
//        //print the arraylist
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }

        //reversed  ---O(n)
//        for(int i=list.size()-1;i>=0;i--){
//            System.out.print(list.get(i)+" ");
//        }

        //System.out.println(list.reversed());

        //Find max  //O(n)
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<list.size();i++){
//            max=Math.max(max,list.get(i));
//        }
//        System.out.println("max ele:"+max);
//
//        int idx1=1,idx2=3;
//        swap(list,idx1,idx2);
//        System.out.println(list);



        //_________________Multi Dimensional Arraylist______________________

//        ArrayList<ArrayList <Integer>> mainlist = new ArrayList<>();
//        ArrayList<Integer> list =new ArrayList<>();
//        ArrayList<Integer> list2=new ArrayList<>();
//        ArrayList<Integer> list3=new ArrayList<>();
//
//        for(int i=1;i<=5;i++){
//            list.add(i*1);
//            list2.add(i*2);
//            list3.add(i*3);
//        }
//
//        mainlist.add(list);
//        mainlist.add(list2);
//        mainlist.add(list3);
//
//        System.out.println(mainlist);
//
//        for(int i=0;i<mainlist.size();i++){
//            ArrayList<Integer> currlist=mainlist.get(i);
//            for(int j=0;j<currlist.size();j++){
//                System.out.print(currlist.get(j)+" ");
//            }
//            System.out.println();
//        }


//        ArrayList<Integer> height=new ArrayList<>();
//        height.add(1);
//        height.add(8);
//        height.add(6);
//        height.add(2);
//        height.add(5);
//        height.add(4);
//        height.add(8);
//        height.add(3);
//        height.add(7);

        //System.out.println(storeWater(height));

        ArrayList<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        int target=5;

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        int ele=list.get(2);  //O(1)
        System.out.println(ele);

        System.out.println(rotatedPairsum(list,target));

    }
}
