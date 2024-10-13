import java.util.Scanner;
public class primenumber {

    public static void main (String[]args)
    {
      int n;
      int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of N::");
      n=sc.nextInt();
      if(n%2==0)
      {
        System.out.println("This is Prime NUmber ");

      }
       else 
       {
        System.out.println("This is not prime number");
       }

   }
    
    
}
