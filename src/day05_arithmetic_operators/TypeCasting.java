package day05_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        // how to do casting
         byte b = 14;
         int i = b; // int is bigger, so this is ok

        long l = 40;//by default 40 is int type, int can automatically be stored into a long because in is smaller than long
         long l2 = 3000000000L; // 3000000000 is int by defult, but it is too big for the int type, we need to tell compiler it is long type with L
        float f= 10; // 10 is int be default , int is smaller than float, so it will autmatically be cast

        double d = 19.99;
        int i2 = (int) d; //double is bigger than int, so will need to cast to int
        System.out.println(i2);

        int i3= 500;
        byte b2 = (byte) i3; // int bigger than byte, so it will need to cast to byte
                System.out.println(b2); //loss of data

        short s =60;
        double d3= s;
        System.out.println(d3);


        float f2 = (float)100.50; // or u can put F at the end
        long l3 = (long) f2;
        System.out.println(l3);

        double d4 = l3;
        System.out.println(d4);


    }
}
