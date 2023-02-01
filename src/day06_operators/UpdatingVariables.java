package day06_operators;

public class UpdatingVariables {

    public static void main(String[] args) {

        int n =10;

        //reassign a new value
        n = 20;
        int a = 3;
        a = a +4; // a+4 -> 3+4 = 7 gets stores as new value for a

        int b = 15;
        b +=9; // b=b+9
        b+= 1;

        int z = 10;
        z++;
        System.out.println(z);
        /*
        updating number by one
        z==1
        or
        z= z + 1 //TODO finish
         */
        System.out.println();

        int java = 8;
        int testing = --java;
        System.out.println(java); //8->7
        System.out.println(testing);//7

        System.out.println();
        int x = 7;
        int y = x--;//post increment


        System.out.println(x);
        System.out.println(y);
        System.out.println(y);
















    }
}
