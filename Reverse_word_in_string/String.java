import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args){
        String str = "ADITI";
        String rev = " ";

//        int len = str.length();
//        for(int i= len-1; i>=0;i--){
//            rev = rev + str.charAt(i);
//        }

        // Using Character Array
        char a[] = str.toCharArray();
        int len = a.length;
        for(int i=len-1;i>=0;i--){
            rev = rev + a[i];
        }
        System.out.print(rev);
    }
}
