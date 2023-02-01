package Day11_nested;

import java.util.Scanner;

public class GradeLevelHomeWork {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter you grade:");
        int grade = input.nextInt();
         String report = "";

        int Grade = 0;
        if (Grade>=1 && Grade <=5 ){
            report = ("Elementary School");

        }else if (grade >=6 && grade <=8){
            report = ("Middle School");
        }else if (grade >= 9 && grade <= 12) {
            report = ("High School");
        }else if (grade >= 13 && grade<= 16) {
            report = ("College");
        }else if (grade >= 17 && grade <=18 ) {
            report = ("Grad School");
        }else {
            report = ("Invalid Number");

        }
        System.out.println(report);

        }


    }

