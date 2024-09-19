import java.util.*;
//public class GreedyApproach {
//
//    public static void main(String[] args) {
//
//        //----------Activity Selection---------------------
////        int start[]={1,3,0,5,8,5};
////        int end[]={2,4,6,7,9,9};//end time basis sorted
////
////        //sort
////        int activity[][]=new int [start.length][3];
////        for(int i=0;i<start.length;i++){
////            activity[i][0]=i;
////            activity[i][1]=start[i];
////            activity[i][2]=end[i];
////        }
////
////        //lambda function->shortform
////        Arrays.sort(activity,Comparator.comparingDouble(o->o[2]));
////
////        int maxAct=0;
////        ArrayList<Integer> ans = new ArrayList<>();
////
////        //if already sorted ending time given
////       //1st activity
//////        maxAct=1;
//////        ans.add(0);
//////        int lastEnd=end[0];
//////        for(int i=1;i<end.length;i++){
//////            if(start[i]>=lastEnd){
//////                //activity select
//////                maxAct++;
//////                ans.add(i);
//////                lastEnd=end[i];
//////            }
//////        }
////
////        maxAct=1;
////        ans.add(activity[0][0]);
////        int lastEnd=activity[0][2];
////        for(int i=1;i<end.length;i++){
////            if(activity[i][1]>=lastEnd){
////                //activity select
////                maxAct++;
////                ans.add(activity[i][0]);
////                lastEnd=activity[i][2];
////            }
////        }
////
////        System.out.println("max activities = " +maxAct);
////        for(int i=0;i<ans.size();i++){
////            System.out.print(" A"+ans.get(i));
////        }
//        //----------Activity Selection---------------------
//
//
//        //-------------Fractional Knapsack-------------------------
//
////        int val[]={60,100,120};
////        int weight[]={10,20,30};
////        int w=50;
////
////        double ratio[][]=new double[val.length][2];
////        //0th col=idx; 1st col=ratio
////
////        for(int i=0;i<val.length;i++){
////            ratio[i][0]=i;
////            ratio[i][1]=val[i]/(double)weight[i];
////        }
////
////        //ascending order
////        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
////
////        int capacity=w;
////        int finalval=0;
////        for(int i=ratio.length-1;i>=0;i--){
////            int idx=(int)ratio[i][0];
////            if(capacity >= weight[idx]){
////                finalval+=val[idx];
////                capacity-=weight[idx];
////            }else{
////                //include fractional item
////                finalval+=(ratio[i][1] * capacity);
////                capacity=0;
////                break;
////            }
////        }
////        System.out.print("finalval= "+finalval);
//
//        //-------------Fractional Knapsack-------------------------
//
//        //-------------Minimum sum absolute difference pairs--------------------------
//
////        int A[]={1,7,5};
////        int B[]={2,3,5};
////
////        Arrays.sort(A);
////        Arrays.sort(B);
////
////        int minDiff=0;
////
////        for(int i=0;i<A.length;i++){
////            minDiff+=Math.abs(A[i]-B[i]);
////        }
////        System.out.println("Min absolute diff of pairs = "+minDiff);
//
//        //-------------Minimum sum absolute difference pairs--------------------------
//
//        //-------------Maximum length chain of pairs-------------------
//
////        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};  //O(nlogn)
////
////        Arrays.sort(pairs,Comparator.comparingDouble(o ->o[1]));
////
////        int chainLen=1;
////        int chainEnd=pairs[0][1];  //last selected pair end //chain end
////
////        for(int i=1;i<pairs.length;i++){
////            if(pairs[i][0] > chainEnd){
////                chainLen++;
////                chainEnd=pairs[i][1];
////            }
////        }
////        System.out.println("max length of chain = "+chainLen);
//
//        //-------------Maximum length chain of pairs----------------------
//
//
//        //-----------------Indian Coins-------------------------
////        Integer coins[]={1,2,5,10,20,50,100,500,2000};
////
////        Arrays.sort(coins,Comparator.reverseOrder());
////        int count=0;
////        int amount=590;
////        ArrayList<Integer> ans=new ArrayList<>();
////
////        for(int i=0;i<coins.length;i++){
////            if(coins[i]<= amount){
////                while(coins[i]<=amount){
////                    count++;
////                    ans.add(coins[i]);
////                    amount-=coins[i];
////                }
////            }
////        }
////        System.out.println("total (min) coins used="+count);
////        for(int i=0;i<ans.size();i++){
////            System.out.print(ans.get(i)+" ");
////        }
//        //-----------------Indian Coins-------------------------
//    }
//}

  //--------------------Job Sequencing Problem--------------------
//public class GreedyApproach{
//    static class Job{
//        int deadline;
//        int profit;
//        int id;
//
//        public Job(int i,int d,int p){
//            id=i;
//            deadline=d;
//            profit=p;
//        }
//    }
//    public static void main(String[] args) {
//        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
//
//        ArrayList<Job> jobs = new ArrayList<>();
//
//        for(int i=0;i<jobsInfo.length;i++){
//            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
//        }
//
//        Collections.sort(jobs,(a,b) ->b.profit-a.profit); //descending order sort of objects here profit
//
//        ArrayList<Integer> seq =new ArrayList<>();
//        int time=0;
//        for(int i=0;i<jobs.size();i++){
//            Job curr=jobs.get(i);
//            if(curr.deadline>time){
//                seq.add(curr.id);
//                time++;
//            }
//        }
//        //print seq
//        System.out.println("max jobs = "+seq.size());
//        for(int i=0;i<seq.size();i++){
//            System.out.println(seq.get(i)+" ");
//        }
//        System.out.println();
//    }
//}
       //--------------------Job Sequencing Problem--------------------

   //------------------------Chocola Problem----------------------------
  public class GreedyApproach{    //SPOJ
       public static void main(String[] args) {
           int n=4,m=6;
           Integer costVer[]={2,1,3,1,4};
           Integer costHor[]={4,1,2};

           Arrays.sort(costVer,Collections.reverseOrder());
           Arrays.sort(costHor,Collections.reverseOrder());

           int h=0,v=0;
           int hp=1,vp=1;
           int cost=0;

           while(h<costHor.length && v<costVer.length){
               if(costVer[v] <= costHor[h]){ //horizontal cut
                   cost+=(costHor[h]*vp);
                   hp++;
                   h++;
               }else{ //vertical cut
                   cost+=(costVer[v]*hp);
                   vp++;
                   v++;
               }
           }

           while(h<costHor.length){
               cost+=(costHor[h]*vp);
               hp++;
               h++;
           }
           while(v<costVer.length){
               cost+=(costVer[v]*hp);
               vp++;
               v++;
           }
           System.out.println("min cost of cuts = "+cost);
       }
   }