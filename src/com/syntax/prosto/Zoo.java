package com.syntax.prosto;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1= new Animal(2, "m", 23) {
            @Override
            public void move() {
                System.out.println("obj needed too");
            }
        };
        animal1.eat();

        Bird bird1=new Bird(2,"f",33);
        bird1.fly();
        bird1.eat();
        bird1.sleep();


        Chicken chick1= new Chicken(1,"d",34);
        chick1.fly();//"not able to fly" instance -"Flying...." OVERRIDING


        Animal sapr1= new Sparoow(1,"b",45); //beauty Change to Animal data
        sapr1.move();
        //sapr1.fly();

        Fish fish1=new Fish(1,"b",89);
        fish1.move();

        moveAnimals(sapr1);
        moveAnimals(fish1);

        Flyable fbird1=new Sparoow(1,"f",88);
    }
    public static void moveAnimals(Animal animal){
        animal.move();
    }

}
