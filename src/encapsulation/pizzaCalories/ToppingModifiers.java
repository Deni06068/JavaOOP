package encapsulation.pizzaCalories;

public enum ToppingModifiers {
    Meat(1.2),
    Veggies(0.8),
    Cheese(1.1),
    Sauce(0.9);

    double calories;

    ToppingModifiers(double calories) {
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }
}

