
public class App {
    public static void main(String[] args) {
        // compasition
        Heart heart = new Heart();
        Human human = new Human(heart);
        human.getHeart().pounding();
    }
}