package Day11_nested;

public class Amazon {
    public static void main(String[] args) {
        double price = 10.99;
        boolean isPrime = false;
        if (isPrime) {
            System.out.println("Free Shipping");
        }else{ // dont have prime
            if (price >= 25) {
                System.out.println("free shipping available");
            }else{
                System.out.println("Shipping cost is  $2.99");

            }
        }


    }
}
