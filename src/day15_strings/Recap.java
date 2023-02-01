package day15_strings;

public class Recap {
    public static void main(String[] args) {

        String first = "Testing";
        first.toUpperCase();
        System.out.println(first);//prints original
        first=first.toUpperCase();
        System.out.println(first);//prints all CAPS

        String second = "SOFT SKILL";
        String lowerSecond = second.toLowerCase();
        System.out.println(second);//original ALL CAPS
        System.out.println(lowerSecond);//new version resigned lower case

        System.out.println("_____________________");

        String third ="  hello world  ";
        System.out.println(third.length());//15
        third=third.trim();
        System.out.println(third.length());//12
        System.out.println(third);//hello world



    }
}
