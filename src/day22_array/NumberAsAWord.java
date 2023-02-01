package day22_array;

import java.util.Scanner;

public class NumberAsAWord {
    public static void main(String[] args) {
        String[] num={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelfth", "thirteen","fourteen", "fifteen"};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
int n=input.nextInt();
if (n>=1&&n<=15) {
    System.out.println(num[n - 1]);
}else{
    System.out.println("invalid number. Range is 1-15");
}



    }
}
