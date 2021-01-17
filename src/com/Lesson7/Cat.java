package com.Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety=false;
    }
    public void eat(Plate p) {
        if (satiety==true) System.out.println("I'm not hungry");
        else{
            if (p.getFood()-appetite<0){
                System.out.println("Cat "+ name+" say: Its too little for me...");
            } else
            {
                System.out.println("Cat "+ name+" say: Omnomnom");
                p.decreaseFood(appetite);
                satiety=true;
            }
        }
    }
    public void getSatiety(){
        if (satiety==true){
            System.out.println("Cat "+ name+" say: I'm full");
        } else if (satiety==false){
            System.out.println("Cat "+ name+" say: I'm hungry");
        }
    }

}
