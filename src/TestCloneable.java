public class TestCloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Man man1 = new Man(3, "Jack");
        Man man2 = man1.clone(); // ukazatel na adress
        man1.setId(10);

        System.out.println(man1.getId());
        System.out.println(man2.getId());
    }
}
