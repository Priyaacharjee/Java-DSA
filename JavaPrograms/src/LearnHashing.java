import java.util.*;
public class LearnHashing {

    public static boolean isAnagram(String s,String t){  //O(n)
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else {
                return false;
            }
        }
        return map.isEmpty();
    }

    public static int DistinctElements(int a[]){   //O(n)
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        return set.size();
    }

    public static void UnionIntersection(int a1[],int a2[]){
        HashSet<Integer> set=new HashSet<>();
//        union
        for(int i=0;i<a1.length;i++){
            set.add(a1[i]);
        }

        for(int i=0;i<a2.length;i++){
            set.add(a2[i]);
        }
        System.out.println("Union ="+set.size());

        //Intersection
        set.clear();

        for(int i=0;i<a1.length;i++){
            set.add(a1[i]);
        }
        int c=0;
        for(int i=0;i<a2.length;i++){
            if(set.contains(a2[i])){
                c++;
                set.remove(a2[i]);
            }
        }
        System.out.println("Intersection ="+c);
    }

    public static void LargestSubarraySum(int a[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        //(Sum,Idx)
        int sum=0,len=0;

        for(int j=0;j<a.length;j++){
            sum+=a[j];
            if(map.containsKey(sum)){
                len=Math.max(len,j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
        System.out.println("Largest subarray with sum as 0= "+len);
    }

    public static int SubarrayK(int a[],int k){ //O(n)
      HashMap<Integer,Integer> map=new HashMap<>();
      map.put(0,1);

      int sum=0,ans=0;
      for(int i=0;i<a.length;i++){
          sum+=a[i];
         if(map.containsKey(sum-k)){
            ans+=map.get(sum-k);
         }
         map.put(sum,map.getOrDefault(sum,0)+1);
      }
      return ans;
    }
    public static void main(String[] args) {

//-----------------------------Basic Hashing Intro------------------------------
//        //create
//        HashMap<String, Integer> hm = new HashMap<>();
//
//        //insert
//        hm.put("India", 100);
//        hm.put("China", 120);
//        hm.put("US", 50);
//
//        //System.out.println(hm);
//
//        //Get - O(1)
////       int pop= hm.get("India");
////        System.out.println(pop);
////
////        //ContainsKey - O(1)
////        System.out.println(hm.containsKey("India"));
////        System.out.println(hm.containsKey("Indonesia"));
////
////        //remove - O(1)
////        System.out.println(hm.remove("China"));
////        System.out.println(hm);
////
////        //Is Empty
////        hm.clear();
////        System.out.println(hm.isEmpty());
////
////        //Iteration on HashMap
////        Set<String> keys=hm.keySet();
////        System.out.println(keys);
//
////        for(String k : keys){
////            System.out.println("key="+k+",value="+hm.get(k));
////           }
//
//        //Linked HashMap //Order maintained
////        LinkedHashMap<String, Integer> lhm= new LinkedHashMap<>();
////        lhm.put("India",100);
////        lhm.put("China",150);
////        lhm.put("Us",50);
////        System.out.println(lhm);
//
//        TreeMap<String, Integer> tm= new TreeMap<>();
//        tm.put("India",100);
//        tm.put("China",150);
//        tm.put("Us",50);
//        tm.put("Indonesia",500);
//        System.out.println(tm);
// -----------------------------Basic Hashing Intro------------------------------


        //--------------------Majority Elements-----------------------
//        int a[]={1,3,2,5,1,3,1,5,1};
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<a.length;i++){
////            if(map.containsKey (a[i])){
////                map.put(a[i],map.get(a[i])+1);
////            }else{
////                map.put(a[i],1);
////            }
//
//            //one liner
//            map.put(a[i],map.getOrDefault(a[i],0)+1);
//        }
//
//        //Set<Integer> keySet =map.keySet();
//        for(Integer key: map.keySet()){
//            if(map.get(key)>a.length/3){
//                System.out.print(key);
//            }
//        }

        //--------------------Majority Elements-----------------------

        //anagram
//        String s="tulip";
//        String t="care";
//        System.out.println(isAnagram(s,t));

        //---------------------------------HashSet---------------------------------------
//        HashSet<String> cities = new HashSet<>();
//        cities.add("Delhi");
//        cities.add("Mumbai");
//        cities.add("Bng");
//
//        LinkedHashSet<String> lhs = new LinkedHashSet<>();
//        lhs.add("Delhi");
//        lhs.add("Mumbai");
//        lhs.add("Bng");
//
//        TreeSet<String> ts = new TreeSet<>();
//        ts.add("Delhi");
//        ts.add("Mumbai");
//        ts.add("Bng");
//
//
////        Iterator it=cities.iterator();
////        while(it.hasNext()){
////            System.out.println(it.next());
////        }
//
//        for(String city:cities){
//            System.out.println(city);
//        }
//
//        for(String city:lhs){
//            System.out.println(city);
//        }
//
//        for(String city:ts){
//            System.out.println(city);
//        }

        //---------------------------------HashSet---------------------------------------

//        int a[]={4,3,2,5,6,7,3,4,2,1};
//        System.out.println(DistinctElements(a));

//        int a1[]={4,3,5,2,3};
//        int a2[]={4,2,2,8};
//        UnionIntersection(a1,a2);

//        int a[]={15,-2,2,-8,1,7,10,23};
//        LargestSubarraySum(a);

        int a[]={10,-2,2,-20,10};
        System.out.println(SubarrayK(a,-10));
    }

}
