import java.util.Scanner;

public class inputArray2 {
  void minInput() {

    Scanner sc = new Scanner(System.in);

    System.out.println("ENTER YOUR ARRAY SIZE :");

    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("ENTER YOUR  " + n + "  ELEMENTS OF ARRAY ");
    int ans = arr[0];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      if (ans < arr[i]) {

        arr[i] = ans;
      }
       
    }
   System.out.println("this is min value:" + ans);

  }

  public static void main(String[] args) {

    inputArray2 obj = new inputArray2();
    obj.minInput();
  }

}
