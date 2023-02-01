package day34_custom_classes.HOME_WORK;




public class RectangleObjects {
    public static void main(String[] args) {
        RectangleMethods rec1 = new RectangleMethods();
        System.out.println(rec1);

        rec1.base = 10.0;
        rec1.height = 20.0;
        rec1.x = 5;
        rec1.y = 12;

        System.out.println(rec1);

        rec1.calculatePerimeter();
        System.out.println(rec1);

        rec1.calculateArea();
        System.out.println(rec1);


    }

}




