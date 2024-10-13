import java.util.Scanner;
public class resurant {
    int Final_Bill;
    void recipt(){
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Pizza :");
        int Pizza= sc.nextInt();
        System.out.println("Enter Number Puff:");
         int Puff= sc.nextInt();
        System.out.println("Enter Number ColdDrink:");
         int ColdDrink= sc.nextInt();
         int total_Pizza= Pizza*100;
         int total_Puff=Puff*20;
         int total_coddrink=ColdDrink*0;
         Final_Bill=total_Pizza+total_Puff+total_coddrink;

         System.out.println(" PAY YOUR BILL  :::"  + Final_Bill);
   }

    public static void main(String[] args) {
        resurant obj=new resurant();
        obj.recipt();
    }
    
}
