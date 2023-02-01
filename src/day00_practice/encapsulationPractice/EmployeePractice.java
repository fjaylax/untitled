package day00_practice.encapsulationPractice;

public class EmployeePractice {
    private String name;
    private double salary;

    public String getName(){
        return name;


    }
public void setName(String name){
        this.name = name;
}

public double getSalary (){
        return salary;

}
public void setSalary(double salary){
        if (salary <= 0){
            System.out.println("invalid entry:" +salary);
          System.exit(0 );
        }
        this.salary = salary;
}

    @Override
    public String toString() {
        return "EmployeePractice{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

