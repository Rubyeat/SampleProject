package try_catch;

public class method1 {
    public static void main(String[] args) {
        method2 obj= new method2();
        try{
            int x= obj.method2(4,-2);
            System.out.println(x);
        }catch (ArithmeticException e){
            System.out.println("Catch Called");
            System.out.println(e);
        }catch (IllegalArgumentException e){
            System.out.println("Catch for negative number");
            System.out.println(e);
        }


    }



}
