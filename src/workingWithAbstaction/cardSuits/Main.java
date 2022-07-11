package workingWithAbstaction.cardSuits;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        for (CardSuits value : CardSuits.values()) {
            System.out.println("Ordinal value: " + value.ordinal() + "; Name value: " + value.name());
        }
    }

}
