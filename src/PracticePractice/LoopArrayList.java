package PracticePractice;

import java.util.ArrayList;

public class LoopArrayList {
    public static void main(String[] args) {
        ArrayList<Character> alphabet = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);


        }
        System.out.println(alphabet);




        alphabet.remove((Character) 'a');       // 'a' =   98
        alphabet.remove((Character) 'e');
        alphabet.remove((Character) 'i');
        alphabet.remove((Character) 'o');
        alphabet.remove((Character) 'u');

        System.out.println(alphabet);

}

}
