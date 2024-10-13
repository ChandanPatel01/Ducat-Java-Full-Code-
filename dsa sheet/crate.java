import java.util.Scanner;
public class crate {
    void minInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR ARRAY SIZE :");
        int n = sc.nextInt(); 
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
        {

            System.out.println("ENTER YOUR " + i + " aNO ELEMENTS OF ARRAY from 0 to "+(n-1)); 
            arr[i] = sc.nextInt(); 
        }
            System.out.println("array elements"); 
            for(int i = 0; i < arr.length; i++)
            {

                System.out.println(" "+arr[i]);
            }
          //  System.out.println("=============================length is :"+arr.length);
            int ans = arr[0];
            for (int i = 0; i < arr.length; i++) 
            {
                if(arr[i]<ans)
                {
                   System.out.println(arr[i]+" : " + ans);
                   ans=arr[i]; 

                }
            }
            System.out.println("this is min value:" + ans);
    }
    public static void main(String args[]){
        crate obj=new crate();
        obj.minInput();
    }

}
