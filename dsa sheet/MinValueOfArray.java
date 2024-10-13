public class MinValueOfArray {
    void  MinValue(){
       int []arr={15,26,36,56};
       int ans =arr[0];
       for(int i=0; i<arr.length;i++){
           if(ans>arr[i]){
             arr[i]= ans;

           }

       }
       System.out.println("THIS IS YOUR MNIMUM VALUE:" +ans);
       

    }
         public static void main(String[]args){
           MinValueOfArray obj=new MinValueOfArray();
           obj.MinValue();

         }
}
