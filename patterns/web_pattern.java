public class web_pattern {
    public static void main(String[] args) {
        int rows = 3; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for alignment
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars in odd numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(" *");
            }
            System.out.println();

            
        }

        for(int i=0;i<=rows;i++){
            for(int j=0;j<rows;j++){
               if(i==j){
                System.out.print("@         @" );
               } 

               
    
     }
            System.out.println();
        }

        for (int i = rows; i >= 1; i--) {
            // Print leading spaces for alignment
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars in odd numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
    
}
