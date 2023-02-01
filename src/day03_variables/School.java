package day03_variables;

public class School {
    public static void main(String[] args) {
        int numberOfStudentsGrade1 = 12;
        int numberOfStudentsGrade2 = 11;
        int numberOfStudentsGrade3 = 15;
        int numberOfStudentsGrade4 = 12;
        int numberOfStudentsGrade5 = 13;

       int wholeNumberOfStudents = numberOfStudentsGrade1 + numberOfStudentsGrade2 + numberOfStudentsGrade3 + numberOfStudentsGrade4 + numberOfStudentsGrade5;
        System.out.println("The whole number of students:\t" + wholeNumberOfStudents);

        double averageGpa = 4.1;
        double numberOfSchoolDays = 180;
        double numberOfSnowDays = 7;
        System.out.println("Average GPA:\t\t\t\t\t"+ averageGpa);
        System.out.println("School days total:\t\t\t\t"+ numberOfSchoolDays);
        System.out.println("Snow days total:\t\t\t\t"   + numberOfSnowDays);

    }

}
/** declare and assign all these variables:
 (all int) grade1, grade2, grade3, grade4, grade5

 assign the number of students in each grade

 extra: try to create another variable to find the total number of students in the whole school

 (all double) average gpa, number of school days, number of snow days
 */

