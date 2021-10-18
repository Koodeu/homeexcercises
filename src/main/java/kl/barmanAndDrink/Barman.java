package kl.barmanAndDrink;

public class Barman {

    private BarmanGender barmangender;
    private int age;
    private double salary;


    public Barman(BarmanGender barmangender, int age, double salary) {
        this.barmangender = barmangender;
        this.age = age;
        this.salary = salary;
    }

    private Barman(BarmanBuilder barmanBuilder){
        this.barmangender=barmanBuilder.barmanGender;
        this.age=barmanBuilder.age;
        this.salary=barmanBuilder.salary;
    }


    public static class BarmanBuilder{
        private BarmanGender barmanGender;
        private int age;
        private double salary;

        public BarmanBuilder withBarmanGender(BarmanGender barmanGender){
            this.barmanGender=barmanGender;
            return this;
        }

        public BarmanBuilder withAge(int age){
            this.age=age;
            return this;
        }

        public BarmanBuilder withSalary(double salary){
            this.salary=salary;
            return this;
        }

        public Barman build(){
            return new Barman(this);
        }
    }

    public Drink createDrink(Ingredient ingredient, double price){
        Drink drink = new Drink.DrinkBuilder().withIngredient(ingredient).withPrice(price).build();
            return drink;
    }


}
