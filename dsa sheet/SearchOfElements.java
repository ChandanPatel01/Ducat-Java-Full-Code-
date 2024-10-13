public class SearchOfElements {     
    
    void SearchElements(){
        
        int[]arr={5,1,8,9,6};
        int x = 8;
         int  ans=0;
         for (int i=0; i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
            }
         }
        System.out.println("FOUND:" +x+ " AT INDEX: "  +ans);
       
    }
      public static void main (String[]args){
        SearchOfElements obj=new SearchOfElements();
       obj. SearchElements();

      }
}
