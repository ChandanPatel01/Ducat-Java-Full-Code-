 import java.util.Scanner;
 public class paymentBill {
    void paytm(){
    int pizaa=10;
    int puff=12;
    int colddrink=5;
     int total_Pizza;
     int  total_puff;
     int total_coddrink;

    total_Pizza = pizaa*100;
    total_puff= puff*20;
    total_coddrink=colddrink*10;

    int total_Pyament=  total_Pizza+ total_coddrink+total_puff;

    System.out.println("This is your total payment: "+total_Pyament);
}
   public static void main(String[]args){
    paymentBill obj=new paymentBill(); 
    obj.paytm();

   }
    
}
