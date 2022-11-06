
import java.util.LinkedList;
public class Main // LinkedListDemo_1
{
	public static void main(String[] args) {

		 LinkedList<Integer> l2=new LinkedList<>();
		 l2.add(2);
		 l2.add(5);
		 l2.add(2);
		 l2.add(1);
		  // l2.clear();
		  //l2.pop();
		 System.out.println(l2.peek());  //for 1st element 
		  
		   System.out.println(l2.contains(1));  // boolean
		 for(int i=0; i<l2.size(); i++)  
		   {   
		    
      	 System.out.println(l2.get(i));
      	 l2.set(3,320);  //index 3 or element 320
		   }
         System.out.println(l2);
         

	}
}
