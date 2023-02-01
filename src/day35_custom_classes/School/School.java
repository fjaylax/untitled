package day35_custom_classes.School;

public class School {
    String name;
    int totalNumOfStudents;
    double avgGpa;

    public School(String name, int totalNumOfStudents, double avgGpa) {
        this.name = name;
        this.totalNumOfStudents = totalNumOfStudents;
        this.avgGpa = avgGpa;



    /*public School(String inputName, int inputStudent, double inputGpa) {
        name = inputName;
        totalNumOfStudents = inputStudent;
        avgGpa = inputGpa;

     */
    }
        @Override
        public String toString() {
            return "School{" +
                    "name='" + name + '\'' +
                    ", totalNumOfStudents=" + totalNumOfStudents +
                    ", avgGpa=" + avgGpa +
                    '}';
        }

    }
