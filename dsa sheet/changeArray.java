public class changeArray {
    static void change_Array(int[]arr){
    for(int i=0; i<arr.length;i++){
     arr[i]=0;

    }
    
}
    public static void main(String[]args){
        int[]arr=new int[3];
        arr[0]=6;
        arr[1]=7;
        arr[2]=8;
        change_Array(arr);

        for(int i=0;i<arr.length;i++){

           System.out.println(arr[i]);
        }
   }
    
}