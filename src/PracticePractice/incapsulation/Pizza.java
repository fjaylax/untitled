package PracticePractice.incapsulation;

public class Pizza {

    private String size;
    private int numberOfToppings;

    public Pizza(String size, int numberOfToppings) {
        this.size = size;
        this.numberOfToppings = numberOfToppings;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equals("Medium") || size.equals("large")) {

            this.size = size;
        }
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings>= 0&& numberOfToppings<=20)

        this.numberOfToppings = numberOfToppings;
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }
}





