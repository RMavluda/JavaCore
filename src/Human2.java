public class Human2{
    String nationality = "American";
    String residence = "USA";
    protected String continet = "Northern American";

    public Human2(){
        System.out.println("Human2 is called!");
    }

    public static void count(){
        System.out.println("Human is counting");
    }
    public String getNationality(){
        return nationality;
    }

    public String getResidence(){
        return residence;
    }

    public void print(){
        System.out.println("Human2 is printing");
    }
    public String toString(){
        return nationality + " " + residence;
    }
}
