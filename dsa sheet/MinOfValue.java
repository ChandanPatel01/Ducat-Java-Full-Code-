public class MinOfValue {
void Minnum(){
   int[] arr={1,5,6,2};
   int ans= arr[0] ;
   for(int i=0;i<arr.length;i++){
      if(ans>arr[i]){
        arr[i]=ans;
      }

   }

   System.out.println("MINIMUM NUMBER: "+ans);

}
public static void main (String[]args){

    MinOfValue obj=new MinOfValue();
    obj.Minnum();
}

    
}
