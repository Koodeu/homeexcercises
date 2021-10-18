package kl.barmanAndDrink;

public class Drink {

    private Ingredient ingredient;
    private double price;


    private Drink(DrinkBuilder drinkBuilder) {
        this.ingredient = drinkBuilder.ingredient;
        this.price = drinkBuilder.price;
    }


    public static class DrinkBuilder {

        private Ingredient ingredient;
        private double price;

        public DrinkBuilder withIngredient(Ingredient ingredient) {
            this.ingredient = ingredient;
            return this;
        }

        public DrinkBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Drink build() {
            return new Drink(this);
        }

    }

    @Override
    public String toString() {
        return "Drink{" +
                "ingredient=" + ingredient +
                ", price=" + price +
                '}';
    }
}
