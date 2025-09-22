package Test;

import Classes.MyArrayList;

public class Employees {
    public static void main(String[] args) {
        MyArrayList employees = getEmployees();
        employees.add("James");
        employees.remove("Emma");

        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }

    private static MyArrayList getEmployees() {
        MyArrayList employees = new MyArrayList();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");

        return employees;
    }
}
