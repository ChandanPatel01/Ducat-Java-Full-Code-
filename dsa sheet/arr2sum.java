public class arr2sum {
    void sumofArray(){
        int[]arr={5,40,78};
        int sum=0;
        for(int i=0;i< arr.length;i++){
        sum= sum+arr[i];
   
        }
        System.out.println("total sum:"+sum);
   }
       
   
         public static void main(String[]args ){
          arr2sum obj=new arr2sum();
           obj.sumofArray();
         }
}
