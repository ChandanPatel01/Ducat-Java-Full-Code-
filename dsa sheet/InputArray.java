import java.util.Scanner;
public class InputArray {
     void Input(){
        int ans =0;
        final Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your  Array Size");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter "+  n +"Element");

        for(int i=0;i<arr.length;i++) 
        {
             arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>ans)
            {
                ans=arr[i];
            }
            
         
        }
               System.out.println("THIS MAX VALUE:::"+ans);  
        }
        public static void main(String[]args){
            InputArray obj=new InputArray();
            obj.Input();
        }
}
 