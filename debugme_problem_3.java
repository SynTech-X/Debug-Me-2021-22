import java.util.ArrayList;
import java.util.List;

/*
    Problem 3

    Expected Output :
            [hello,
             , world]
*/

public class debugme_problem_3 {

    public void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("/n");
        list.add("world");

        System.out.printf(list.toString());

    }
}
