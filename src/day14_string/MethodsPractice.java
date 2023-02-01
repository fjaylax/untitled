package day14_string;

public class MethodsPractice {
    public static void main(String[] args) {


        String thing = "Big SPoon";
        System.out.println(thing.toUpperCase());
        System.out.println(thing.toLowerCase());
        System.out.println("___________________");


        /*
Declare and assign a String for password
the password should be more than 8 character long
print: Valid password or Invalid password
 */
        String password = "qwertyu";
        System.out.println(password.length());
        int inputPassword = password.length();
        if (inputPassword >=8){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");

        }


    }


    }

