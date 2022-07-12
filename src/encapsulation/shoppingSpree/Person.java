package encapsulation.shoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }else {
            this.name = name;
        }

    }

    private void setMoney(double money) {
        if (money < 0.0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }else {
            this.money = money;
        }
    }

    public void buyProduct(Product product) {
        if (this.money >= product.getCost()){
            this.money = money - product.getCost();
            this.products.add(product);
            System.out.println(this.name + " bought " + product.getName());
        }else {
            System.out.println(name + " can't afford " + product.getName());
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + " - ");
        List<String> productList = new ArrayList<>();
        for (Product product : products) {
            productList.add(product.getName());
        }
        if (!productList.isEmpty()) {
            sb.append(String.join(", ", productList));
        }else {
            sb.append("Nothing bought");
        }
        return sb.toString();
    }
}
