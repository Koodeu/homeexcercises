package kl.barmanAndDrink;

public class App {
    public static void main(String[] args) {


        Drink drink1 = new Drink.DrinkBuilder().withIngredient(Ingredient.COLA).withPrice(120).build();
        System.out.println(drink1);

        Barman barman1 = new Barman.BarmanBuilder().withBarmanGender(BarmanGender.MALE).withAge(19).withSalary(1200).build();
        System.out.println(barman1);

        Drink drinkA = barman1.createDrink(Ingredient.COLA,12);
        System.out.println(drinkA);


    }
}
