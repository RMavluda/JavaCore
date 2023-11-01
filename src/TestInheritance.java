public class TestInheritance {
    public static void main(String[] args) {
        /*// public, protected, default, private
        Jack jack = new Jack("Jack", "Dawson", 21);
        System.out.println(jack.getName() + " " + jack.getSurname() + " " + jack.getAge());
        System.out.println(jack.getNationality() + " " + jack.getResidence());
       *//* System.out.println(jack.residence);
        System.out.println(jack.continet);*//*
        System.out.println(jack.toString());
        System.out.println(jack.parentToString());

        System.out.println();

        C c = new C();
        System.out.println(c.parentToString2());
        System.out.println(c.parentToString3());*/

    //    C c = new C();

        Jack jack = new Jack("jack", "Dawson", 21);
        jack.print();
        jack.count();


    }
}
