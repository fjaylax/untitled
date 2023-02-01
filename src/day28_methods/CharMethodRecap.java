package day28_methods;

public class CharMethodRecap {
    public static void main(String[] args) {
        getUpperAtoZ();
        getUpperZtoA();
        getLowerZtoA();
getNumber0To();
    }

    public static void getUpperAtoZ() {

        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println();


    }

    public static void getUpperZtoA() {

        for (char letter = 'Z'; letter >= 'A'; letter--) {
            System.out.print(letter + " ");
        }
        System.out.println();


    }

    public static void getLowerZtoA() {

        for (char letter = 'z'; letter >= 'a'; letter--) {
            System.out.print(letter + " ");
        }
        System.out.println();






    }
    public static void getNumber0To() {

        for (char letter = '0'; letter <='9';letter++){
            System.out.print(letter + " ");
        }
        System.out.println();
}
}