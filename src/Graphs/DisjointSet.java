//to store and track non-overlapping sets
public class DisjointSet {
    static int n= 7;
    static int par[]=new int[n];
    static int rank[]=new int[n];

    public static void init(){
        for (int i = 0; i < n; i++) {
           par[i] =i;
        }
    }
    //mathematically O(4k) where k is const..but in general its O(1)
    public static int find(int x){
       if(x==par[x]){
           return x;
       }
       return par[x]=find(par[x]);  //path compression as par[x]=find(par[x]) otherwise we can only return find(par[x]),
        // so this is called path compression optimization in Disjoint Set
    }

    ////mathematically O(4k) where k is const..but in general its O(1)
    public static void union(int a,int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]== rank[parB]){
            par[parB]=parA;
            rank[parA]++;
        }else if(rank[parA]<rank[parB]){
            par[parA]=parB;
        }else{
            par[parB]=parA;
        }
    }

    public static void main(String[] args) {
        init();
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1,5);
    }
}
