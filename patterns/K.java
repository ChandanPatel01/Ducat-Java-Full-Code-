import java.util.Scanner;
public class K {
    public static void  main(String[] args) {
        int i,n,j;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your Number:");
        n=sc.nextInt();
        if(n<1 || n%2==0)
          return ;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= n; i++) {
            // Print leading spaces
            for (j = i; j < n; j++) {
                System.out.print("  ");
            }
            // Print stars
            for ( j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower inverted triangle part (excluding the middle row)
        for ( i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (j = i; j < n; j++) {
                System.out.print("  ");
            }
            // Print stars
            for ( j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    
}
}
