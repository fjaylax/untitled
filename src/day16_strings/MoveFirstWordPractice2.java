package day16_strings;

public class MoveFirstWordPractice2 {
    public static void main(String[] args) {
        /*
        Given a sentence. Display the sentence with the first word moved to the
end of the sentence.
Input:
Java is a fun language
Output:
is a fun language Java
         */
        String sentence="Java is a fun language";
        String reversed="";
        int len=sentence.length();

        int indexSpace=sentence.indexOf(" ");
        String firstPartWord=sentence.substring(0,indexSpace);
        String secondPartSentence=sentence.substring(indexSpace+1,len);
        reversed=secondPartSentence+" "+firstPartWord;
        System.out.println(reversed);









    }

}
