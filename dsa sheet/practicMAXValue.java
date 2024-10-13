public class practicMAXValue {
 void MaxValue()
 {
    int[]arr={5,9,22,89,23};
    int ans=0;
    for(int i=0; i< arr.length; i++){

        if(arr[i]>ans)
        {
             ans= arr[i];

        }
    }
    System.out.println("MAXMUM VALUE: " +ans);

 }
    public static void main(String[] args){
        practicMAXValue obj=new practicMAXValue();
        obj.MaxValue();
        
    }
}

