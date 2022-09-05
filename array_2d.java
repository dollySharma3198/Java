import java.util.Scanner;
class array_2d {
    public static void main(String[] args) {
        int [][]flats;      //
       flats=new int[2][3];
       flats[0][0]=100;
       flats[0][1]=102;
       flats[0][2]=102;
       flats[1][0]=102;
       flats[1][1]=102;
       flats[1][2]=102;
        System.out.println("the 2d array is");
        
       for(int i=0;i<flats.length;i++)
       {
           
      
       for(int j=0; j<flats[i].length; j++)
           {
        
        System.out.print(flats[i] [j]);
        System.out.print(" \n");
        
           }
        System.out.println("");
    }
    }
}