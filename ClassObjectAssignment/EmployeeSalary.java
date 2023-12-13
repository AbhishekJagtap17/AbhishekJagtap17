package ClassObjectAssignment;

public class EmployeeSalary {
    int salry;
    int numberOfHourWorked;

    void setEmployeeInformation(int sal, int hours) {
        salry = sal;
        numberOfHourWorked = hours;
    }

    void addSalary() {
        if (salry < 500) {
            salry = salry + 10;
        }
    }

    void addWork() {
        if (numberOfHourWorked > 6) {
            salry = salry + 5;
        }
    }

    public static void main(String[] args) {
        EmployeeSalary emp = new EmployeeSalary();
        emp.setEmployeeInformation(1000, 12);
        emp.addSalary();
        emp.addWork();
        System.out.println("Salary of an employee at the end of the end :" + emp.salry);
    }
}
