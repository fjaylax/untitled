package day16_strings;

public class StrinPractice2Id {
    public static void main(String[] args) {
        /*
        Given a first name and last name create and return an id using the
following format:
the first letter of the first name as lowercase,
the first 3 letters of the last name with the first letter as
uppercase and the rest lowercase,
the length of the first String multiplied by 2
first name: john
last name: smith
id: jSmi8
         */
        String firstName="john";
        String lastName="Smith";
        String firstLetterLow=firstName.substring(0,1).toLowerCase();
        String first3Last=lastName.substring(0,1).toUpperCase()+lastName.substring(1,3).toLowerCase();
        int number=firstName.length()*2;
        String fullId=firstLetterLow+first3Last+number;
        System.out.println("id: "+fullId);


// firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
// lasttName=lasttName.substring(0,1).toUpperCase()+lasttName.substring(1);
    }
}
