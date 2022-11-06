import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Main{ //ListDemo {

    public static void main(String[] args) {
        
        Stack<String> books=new Stack<>();

        //last in first out

        books.add("c");
        books.add("c++");
        books.add("Java");
        books.add("python");
        books.add("C#");
        books.pop();
        books.push("ruby");
        System.out.println(books.peek());
        System.out.println(books);

        Vector<String> v=new Vector<>();
        
        LinkedList<String> ll=new LinkedList<>();
        ll.add("aman2");
        ll.add("aman9");
        ll.add("aman7");
        ll.add("aman6");
        ll.add("aman5");
        ll.add("aman 4");
        System.out.println(ll);

        Queue<String> names=new ArrayDeque<>();
        // names.add("Aman");
        // names.add("aman9");
        // names.add("aman7");
        // names.add("aman6");
        // names.add("aman5");
        // names.add("aman 4");
        System.out.println(names.poll());
        names.remove();
        System.err.println(names);
    }
}
