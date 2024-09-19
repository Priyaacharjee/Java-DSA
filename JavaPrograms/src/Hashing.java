import java.util.*;

public class Hashing {

    //majority elements
    public static void majorityelement(int nums[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
               map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }

        for(int key:map.keySet()){
            if(map.get(key)> n/3){
                System.out.println(key);
            }
        }
    }

   // Union of 2 arrays
    public static int Unionofarrays(int arr1[],int arr2[]){
        HashSet<Integer> set= new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }

        return set.size();

    }

    public static int Intersectionofarrays(int arr1[],int arr2[]){
        HashSet<Integer> set= new HashSet<>();
        int c=0;
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])) {
                c++;
                set.remove(arr2[j]);
            }
        }
        return c;
    }

    //Find Itinerary from tickets
    public static String getStart(HashMap<String,String> tick)
    {
        HashMap<String,String> revMap = new HashMap<>();

        for(String key : tick.keySet()){
            revMap.put(tick.get(key),key);
        }

        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    //Subarray Sum

    




    public static void main(String[] args) {
        //creating
//        HashSet<Integer> set=new HashSet<>();
//
//        //Insert
//        set.add(1);
//        set.add(2);
//        set.add(1);
//        set.add(5);
//
//        //size
//        System.out.println("size of set is:"+set.size());
//
//        //search
//        if(set.contains(1)){
//            System.out.println("set contains 1");
//        }
//        if(!set.contains(6)){
//            System.out.println("does not contain");
//        }
//
//       // delete
//        set.remove(1);
//        if(!set.contains(1)){
//            System.out.println("we deleted 1");
//        }
//
//        //print all ele
//        System.out.println(set);
//
//        //iterator
//        Iterator it=set.iterator();
//
//        //hasnext //next
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }


        //-------HASHMAP---------

        //create
//        HashMap<String,Integer> map= new HashMap<>();
//
//        //Insertion
//        map.put("India",120);
//        map.put("Us",30);
//        map.put("china",150);
//
//        System.out.println(map);
//
//        //update existing
//        map.put("china",180);
//        System.out.println(map);
//
//        //Search
//        if(map.containsKey("china")){
//            System.out.println("key is present");
//        }else{
//            System.out.println("key is not present");
//        }
//
//        //key with value
//        System.out.println(map.get("china"));
//        System.out.println(map.get("indonesia"));
//
//        //Iterator for each loop
//        //for(val : Collection)
//        int arr[]={10,12,13};
//        for(int val:arr){
//            System.out.println(val+ " ");
//        }
//
//        //Iteration in hashmap
//        for(Map.Entry<String,Integer> e: map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println((e.getValue()));
//        }
//
//        Set<String> Keys=map.keySet();
//        for(String key: Keys){
//            System.out.println(key+" "+map.get(key));
//        }
//
//        //remove
//        map.remove("China");
//        System.out.println(map);


        //Majority Element
        //given integer array
           // int nums[]={1,3,2,5,1,3,1,5,1};
            //majorityelement(nums);
//        int arr1[]={7,3,9};
//        int arr2[]={6,3,9,2,9,4};
//        System.out.println(Unionofarrays(arr1,arr2)); //2,3,4,6,7,9 = 6
        //System.out.println(Intersectionofarrays(arr1,arr2)); //2

        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai","Benagaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.println(start);
            start=tickets.get(start);
        }
        System.out.println(start);
    }
}
