public class Logic {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
        }
        System.out.println();
    }

     System.out.println();

    for(int i=n;i>=1;i--){
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
            
    }
    System.out.println();
}
System.out.println();

for(int i=0;i<=n/2;i++){
    for(int j=0;j<=n/2;j++){
        System.out.print(" "); 
}
   for(int j=0;j<2*i;j++){
    System.out.print("* ");
   }
System.out.println();
}
    
    }
}