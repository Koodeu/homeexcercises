package kl.barmanAndDrink;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {


        Drink drink1 = new Drink.DrinkBuilder().withIngredient(Ingredient.COLA).withPrice(120).build();
        System.out.println(drink1);

        Ingredient[] ingredientList = Ingredient.values();
        System.out.println("Dostępne składniki drinków: ");
        for (Ingredient ingredient : ingredientList){
            System.out.println(ingredient.name());
        }

        Barman barman1 = new Barman.BarmanBuilder().withBarmanGender(BarmanGender.MALE).withAge(19).withSalary(1200).build();
        System.out.println(barman1);

    }
}
