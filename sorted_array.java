// Wap a java program to find whether an array is sorted or not 
// error
import java.util.Scanner;
class sorted_array{
    public static void main(String[] args) {

        boolean isSorted;
        int arr[]={1,45,56,68,70,80};
        for(int i=0;i<arr.length;i++)  //-1 for 6th element 
        {
          if (arr[i]>arr[i+1]);
          {
              isSorted=false;
              break;
          }
        }
        if (isSorted)
        {
            System.out.println("the array is sorted");
        }
        else{
      System.out.println("the array is not sorted");
        }
    }
}