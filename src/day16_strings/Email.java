package day16_strings;

public class Email {
    public static void main(String[] args) {
   /*
   saim@cydeo.com
   name :saim
   domain: cydeo
    */

        String email = "saim@cydeo.com";
        int indexOfAt = email.indexOf('@');
        String name = email.substring(0,indexOfAt);
        int indexOfDot = email.indexOf('.');
String domain = email.substring(indexOfAt+1, indexOfDot);
        System.out.println("Full email: "+email);
        System.out.println("Name part:  "+domain );
        System.out.println("Domain part: "+name);



    }

}
