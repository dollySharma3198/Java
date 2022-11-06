
import java.util.Vector;
public class Main // VectorDemo_1
{
	public static void main(String[] args) {

		 Vector<Integer> v1=new Vector<>();
		 v1.add(2);
		 v1.add(5);
		 v1.add(2);
		 v1.add(1);
		  // v1.clear();
		   System.out.println(v1.contains(1));  // boolean
		 for(int i=0; i<v1.size(); i++)  
		   {   
		    
      	 System.out.println(v1.get(i));
      	 v1.set(1,566);
		   }
         System.out.println(v1);
         

	}
}
