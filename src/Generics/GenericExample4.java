package Generics;
public class GenericExample4 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        show(cat);
//        Dog dog = new Dog();
//        show(dog);
        Animal animal = new Animal();
        show(animal);
    }
    public static <T extends Animal> void show(T a){

    }
}
//
//class Animal{
//    public Animal(){
//        System.out.println("I`m animal!");
//    }
//}
//class Cat extends Animal{
//    public Cat(){
//        System.out.println("I`m cat!");
//    }
//}
class Dog{
    public Dog(){
        System.out.println("I`m dog");
    }
}