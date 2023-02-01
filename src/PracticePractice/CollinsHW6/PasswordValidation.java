package PracticePractice.CollinsHW6;

public class PasswordValidation {
    /*
     String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
6. if all requirements above are met, the method returns true, otherwise returns false

     */


    public static void main(String[] args) {
        System.out.println("PasswordValidation(\"kello1!\") = " + PasswordValidation("HRRRRRR1!"));
    }

    public static String PasswordValidation(String str){

        int countUpper=0,countLower=0,countNumber=0,countSpecialCharacter=0;
        if(str.length()>=6&& !str.contains(" "))

            for (int i = 0; i <str.length() ; i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    countUpper++;
                }else if(Character.isLowerCase(str.charAt(i))) {
                    countLower++;
                }else if(Character.isDigit(str.charAt(i))) {
                    countNumber++;
                }else {
                    countSpecialCharacter++;



                }
            }
        if(countUpper>0&&countLower>0&&countNumber>0&&countSpecialCharacter>0) {
            System.out.println("True");
        } else{
            System.out.println("False");


        }


        return str;





    }


}
