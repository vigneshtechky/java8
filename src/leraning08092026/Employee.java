package leraning08092026;

public class Employee {
    String name;

    public void printName() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name +
                '}';
    }
}
