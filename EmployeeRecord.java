public class EmployeeRecord {
    public static void main(String[] args) {

        String companyName = "Digitech Infra";
        String employeeName = "Muhammad Bilal Waleed";
        String employeeID = "EMP-1010";
        String designation = "Software Developer";
        String department = "Information Technology";
        int age = 21;
        int salary = 85000;
        int experience = 2;
        char performanceGrade = 'A';
        boolean isPermanentEmployee = true;

        System.out.println("==========================================");
        System.out.println("        COMPANY EMPLOYEE RECORD");
        System.out.println("==========================================");
        System.out.println("Company Name         : " + companyName);
        System.out.println("Employee Name        : " + employeeName);
        System.out.println("Employee ID          : " + employeeID);
        System.out.println("Designation          : " + designation);
        System.out.println("Department           : " + department);
        System.out.println("Age                  : " + age);
        System.out.println("Salary               : Rs. " + salary);
        System.out.println("Experience (Years)   : " + experience);
        System.out.println("Performance Grade    : " + performanceGrade);
        System.out.println("Permanent Employee   : " + isPermanentEmployee);
        System.out.println("==========================================");

    }
}