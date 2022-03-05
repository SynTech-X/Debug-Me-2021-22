/*
    Problem 3

    Expected Output :
            [hello,
             , world]
*/
import java.util.ArrayList;
public class Problem4 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("\n");
        list.add("world");

        System.out.printf(list.toString());

    }
}
