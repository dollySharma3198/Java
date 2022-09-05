import java.util.Scanner;
        class Array_2D {
    public static void main(String[] args) {
        int[][] homes;
        homes=new int[2][3];
        homes[0][1]=103;
        homes[0][1]=102;
        homes[0][2]=103;
        homes[1][0]=104;
        homes[1][1]=105;
        homes[1][2]=108;
         System.out.println(" the 2 dimension array is\n");
         
        for(int i=0;i<homes.length; i++)
        {
            for(int j=0; j<homes[i].length; j++)
        {
         System.out.print(homes[i] [j] );
         System.out.print("\n");
           }
}
        System.out.println(" ");
    }
}