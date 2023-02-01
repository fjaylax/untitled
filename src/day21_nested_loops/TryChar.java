package day21_nested_loops;

public class TryChar {
    public static void main(String[] args) {
       /*
        given String find the print all the unique characters

        unique character: only appears in the String once;

        output: jv
        */
        String str="java";
        for (int i=0;i<str.length();i++){
            System.out.println("*");
            for (int j=0;j<str.length();j++){
                System.out.println("-");
                //System.out.println(str.charAt(i)+ "--->"+str.charAt(j));


            }
        }
    }

}
