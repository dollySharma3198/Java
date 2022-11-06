import java.util.Stack;
public class Main // StackDemo_1
{
	public static void main(String[] args) {
		Stack<String> brand=new Stack<>();
		//LIFO Last in first out 
		brand.add("puma");
    	brand.add("zara");
		brand.add("reebok");
		brand.add("x blues");
		brand.add("H.M");
		//brand.pop(); //lifo last in first out reebok
		brand.push("max");
	
		System.out.println(brand.peek());
		System.out.println(brand);
		
//System.out.println(brand.contains("zara"));   //for boolean
 		System.out.println(brand.indexOf("zara"));
 		//System.out.println(brand.lastindexOf());  //NOT WORK 
	//System.out.println(brand.remove("H.M")); // not work
	//brand.set("zara,firebolT");
		

		
		 
	}
}
