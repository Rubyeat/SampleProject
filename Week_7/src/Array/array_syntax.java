package Array;

public class array_syntax {
    public static void main(String[] args) {
        int[] myarray= {1,2,3};
        /*
        int[] myarray= new int[3];
        int[] myarray= new int[] {1,2,3};
         */
        //System.out.println(myarray[2]);
        int index = 0;
        while(index< 3){
            System.out.println(myarray[index]);
            index++;
        }


    }
}
