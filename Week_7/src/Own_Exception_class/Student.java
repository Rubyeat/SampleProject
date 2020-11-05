package Own_Exception_class;

public class Student {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        try{
            Student student = manager.find("00001");
        }catch (StudentNotFoundException ex){
            System.out.println(ex);
        }


       StudentManager manager1 = new StudentManager();
       try {
         manager1.save(new Student());

       } catch (StudentStoreException ex) {
           System.out.println(ex);
       }

    }
}