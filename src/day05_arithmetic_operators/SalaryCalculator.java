package day05_arithmetic_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
      double salary = 100_000;
      double stateTaxRate = 0.08;
      double federalTaxRate = 0.21;

      double totalFedState = stateTaxRate + federalTaxRate;
            double totalStateFed00 = federalTaxRate + stateTaxRate;
      //double salary = 100_000;
        //        double stateTaxRate = 0.08;
        //        double federalTaxRate = 0.21;
        //        double stateTax, federalTax, totalTax, salaryAfterTax;
        //        stateTax = salary * stateTaxRate;
        //        federalTax = salary * federalTaxRate;
        //        totalTax = stateTax + federalTax;
        //        salaryAfterTax = salary - totalTax;
        //        System.out.println(salaryAfterTax);


      double totalSalaryAfterAllTaxes = salary % totalStateFed00;
        System.out.println("\t\tMy Salary printout for 2020:");
        System.out.println("Total salary:\t\t\t\t"+ salary);
        System.out.println("State tax rate:\t\t\t\t" +stateTaxRate+'%');
        System.out.println("Federal tax rate:\t\t\t" +federalTaxRate+'%');
        System.out.println("Total tax amount:\t\t\t"+totalFedState+'%');
        System.out.println("Salary after all taxes:\t\t\t"+totalSalaryAfterAllTaxes);
        System.out.println(totalSalaryAfterAllTaxes);



 }
}
