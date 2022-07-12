package encapsulation.pizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        boolean isFound = false;
        for (ToppingModifiers value : ToppingModifiers.values()) {
            if (toppingType.equals(value.toString())) {
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        } else {
            this.toppingType = toppingType;
        }
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateCalories() {
        return weight * 2 * ToppingModifiers.valueOf(toppingType).calories;
    }
}
