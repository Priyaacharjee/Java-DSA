import java.util.ArrayList;

public class Arraylist_Assignment {
    public static boolean isMonotonic(ArrayList<Integer>nums){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)<nums.get(i+1)){
                dec=false;
            }
            if(nums.get(i)>nums.get(i+1)){
                inc=false;
            }
        }
        return inc|dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer>nums1=new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(2);
        nums1.add(3);

        ArrayList<Integer>nums2=new ArrayList<>();
        nums2.add(6);
        nums2.add(5);
        nums2.add(4);
        nums2.add(4);

        ArrayList<Integer>nums3=new ArrayList<>();
        nums3.add(1);
        nums3.add(3);
        nums3.add(2);

        System.out.println(isMonotonic(nums1));
        System.out.println(isMonotonic(nums2));
        System.out.println(isMonotonic(nums3));
    }
}
