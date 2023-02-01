package day14_string;

public class StringMethods1 {
    public static void StringsMethods(String[] args) {


        String item = "pen"; // in String pool
        // directly in heap
        String item2 = new String("pen");
        System.out.println(item == item2); // checks if the object item is the same object as item2

        String item3 = new String("pen");
        System.out.println(item2 == item3);// compares the two objects. They are both in the heap
        // .equals(): compare the value of the Strings, which checks if the characters are the same
        System.out.println(item.equals(item2)); // checks the characters
        System.out.println(item2.equals(item3));
        System.out.println(item3.equals("pen"));

        System.out.println();
        System.out.println(item.equals("Pen")); // checks for exact characters including cases
        System.out.println(item.equalsIgnoreCase("Pen")); // check only for matching characters and ignores all the cases

        System.out.println("------------------------------------");
        String username = "jamesbond";
        String password = "BOND007";
        //System.out.println(username.equals("JAMESBOND"));
        System.out.println(username.equalsIgnoreCase("JAMESBOND"));
        System.out.println(password.equals("BOND007"));

        System.out.println("------------------------------------");

        String day = "Tuesday";
        System.out.println(day.length()); // counts how many character there is
        String day2 = "Friday";
        int len = day2.length(); // length() method gives back int type, so we can use it however we want
        System.out.println(len);

        String str = " hello "; // the character 'hello' are 5 long but spaces are also character, so the space in the beginning and end are included, which means the total length is 7
        System.out.println(str.length()); // prints how many characters the String has, not the String
        // print(7)
        System.out.println(str);

        System.out.println("------------------------------------");
        String word = "Summer";
        word.toUpperCase(); // the uppercase method makes all the character uppercase, but we didn't do anything with this value
        // nextInt();
        System.out.println(word);
        word = word.toUpperCase(); // this time we make all the characters uppercase, then the String it gives us back(all uppercase), was reassigned into the variable
        System.out.println(word);
        System.out.println(word);

        System.out.println("------------------------------------");
        String sentence ="hello My NAME is";
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence); //will print original. string is immutable
         String lowerVer = sentence.toLowerCase();// reassign
        // sentence = sentence.toLowerCase();


        System.out.println("------------------------------------");

        String s = "    java    ";
        System.out.println(s.length());
        s = s.trim();// gets rid of extra space at the beginning and the end (middle space are untouched)
        System.out.println(s);
        System.out.println(s.length());













    }

}
