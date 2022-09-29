import java.util.Scanner;
class min_Value{
    public static void main(String[] args) {
        int arr[]={56,78,1,45,56,52,40,80};
        int min=arr[0];
        // int min=Integer.MAX_VALUE;
        System.out.println(Integer.MAX_VALUE);

        for(int i:arr)
        {
            if(i<min)
            {
                min=i;
            }
        }
        
      System.out.println("the minimum value is in this array "+min);
    }
}