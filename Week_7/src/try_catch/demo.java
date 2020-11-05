package try_catch;

public class demo {
    public static void main(String[] args) {
        System.out.println(retint());
    }
    public static int retint(){
        int a=100;
        try {
            a= a/0;
            System.out.println("try Called");
            return a;
        } catch (ArithmeticException e) {
            System.out.println("Catch Called");
            System.out.println(e);
            return a;
        } finally {
            a= 5000;
            int b= 200;
            System.out.println("finally called");
            return b;

        }
    }


}



