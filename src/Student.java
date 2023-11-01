public class Student {
    private int age;
    private int weight;
    private final String name;
    private final String surname;
    public Student(int age, int weight, String name, String surname) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.surname = surname;
        this.printName();
    }

    private void printName() {
        System.out.println("Name " + name);
    }


//    public Student(int a, int w, String n, String s) {
//        age = a;
//        weight = w;
//        name = n;
//        surname = s;
//    }

    public Student(String n, String s) {
        name = n;
        surname = s;
    }
/*
    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSurname(String s) {
        surname = s;
    }
*/
  /*  public void setWeight(int w) {
        weight = w;
    }
*/
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

}