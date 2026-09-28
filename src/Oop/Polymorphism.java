package Oop;

class Animal{
    public void sound(){
        System.out.print("Every animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    public void sound() {
        System.out.print("Dog meows");
    }
}

public class Polymorphism {
    public static void main(String args[]){
        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
