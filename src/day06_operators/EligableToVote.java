package day06_operators;

public class EligableToVote {
    public static void main(String[] args) {
        int age =21;

        boolean isCitizen = true;
        boolean hasCriminalRecord = false;
        boolean over18 = age >= 18;
        boolean isElligible = isCitizen && !hasCriminalRecord;
        System.out.println("isElligible = " + isElligible);
/*

        int age = 21;
        boolean isCitizen = true;
        boolean hasCriminalBackground = false;
        boolean over18 = age >= 18;

                isCitizen && over18 && !hasCriminalBackground;
                true      && true &&    !false
                true      && true &&    true
                    true   &&    true
                           true

            ========================================

        int age = 21;
        boolean isCitizen = true;
        boolean hasCriminalBackground = true;
        boolean over18 = age >= 18;

                isCitizen && over18 && !hasCriminalBackground;
                true      && true &&    !true
                 true      && true &&    false
                       true && false
                          false
         */



    }
}
