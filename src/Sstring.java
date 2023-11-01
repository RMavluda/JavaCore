public class Sstring {
    public static void main(String[] args) {
        Student s1 = new Student(18, 70, "John", "Doe");
/*        String s = "apple";
          s = "orange";
          s1.setAge(18);
          s1.setName("John");
          s1.setSurname("Doe");
          s1.setWeight(70);

          s1.setAge(20);
          s1.setName("Timur");
          s1.setSurname("Rahimquliev");
          s1.setWeight(83);

        Student s2 = new Student();
        s2.setAge(27);
        s2.setName("Jack");
        s2.setSurname("Dawson");
        s2.setWeight(95);*/

        System.out.println(s1.getName() + " " + s1.getSurname() + " " + s1.getAge() + " " + s1.getWeight());
/*
          System.out.println(s2.getName() + " " + s2.getSurname() + " " + s2.getAge() + " " + s2.getWeight());
          System.out.println(s1.name + " " + s1.surname + " " + s1.age + " " + s1.weight);
*/

        Student s2 = new Student("Jack", "Dawson");
        System.out.println(s2.getName() + " " + s2.getSurname() + " " + s2.getAge() + " " + s2.getWeight());
    }
}
