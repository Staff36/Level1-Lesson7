package com.Lesson7;

public class Main {

    public static void main(String[] args) {
        TestApp.TestApplication();

    }
}

 class TestApp{
    public static void TestApplication(){

        Cat cat[] = {new Cat("Barsik", 5),
                new Cat("Murka", 70),
                new Cat("Bagira", 25),
                new Cat("Feofan", 4),
                new Cat("Perchik", 6),
                new Cat("Dunya", 1),


        };
        Plate plate = new Plate(20);
        plate.info();
        FoodSupplier foodSupplier= new FoodSupplier(1000);
        foodSupplier.putFoodToPlate(plate,70);
        plate.info();

        for (int i = 0; i <cat.length ; i++) {
            cat[i].eat(plate);
            plate.info();
            }
        for (int i = 0; i <cat.length ; i++) {
            cat[i].getSatiety();
        }

    }
    
    
 } 
