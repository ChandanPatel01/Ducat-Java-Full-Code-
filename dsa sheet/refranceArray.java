import java.util.Scanner;

public class refranceArray {

    static void prinArray(int[]arr){

        for(int i=0;i<arr.length;i++)
         {
           System.out.print( arr[i]+" ");
         }
         System.out.println();
    }
        public static void main(String[]args){
          Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Array Size");
       int n=sc.nextInt();
       int[]arr=new int[n];
        System.out.println("Enter Your "+ n + "Elements");
         for(int i=0;i<arr.length;i++)
         {
           arr[i]=sc.nextInt();

         }
         System.out.println("this is your originol array");
            prinArray(arr);
         //trying to copy array
         System.out.println("this is your copied array");
         int[] arr_2=arr;
         prinArray(arr_2);

        }
}
