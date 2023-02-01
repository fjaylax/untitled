package day34_custom_classes.student;

import day34_custom_classes.student.Student;

public class SchoolToCallStuden {
    public static void main(String[] args) {

        Student studentOne = new Student();//created object of student
        System.out.println(studentOne);//print objects :->day34_custom_classes.Student@2d209079
//instance variable of the Object
        studentOne.name="Olena";
        studentOne.batchNumber=27;
        studentOne.program="SDET";
        studentOne.grade=99.99;

        System.out.println(studentOne); // this still does not show us anything useful

        System.out.println(studentOne.name);//"Olena";
        System.out.println(studentOne.batchNumber);
        System.out.println(studentOne.program);
        System.out.println(studentOne.grade);


        //call the instance method

        studentOne.study();
        System.out.println("_______________________");

Student studentTwo= new Student();
        System.out.println(studentTwo.name);//null
        System.out.println(studentTwo.batchNumber);//0;
        System.out.println(studentTwo.program);//null
        System.out.println(studentTwo.grade);//0.0




    }
}



