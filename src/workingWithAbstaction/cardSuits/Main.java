package workingWithAbstaction.cardSuits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String cardName = scanner.nextLine();
        String cardSuit = scanner.nextLine();
        System.out.println("Card name: " + cardName + " of " + cardSuit + "; Card power: " + (CardSuits.valueOf(cardSuit).getSuitPower() + CardRank.valueOf(cardName).getRankPower()));

    }
}
