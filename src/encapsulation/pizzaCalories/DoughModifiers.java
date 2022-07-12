package encapsulation.pizzaCalories;

public enum DoughModifiers {
    White(1.5),
    Wholegrain(1.0),
    Crispy(0.9),
    Chewy(1.1),
    Homemade(1.0);

    double calories;

    DoughModifiers(double calories) {
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }
}
