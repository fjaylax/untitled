package PracticePractice.CollinsHW3;

public class RemoveDuplicates3 {
    public static void main(String[] args) {
        uniqueChars("AAABBBCCCDEF");
    }

        public static String uniqueChars (String str){
            String unique = "";
            for (int i = 0; i < str.length(); i++) {
                if (!unique.contains("" + str.charAt(i))) {
                    unique += str.charAt(i);
                }
            }
            return unique;

        }
    }
