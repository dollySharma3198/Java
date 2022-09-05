//QUE-2 find the element is in array or not

import java.util.Scanner;
        class Find_array {
    public static void main(String[] args) {
        float[] marks={48.5f,44.2f,63.0f, 44.1f,65.0f};
        float num=48.2f;
        boolean isInArray=false;
        for(float i:marks)
        {
         if (num==i){
             isInArray=true;
             break;
         }
    }
    if (isInArray){
         System.out.println("the value is present in array");
    }
  else
  {
  System.out.println("the value is not present in array ");
  }
    }
}