import java.util.Scanner;

public class CustomPattern {
    public static void main(String[] args) {
        
       int n;
       int fac=1;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Number");
       n = sc.nextInt();
       for(int i=1;i<=n;i++){
         fac=fac*i;
         System.out.println(fac);
       }
    }
}
