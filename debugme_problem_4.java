/*
       Identify the problem here and debug the program.
*/

public class Problem4{


    static class A{
        void foo(){
            System.out.println("Inside Class A");
        }
    };

    static class B extends A{
        void foo(){
            System.out.println("Inside Class B");
        }
    };

    static class C extends A{
        void foo(){
            System.out.println("Inside Class C");
        }
    };

    static class D extends A{
        void foo(){
            System.out.println("Inside Class D");
        }
    };



    public static void main(String[] args) {

        D d = new D();
        d.foo();
    }
};
