package encapsulation.pizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String nameOfPizza = input[1];
        int numOfToppings = Integer.parseInt(input[2]);
        input = scanner.nextLine().split("\\s+");
        try {
            Pizza pizza = new Pizza(nameOfPizza, numOfToppings);
            Dough dough = new Dough(input[1], input[2], Double.parseDouble(input[3]));
            pizza.setDough(dough);
            String toppingInput = scanner.nextLine();
            while (!toppingInput.equals("END")) {
                String[] toppingArr = toppingInput.split("\\s+");
                Topping topping = new Topping(toppingArr[1], Double.parseDouble(toppingArr[2]));
                pizza.addTopping(topping);
                toppingInput = scanner.nextLine();
            }
            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
