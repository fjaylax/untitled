package day06_operators;

public class Casting {
    public static void main(String[] args) {

/**create a class named Castings
 1.1 declare a variable of float named averageScore and initialize it to 20.5
 1.2 declare the following variables and assign averageScore to each of them:
 byte num1;
 short num2;
 int num3;
 long num4;
 float num5
 double num6;
 */
 float  averageScore;
 averageScore = 20.5F;

 byte num1;
 short num2;
 int num3;
 long num4;
 float num5;
 double num6;

 num1 = (byte) averageScore;
 num2 =  (short) averageScore;
 num3 = (int) averageScore;
 num4 = (long) averageScore;

 num5 = averageScore; // double is default, need to change to Float

        System.out.println("num5 = " + num5);
        num6 = averageScore;

        System.out.println("num6 = " + num6);






    }
}
