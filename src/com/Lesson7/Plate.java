package com.Lesson7;

public class Plate {
    private int food;

    public int getCAPACITY() {
        return CAPACITY;
    }

    private final int CAPACITY=100;
    public int getFood() {
        return food;
    }
    public Plate(int food) {
        if (this.food+food<100){
            this.food = food;
        }
        else {
        this.food=100;
        }
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void increaseFood(int n) {
        food += n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}