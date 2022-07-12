package encapsulation.pizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        boolean isFound = false;
        for (DoughModifiers value : DoughModifiers.values()) {
            if (flourType.equals(value.toString())) {
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            throw new IllegalArgumentException("Invalid type of dough.");
        } else {
            this.flourType = flourType;
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        boolean isFound = false;
        for (DoughModifiers value : DoughModifiers.values()) {
            if (bakingTechnique.equals(value.toString())) {
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            throw new IllegalArgumentException("Invalid type of dough.");
        } else {
            this.bakingTechnique = bakingTechnique;
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return weight * 2 * DoughModifiers.valueOf(flourType).calories * DoughModifiers.valueOf(bakingTechnique).calories;
    }
}
