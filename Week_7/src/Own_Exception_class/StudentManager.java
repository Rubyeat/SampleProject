package Own_Exception_class;

import java.sql.SQLException;

public class StudentManager {
    public Student find(String studentID) throws StudentNotFoundException {
        if(studentID.equals("12345")){
            return new Student();
        }
        else {
            throw new StudentNotFoundException("Could not find with Student id: "+ studentID);
        }

    }
    int [] b= {1,2,3};
   public void save(Student student) throws StudentStoreException {
       try {
          int a= b[3];
       } catch (ArrayIndexOutOfBoundsException ex) {
           throw new StudentStoreException("Failed to save student", ex);
       }

 }
}
