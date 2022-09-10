
// creat a class square with a side calculating area, perimeter
//error
import java.util.Scanner;

class square {

    int side;

    public int area() {

        return side * side;

    }

    public int perimeter() {

        return 4 * side;

    }

}

public class Main {

    public static void main(String[] args) {

        square sq = new square();

        sq.side = 6;

        System.out.println("area of square " + sq.area());

        System.out.println("side of square " + sq.perimeter());

    }
}
