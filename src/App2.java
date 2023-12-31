
import java.util.List;
import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {
        // aggregations
        Person driver1 = new Person("John", 1);
        Person driver2 = new Person("Jack", 2);
        Person driver3 = new Person("Alan", 3);

        List<Person> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);

        Company company = new Company();
        company.setDrivers(drivers);

        for(Person p : company.getDrivers())
            System.out.println(p.getName() + " " + p.id);
    }
}