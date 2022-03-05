/*
    Problem 3

    Expected Output :
            [hello,
             , world]
*/

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.append("hello");
        list.append("/n");
        list.append("world");

        System.out.printf(list.toString());

    }
}
