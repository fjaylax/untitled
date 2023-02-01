package PracticePractice.CollinsHW5;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("reverseString(\"ABCD\") = " + reverseString("ABCD"));
    }




    public static String reverseString (String str) {
 String reverse= "";
for(int i = str.length()-1; i >=0; i--) {
 reverse += str.charAt(i); }
 return reverse;
    }
}
