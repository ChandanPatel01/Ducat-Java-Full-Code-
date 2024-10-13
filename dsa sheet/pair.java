//Find the Total Number of Pair in Array whose sum is equal to the given value of X.//

// Suppose Array Size = {4,6,3,5,8,2}       TARGET SUM =7     ACTUAL POSITION =2    CASE (4,3)(5,2)//
import java.util.Scanner;
public class pair {
    static int  pair (int[]arr ,int target){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){

                if(arr[i]+arr[j]==target){

                    ans++;
                }
            }
        }
            return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size::");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter" + n + "Elements of array");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();

        }
        System.out.println("Enter Target Sum");
        int target=sc.nextInt();

        System.out.println(pair(arr, target));
    }
}
