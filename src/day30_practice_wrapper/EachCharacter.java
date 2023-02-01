package day30_practice_wrapper;

public class EachCharacter {
    public static void main(String[] args) {

        //separate each  type of character int o differ array
        String s = "49jaVA$33*&EOWe82";
        String upper = "", lower = "", number = "", special = "";
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (Character.isUpperCase(letter)) {
                upper += letter;

            } else if (Character.isLowerCase(letter)) {
                lower += letter;


            } else
                special += letter;

        }


        System.out.println("upper case: " + lower);
        System.out.println("lower case: " + upper);
        System.out.println("special chars: " + special);
    }

}