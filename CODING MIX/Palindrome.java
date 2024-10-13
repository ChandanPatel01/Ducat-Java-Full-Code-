import java.util.Scanner;
public class Palindrome 
{
   
    
    public static void main(String[] args) {
        int n,s=0,r,t;
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits you want in your palindrome ");
         n = sc.nextInt();
         t=n;                                                                                                                                                                                                               
            
        while (n!=0)
        {
            

            r =n%10;
            s =(s*10)+r;
            n = n/10;

        }
        System.out.println(s);

        if (t==s) 
        {
            System.out.println("This is pa;indrome : ");
        }
        else
        {
            System.out.println( "This is not palindrome");
        }


        
    }
}


