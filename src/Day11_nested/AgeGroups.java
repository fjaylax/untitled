package Day11_nested;

public class AgeGroups {
    public static void main(String[] args) {
        int age = -3;

        if (age >= 0 && age <= 120) { //preconditon to check age valid group

            if (age <= 1) {
                System.out.println("baby");

            } else if (age <= 5) {
                System.out.println("toddler");
            } else if (age <= 13) {
                System.out.println("kid");
            } else if (age <= 18) {
                System.out.println("teen");
            } else if (age <= 40) {
                System.out.println("adult");
            } else if (age <= 65) {
                System.out.println("middle age");
            } else {
                System.out.println("senior");
            }


        } else {
            System.out.println("Age is invalid");
            if (age < 0) {
                System.out.println("cannt be negative");

            } else {
                System.out.println("age cannot be more 120");
            }
        }
    }
}