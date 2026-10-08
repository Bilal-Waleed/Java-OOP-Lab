import java.util.Scanner;

class ID {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee ID: ");
        String id = sc.nextLine();

        System.out.print("Enter basic salary: ");
        int basicSalary = sc.nextInt();

        double rentAllowance = basicSalary * 0.20;
        double medicalAllowance = basicSalary * 0.10;
        double grossSalary = basicSalary + rentAllowance + medicalAllowance;

        System.out.println("\n-------------------------------------");
        System.out.println("        EMPLOYEE SALARY RECORD       ");
        System.out.println("-------------------------------------");
        System.out.println("Employee ID:     " + id);
        System.out.println("Employee Name:   " + name);
        System.out.println("-------------------------------------");
        System.out.println("Basic Salary:    " + basicSalary);
        System.out.println("Rent Allowance:  " + rentAllowance);
        System.out.println("Med. Allowance:  " + medicalAllowance);
        System.out.println("-------------------------------------");
        System.out.println("GROSS SALARY:    " + grossSalary);
        System.out.println("-------------------------------------");
        
        sc.close();
    }
}
