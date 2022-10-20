//import java.utils.arrays;
public stringFXN_1
{
	public static void main(String[] args) {
	String s1="StackOverflow";
// 		System.out.println(s1.length());
// 		String s2=s1.concat("website");
// 		System.out.println(s2);
// 		System.out.println(s2.charAt(2));
// 		System.out.println(s2.contains("0"));
// 		System.out.println(s2.contains("over"));
// 		System.out.println(s2.contains("z"));
		
		String Sem3="StackOverfloW";
		System.out.println(s1.equals(Sem3));
		System.out.println(s1.equalsIgnoreCase(Sem3));
		System.out.println(s1.replace("over","Flow"));
		System.out.println(s1);
		System.out.println(s1.repeat(3));
		
		String sentence="   Dolly   sharma   ";
		String sen4="Hello.everyone";
		System.out.println(sentence.length());
		System.out.println(sentence.trim());
		System.out.println(sentence.trim().length());
		System.out.println(sentence.replace(" ", "."));
// 		System.out.println(sent4.substring(3)); //error
// 		System.out.println(sent4.substring(4,6)); //error
        // Char charr[]=sent4.toCharArray();
        // for(char c: Charr)
        // {
        //     System.out.println(c);
        // }
        String s=String.valueOf(78);  //converting to string
        System.out.println(s);
        String str=new String("Dog");
        String lit=str.intern();
        System.out.println(lit);
        String name="dolly sharma";
        String name1="dolly";
        System.out.println(name.compareTo(name1));
        System.out.println(name.indexOf("l"));
        //String sentence=String.join(" ","name1","is","very","talented","girl");  //error
        //  String arr[]=sentence.split("-");
        //  System.out.println(Arrays.toString(arr)); //error
        //  for(i=0; i<arr.length; i++)
        //  {
        //      System.out.println(arr[i]); //error
        //  }
        StringBuilder sb=new StringBuilder("HELLO");
        sb.append("sir");
        sb.insert(2,"iii");
        sb.delete(2,5);
         System.out.println(sb);
         String s2=String.valueOf(sb);
         System.out.println(sb.getClass().getName());
          StringBuffer sbuff=new StringBuffer();
	}
}
