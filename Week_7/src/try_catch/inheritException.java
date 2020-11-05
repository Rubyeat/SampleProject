package try_catch;


import java.io.IOException;

public class inheritException {
    public static void main(String[] args) throws IOException {
        A a= new A();
        B b= new B();
        b.abc();

    }

}
class A{
    public void abc() throws IOException {
        System.out.println("Inside Class A");
    }
}

class B extends A{
    public void abc() {
        System.out.println("Inside Class B");
    }

}


