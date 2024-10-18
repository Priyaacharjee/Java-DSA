import java.util.*;

public class Patternad {
//    //Hollow Rectangle
//   public static void hollow_rectangle(int row,int col){
//       for(int i=1;i<=row;i++){
//           for(int j=1;j<=col;j++){
//               if(i==1 || i== row || j==1 || j==col){
//                   System.out.print("*");
//               }
//               else{
//                   System.out.print(" ");
//               }
//           }
//           System.out.println();
//       }
//   }

    //inverted half pyramid
//    public static void invert_pyr(int row){
//        for(int i=1;i<=row;i++){
//            //Spaces
//            for (int j=1;j<=row-i;j++){
//                System.out.print(" ");
//            }
//            //rows
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //inverted half pyramid with num
//    public static void invert_pyr_num(int row){
//        for(int i=row;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }

    //FLOYD'S Triangle
//    public static void floyd(int row){
//        int c=1;
//        for(int i=1;i<=row;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print((c)+" ");
//                c++;
//            }
//            System.out.println();
//        }
//    }
    //0-1 Triangle
//    public static void zero_one_tri(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if((i+j)%2==0){
//                    System.out.print("1");
//                }
//                else{
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }
//    }
    //Butterfly pattern
//    public static void butterfly(int n){
//        //1st half
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j=1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//        //2nd half
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j=1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//    }

//    public static void solid_rhombus(int n){
//        for(int i=1;i<=n;i++){
//           for(int j=1;j<=(n-i);j++){
//               System.out.print(" ");
//           }
//            for(int j=1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //Hollow rhombus
//    public static void hollow_rhombus(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=(n-i);j++){
//                System.out.print(" ");
//            }
//
//            //hollow rectangle
//            for(int j=1;j<=n;j++){
//                if(i==1 ||i==n || j==1 || j==n){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }


    //Diamond pattern
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
   public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.print("Enter the row:");
       int r=sc.nextInt();
//       System.out.println("Enter the col:");
//       int c=sc.nextInt();

//       hollow_rectangle(r,c);
//       invert_pyr(r);
       //floyd(r);
       //zero_one_tri(r);
       //butterfly(r);
       //solid_rhombus(r);
       //hollow_rhombus(r);
       diamond(r);

   }

}
