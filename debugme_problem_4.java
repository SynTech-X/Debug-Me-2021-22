package debug;

public class Problem4 {

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

    class D extends B{
        void foo(){
            System.out.println("Inside Class D");
        }
    }

    public static void main(String[] args) {
    	Problem4 p=new 	Problem4();
    	Problem4.D d = p.new D();
        d.foo();
    }
}
