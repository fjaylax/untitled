package day07_scanner;

public class GiftCard {
    public static void main(String[] args) {

    double giftCard = 500;
    int uses = 3;

        System.out.println("using giftcard. $150 removed");
        giftCard -= 150; // giftCard = giftCard-150;
        uses--;

        System.out.println("using giftcard. $99 removed");
        giftCard -= 99; // giftCard = giftCard-150;
        uses--;
        System.out.println("Gift card left $ "+giftCard);
        System.out.println("Number of time can be used: "+uses);


    }
    }


