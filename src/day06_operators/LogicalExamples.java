package day06_operators;

public class LogicalExamples {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isGoodTemp = true;
        boolean isGame = false;
        boolean doBbq = isWeekend && isGoodTemp && isGame;
        boolean doBbq1 = isGame && isWeekend;
        System.out.println(doBbq);
        System.out.println(doBbq1);

        int  age = 40;
        boolean inValidAge = age < 0 || age >120; // false|| false -> false
        System.out.println("inValidAge = " + inValidAge);




    }
}
