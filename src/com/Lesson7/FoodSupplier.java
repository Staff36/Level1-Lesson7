package com.Lesson7;

public class FoodSupplier {
    int valueOfFood;
    public FoodSupplier(int valueOfFood){
        this.valueOfFood=valueOfFood;
    }

    private int isCorrectValueOfFood(Plate plate,int foodValue) {
        int correctValue=0;
        if (this.valueOfFood >= foodValue) {
        if( foodValue+plate.getFood()<=plate.getCAPACITY()){
            correctValue=foodValue;
        } else {
            correctValue= plate.getCAPACITY()-plate.getFood();
        }
        }else {
            correctValue=valueOfFood;
        }
        return correctValue;
    }

    public void putFoodToPlate(Plate plate, int foodValue){
        int correctValue=isCorrectValueOfFood(plate,foodValue);
        System.out.println("Put "+ correctValue+" grams of food on a plate");
        valueOfFood-=correctValue;
        plate.increaseFood(correctValue);

    }

}
