package Own_Exception_class;

public class StudentStoreException extends Exception{
    public StudentStoreException(String message, Throwable cause) {
        super(message, cause);
    }
}
