public class sumarray{
    void sumofArray(){
     int[] arr={1,5,3};
     int sum=0;
     for(int i=0;i< arr.length;i++){
     sum= sum+arr[i];
     

     }
     System.out.println("total sum:"+sum);
}
    

      public static void main(String[]args ){
        sumarray obj=new sumarray();
        obj.sumofArray();
      }

    }
    

    

