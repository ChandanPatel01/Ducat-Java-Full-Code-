public class parcticeArraySum {
    void ArraySum(){
     int[]arr={5,1820,14,63};
     int ans =0;
     for( int i=0;i<arr.length;i++)
     ans= arr[i]+ans;
    System.out.println("THIS IS SUM :"+ans);

    }
     public static void main(String[] args) {
       parcticeArraySum obj=new parcticeArraySum ();
       obj.ArraySum(); 
        
    }
    
}
