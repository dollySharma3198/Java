import java.util.Arrays;

class StringFxn
{
    public static void main(String[] args) 
    {
        // String sen="StackOverflow";
        // System.out.println(sen.length());

        // String s2=sen.concat(" Website");
        // System.out.println(s2);

        // System.out.println(s2.charAt(2));
        // System.out.println(s2.contains("O"));
        // System.out.println(s2.contains("Over"));
        // System.out.println(s2.contains("z"));
        // String sent2="StackOverfloW";
        // System.out.println(sen.equals(sent2));
        // System.out.println(sen.equalsIgnoreCase(sent2));
        // System.out.println(sen.toLowerCase());
        // System.out.println(sen.toUpperCase());
        // System.out.println(sen.replace("Over", "Flow"));
        // System.out.println(sen);
        // System.out.println(sen.repeat(3));

        // String sentence="        Aman      Tiwari          ";
        // String sent="Hii.everyone";
        // System.out.println(sentence.length());
        // System.out.println(sentence.trim());
        // System.out.println(sentence.trim().length());
        // System.out.println(sentence.replace(" ", "."));

        // System.out.println(sent.substring(3));
        // System.out.println(sent.substring(4,8));

        // char charr[]=sent.toCharArray();
        // for (char c : charr) 
        // {
        //     System.out.println(c);
        // }

        // String s=String.valueOf(78);//converting int to string
        // System.out.println(s);

        // String str=new String("Dog");

        // String lit=str.intern();
        // System.out.println(lit);

        // String name="dolly sharma";
        // String name1="Dolly";

        // System.out.println(name.compareTo(name1));

        // System.out.println(name.indexOf("l"));
        // String sentence=String.join("-",name1,"Sharma","is","a","very");
        // // System.out.println(sentence);

        // String arr[]=sentence.split("-");

        // System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < arr.length; i++) 
        // {
        //     System.out.println(arr[i]);
        // }

            StringBuilder sb=new StringBuilder("Hello");
            sb.append(" Sir");

            // sb.insert(2,"iii");
            // sb.delete(2, 5);
            // sb.reverse();
            // System.out.println(sb);
            
            String s2=String.valueOf(sb);
            System.out.println(s2);
            System.out.println(sb.getClass().getName());

            StringBuffer sbuff=new StringBuffer();

    }
}
