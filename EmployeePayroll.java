import java.util.Scanner;

public class EmployeePayroll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        String idInput = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        String salaryInput = sc.nextLine();

        System.out.print("Enter Bonus: ");
        String bonusInput = sc.nextLine();

        // Convert to Wrapper Objects
        Integer empId = Integer.valueOf(idInput);
        Double basicSalary = Double.valueOf(salaryInput);
        Double bonus = Double.valueOf(bonusInput);

        // Validation
        if (basicSalary < 0 || bonus < 0) {
            System.out.println("Invalid salary or bonus amount!");
        } else {
            Double netSalary = basicSalary + bonus;

            System.out.println("\nEmployee ID: " + empId);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Bonus: " + bonus);
            System.out.println("Net Salary: " + netSalary);
        }

        sc.close();
    }
}