public class Main  //Stringutils
{
	public static void main(String[] args) {
	String s="dolly";
	s.concat("sharma");
	System.out.println(s);  //becoz string object is immutable
	StringBuilder sb=new StringBuilder("dolly"); //bcoz string object is immutable
	StringBuffer sbuff=new StringBuffer("hello ");
	
	//System.out.println(sb);
	sb.append("sharma");
	sbuff.append("everyone");
	System.out.println(sbuff);
	}
}
