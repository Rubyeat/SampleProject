package Array;

public class str {
    public static void main(String[] args) {
        String mystring= "Csi";
        int strLength = mystring.length();
        String strLower = mystring.toLowerCase();
        String strUpper = mystring.toUpperCase();
        System.out.println(mystring);
        System.out.println(strLength);
        System.out.println(strLower);
        System.out.println(strUpper);
        String replica= mystring.replace('s','f');
        System.out.println(mystring.replace('s','f'));
        System.out.println(replica);
        System.out.println(mystring.indexOf('i'));
        System.out.println(mystring.concat("Msi"));
//        for(int i=0; i<mystring.length(); i++)
//        System.out.println(mystring.charAt(i));
    }
}
