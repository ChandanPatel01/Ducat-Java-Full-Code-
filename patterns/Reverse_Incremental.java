public class Reverse_Incremental {
    public static void main(String[] args) {
        int num = 5;
    //
        for(int i=1; i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
       System.out.println();
        ///   for reverse 
        for(int i=num; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    
}
