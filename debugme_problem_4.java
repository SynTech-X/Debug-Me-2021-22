/*
       Identify the problem here and debug the program.
*/

public class debugme_problem_4 {

    class A{
        void foo(){
            System.out.println("Inside Class A");
        }
    }

    class B extends A{

        void foo(){
            System.out.println("Inside Class B");
        }
    }

    class C extends A{
        void foo(){
            System.out.println("Inside Class C");
        }
    }

    class D extends C {
        void foo(){
            System.out.println("Inside Class D");
        }
    }
     public static void main(String[] args) {

        D d = new debugme_problem_4().new D();
        d.foo();
    }
}