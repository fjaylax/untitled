package day_50_functional_interface.homework;

import java.util.function.Predicate;

public class Homework {
    public static void main(String[] args) {
        //
//        1.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
//        Password must be at least have 8 characters long, and should not contain space
//        Password should at least contain one upper case letter
//                  Password should at least contain one lower case letter
//                  Password should at least contain one special characters
//                  Password should at least contain a digit


        Predicate<String> verifyPassword = (pass) -> {

            if (pass.length() < 8) {
                return false;
            }

            boolean  isUpper = false, isDigit= false, islower= false, isSpecial = false;

            for (int i = 0; i < pass.length(); i++) {
                if (Character.isDigit(pass.charAt(i))) {
                    isDigit = true;
                }
                if (Character.isUpperCase(pass.charAt(i))) {
                    isUpper = true;
                }
                if (Character.isLowerCase(pass.charAt(i))) {
                    islower = true;
                }
                if (!Character.isAlphabetic(pass.charAt(i)) && !Character.isDigit(pass.charAt(i))) {
                    isSpecial = true;
                }
            }

            return isDigit && isUpper && islower && isSpecial;
        };

        System.out.println(verifyPassword.test("PAssword#4"));
        System.out.println(verifyPassword.test("Password#"));
        System.out.println(verifyPassword.test("Password4"));
        System.out.println(verifyPassword.test("assword#4"));
        System.out.println(verifyPassword.test("Assw23#"));
        System.out.println(verifyPassword.test("PASSWORd#4"));

    }
}






