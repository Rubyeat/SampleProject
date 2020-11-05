package try_catch;

public class method2 {
    public static int method2(int a, int b) throws ArithmeticException, IllegalArgumentException{
        if(b==0){
            throw new ArithmeticException("Divide by Zero is not Possible");
        }
        else if(b<0){
            throw new IllegalArgumentException("Negative value is not applicable");
        }
        else{
            int c= a/b;
            return c;
        }



    }
}
