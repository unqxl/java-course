package Classes;

public class Employee {
    public String name;
    public String position;
    public int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void showInfo() {
        String text = String.format("Name: %s, Position: %s, Salary: %d", name, position, salary);
        System.out.println(text);
    }
}
