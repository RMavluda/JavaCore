public class TestPolymorphism {
    public static void main(String[] args) {
    // instanceof
    // Casting implicit vs explicit
        Animal a = new Dog(); // implicit casting -> upcasting
        a.walk();

        Dog d = (Dog)a;
        d.dog_sound();

        if(a instanceof Dog){
            ((Dog)a).dog_sound(); // explicing casting = downcasting

        }

     /*   Animal siyamskaya = new Siyamskaya();
        Animal alabay = new Alabay();

        siyamskaya.walk();
        alabay.walk();*/

    }
}

//Dynamic binding
//A -> B - > C -> D
// A a = new D()
// a.walk();




 /*
 public class Testpolymorphism {
    public static void main(String[] args) {
       Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.eat();
        cat.eat();
        dog.eat();

        System.out.println();

        animal.walk();
        cat.walk();
        dog.walk();

        System.out.println();
        System.out.println("Polymorphism begins");

        Animal a = new Cat();
        Animal b = new Dog();
        a.walk();
        b.walk();
        System.out.println();
        eachAnimalWalk(new Cat());
        eachAnimalWalk(new Dog());
    }

    public static void eachAnimalWalk(Animal a){
        a.walk();
    }

//   public static void catWalk(Cat cat){
//       cat.walk();
//    }
//
//    public static void dogWalk(Dog dog){
//        dog.walk();
//    }
    }*/