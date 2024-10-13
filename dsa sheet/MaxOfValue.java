public class MaxOfValue {
    void Maxnum(){
     int[]arr={1,5,7,3,8,6};
     int ans=0;
     for(int i=0;i<arr.length;i++){

        if(arr[i]>ans){
           ans =arr[i];

        }
     }
    System.out.println("MAXIMUM NUMABER:"+ans);

    }  

    

public static void main (String[]args){
    MaxOfValue obj=new MaxOfValue();
    obj.Maxnum();
       

}
}
