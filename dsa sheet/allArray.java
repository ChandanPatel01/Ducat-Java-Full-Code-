import java.util.Scanner;
public class allArray {
    //int n;
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
         for(int i=0;i<n;i++)
         {
                
         
           System.out.print( arr[i]+" ");
              

    }
}
}
