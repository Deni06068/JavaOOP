package encapsulation.shoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] peopleInput = scanner.nextLine().split(";");
        String[] productsInput = scanner.nextLine().split(";");
        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        for (String input : peopleInput) {
            String[] personData = input.split("=");
            String name = personData[0];
            double money  = Double.parseDouble(personData[1]);
            try {
                Person person = new Person(name, money);
                people.put(name, person);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                return;
            }
        }

        for (String input : productsInput) {
            String[] productData = input.split("=");
            String name = productData[0];
            double price = Double.parseDouble(productData[1]);
            try {
                Product product = new Product(name, price);
                products.put(name, product);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                return;
            }

        }

        String command = scanner.nextLine();
        while (!command.equals("END")){
            String[] input = command.split("\\s+");
            String person = input[0];
            String product = input[1];
            people.get(person).buyProduct(products.get(product));
            command = scanner.nextLine();
        }



        people.forEach((p, prod) -> System.out.println( prod.getName()));
    }
}
