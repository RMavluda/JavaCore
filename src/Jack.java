public class Jack extends Human2{
    String name;
    String surname;
    int age;

    public Jack(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Jack(){
        // super
        System.out.println("Jack is called!");
    }
    public static void count(){
        System.out.println("Jack is counting");
    }
    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return name + " " + surname;
    }

    public String parentToString(){
        return super.toString();
    }

    // private, protected, default, public

    @Override
    public void print(){
        System.out.println("Jack is printing");
    }
}
