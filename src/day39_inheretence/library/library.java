package day39_inheretence.library;

import day38_encapsulation.BankAccount;

public class library {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.author = "James Clear";
        book1.title = "Atomic Habits";
        // book1 has access to 6 variables: author, hasMovie, title, genre, chapters, numberOfPages

        AudioBook book2 = new AudioBook();
        book2.duration = 45.20;
        book2.narrator = "James Bond";
        book2.hasMovie = true;
        // book2 has access to 8 variables. All the variables from the parent Book class and the two variables declared in the AudioBook class

        EBook book3 = new EBook();
        book3.size = 24.12;
        book3.onKindle = true;
        //book3.narrator = the narrator was a variable declared in the AudioBook class
        // book3 has access to 8 variables. All the variables from the parent Book class and the two variables declared in the EBook class

    }
}







