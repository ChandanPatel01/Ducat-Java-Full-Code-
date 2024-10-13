import java.util.Scanner;
public class Fibonacci {
   static void showFobbonacci(int n){
    int num1;
    int num2=0;
    int num3=1;
     
     for(int i=1;i<=n;i++){
        System.out.println(num3);
        num1=num2; 
        num2=num3;
        num3=num1+num2;

     }
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter Number");
      int n = sc.nextInt();
      if(n>0){
        showFobbonacci(n);
      }
      else{
        System.out.println("Please enter a positive number");
      }
   }
    
}
