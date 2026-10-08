import java.util.Scanner;

// Parent Class
class Employee {

    private String name;
    private int id;
    protected double salary;
    private char performanceGrade;

    // Parameterized Constructor
    public Employee(String name, int id, double salary, char performanceGrade) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.performanceGrade = performanceGrade;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public char getPerformanceGrade() {
        return performanceGrade;
    }

    // Salary calculation method
    public double calculateSalary() {
        return salary;
    }

    // Common employee information
    public void displayInfo() {
        System.out.println("Name              : " + name);
        System.out.println("Employee ID       : " + id);
        System.out.println("Original Salary   : " + salary);
        System.out.println("Performance Grade : " + performanceGrade);
    }

    // Method for child classes to override
    public void displayReport() {
    }
}


// Developer Class
class Developer extends Employee {

    private double bonus;

    public Developer(String name, int id, double salary, char performanceGrade, double bonus) {

        super(name, id, salary, performanceGrade);

        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {

        int convertedSalary = (int) getSalary();
        int gradeValue = (int) getPerformanceGrade();

        double finalSalary;

        if (gradeValue >= 65 && gradeValue <= 67) {
            finalSalary = convertedSalary + bonus + 5000;
        } else {
            finalSalary = convertedSalary + bonus;
        }

        return finalSalary;
    }

    @Override
    public void displayReport() {

        displayInfo();

        int convertedSalary = (int) getSalary();
        int gradeValue = (int) getPerformanceGrade();
        char convertedGrade = (char) gradeValue;

        System.out.println("\n---- Type Conversion ----");

        System.out.println("Salary (double)       : "+ getSalary());

        System.out.println("Salary (int)          : "+ convertedSalary);

        System.out.println("Grade (char)          : "+ getPerformanceGrade());

        System.out.println("Grade (int)           : " + gradeValue);

        System.out.println("Int converted to char : " + convertedGrade);

        System.out.println("Bonus                 : " + bonus);

        System.out.println("Final Salary          : " + calculateSalary());
    }
}

class Manager extends Employee {

    private double allowance;

    public Manager(String name, int id, double salary, char performanceGrade, double allowance) {

        super(name, id, salary, performanceGrade);

        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {

        int convertedSalary = (int) getSalary();
        int gradeValue = (int) getPerformanceGrade();

        double finalSalary;

        if (gradeValue >= 65 && gradeValue <= 67) {
            finalSalary = convertedSalary + allowance + 10000;
        } else {
            finalSalary = convertedSalary + allowance;
        }

        return finalSalary;
    }

    @Override
    public void displayReport() {

        displayInfo();

        int convertedSalary = (int) getSalary();
        int gradeValue = (int) getPerformanceGrade();
        char convertedGrade = (char) gradeValue;

        System.out.println("\n---- Type Conversion ----");

        System.out.println("Salary (double)       : "+ getSalary());

        System.out.println("Salary (int)          : "+ convertedSalary);

        System.out.println("Grade (char)          : "+ getPerformanceGrade());

        System.out.println("Grade (int)           : "+ gradeValue);

        System.out.println("Int converted to char : "+ convertedGrade);

        System.out.println("Allowance             : "+ allowance);

        System.out.println("Final Salary          : "+ calculateSalary());
    }
}

public class EmployeePayrollSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("       EMPLOYEE PAYROLL SYSTEM");
        System.out.println("======================================");

        System.out.print("Enter number of employees: ");
        int numberOfEmployees = scanner.nextInt();

        scanner.nextLine();

        Employee[] employees = new Employee[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {

            System.out.println("\n--------------------------------------");
            System.out.println("Employee " + (i + 1));
            System.out.println("--------------------------------------");

            System.out.print("Enter employee type (Developer/Manager): ");
            String type = scanner.nextLine();

            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.print("Enter employee ID: ");
            int id = scanner.nextInt();

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();

            System.out.print(
                    "Enter performance grade (A/B/C/D): ");
            char grade = scanner.next().charAt(0);


            if (type.equalsIgnoreCase("Developer")) {

                System.out.print("Enter developer bonus: ");
                double bonus = scanner.nextDouble();

                employees[i] = new Developer(
                        name,
                        id,
                        salary,
                        grade,
                        bonus
                );

            } else if (type.equalsIgnoreCase("Manager")) {

                System.out.print("Enter manager allowance: ");
                double allowance = scanner.nextDouble();

                employees[i] = new Manager(
                        name,
                        id,
                        salary,
                        grade,
                        allowance
                );

            } else {

                System.out.println("Invalid employee type!");
                i--;
                scanner.nextLine();
                continue;
            }

            scanner.nextLine();
        }

        System.out.println("\n\n======================================");
        System.out.println("          PAYROLL REPORT");
        System.out.println("======================================");

        for (int i = 0; i < employees.length; i++) {
            System.out.println("\n======================================");
            Employee employee = employees[i];
            employee.displayReport();
        }
        scanner.close();
        System.out.println("\n======================================");
        System.out.println("        END OF PAYROLL REPORT");
        System.out.println("======================================");
    }
}