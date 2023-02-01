package PracticePractice.CollinsHW5;

public class Unique {
    public static void main(String[] args) {
        System.out.println("findOnlyUniqueChars(\"AAABBBCCCDEF\") = " + findOnlyUniqueChars("AAABBBCCCDEF"));
    }



        public static String findOnlyUniqueChars (String str){
            String unique = "";
            for (int i = 0; i < str.length(); i++) {
                if (!unique.contains("" + str.charAt(i))) {
                    unique += str.charAt(i);
                }
            }
            return unique;
        }
    }
