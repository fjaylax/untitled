package PracticePractice.HWtask1Dardan;

public class Division2 {
    public static void main(String[] args) {
        double num1 = 11;
        int num2 = 2;
        int count=0;
        for ( double i=num1; i>=num2; i-=num2){
            count ++;
        }
        System.out.println(count);

        double result= num1/num2;
        System.out.println("result = " + result);
    }
}
