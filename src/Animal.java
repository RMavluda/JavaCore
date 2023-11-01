
public class Animal implements Sleepable{

    // Abstract, interface
    public void walk(){
        System.out.println("Animal is walking");
    }

    @Override
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    @Override
    public int compareTo(Object a){
        return 0;
    }
/*
    public Animal(){
        System.out.println("Animal constructor");
    }*/
/*

    public abstract void eat();// abstract is noun static
    public abstract void sleep();
*/

  /*  // Polymorphism - несколько форм

    public void eat(){
        System.out.println("Animal is eating");
    }
    public void walk(){
        System.out.println("Animal is walking!");
    }*/

}