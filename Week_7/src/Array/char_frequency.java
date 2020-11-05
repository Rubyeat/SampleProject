package Array;

public class char_frequency {
    public static void main(String[] args) {
        String mystring= "Programming";
        int i, j,k=0, count;
        char[] char_array= new char[15];
        int[] count_array= new int[15];
        int[] color = {0,0,0,0,0,0,0,0,0,0,0};

        for(i=0; i<mystring.length(); i++){
            count=1;
            if(color[i]!=1){
                for(j=i+1; j<mystring.length(); j++){
                    if(mystring.charAt(i)==mystring.charAt(j) ) {
                        color[j]=1;
                        count++;
                    }
                }
            }
            else{
                continue;
            }
                char_array[k]=mystring.charAt(i);
                count_array[k]= count;
                k++;
        }
        for(i=0; i<k; i++){
            System.out.println(char_array[i] + ": " + count_array[i]);
            //System.out.println(count_array[i]);
        }

    }
}
