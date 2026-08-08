interface Printable {
    void printDetails();
}

class Student implements Printable {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void printDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class Employee implements Printable {
    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Student s = new Student("Swarali", 101);
        Employee e = new Employee("Shruti", 501);

        s.printDetails();
        System.out.println();

        e.printDetails();
    }
}