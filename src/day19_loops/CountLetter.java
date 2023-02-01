package day19_loops;

public class CountLetter {
    public static void main(String[] args) {

//frequence of the letter in a word
        //word -->java
        // how many 'a" chars?

        String word = "java";
        int count = 0;
        for (int i = 0; i < word.length(); i++) { // same as   i<=word.lenght()-1
            if (word.charAt(i) == 'a') {
                count++;

            }

        }
        System.out.println(count);
    }
}
