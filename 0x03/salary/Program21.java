import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Program21 {
    private static final DecimalFormat df;

    static {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        df = new DecimalFormat("#0.00", symbols);
    }

    public static void main(String[] args) {
        Department engineeringDepartment = new Department(1000, 1100);
        Department documentationDepartment = new Department(1000, 800);

        Employee engineeringEmployee1 = new Employee(2300);
        Employee engineeringEmployee2 = new Employee(3650);
        Manager engineeringManager = new Manager(5800);

        Employee documentationEmployee1 = new Employee(2500);
        Employee documentationEmployee2 = new Employee(3000);
        Manager documentationManager = new Manager(4980);

        print(engineeringEmployee1, engineeringDepartment);
        print(engineeringEmployee2, engineeringDepartment);
        print(engineeringManager, engineeringDepartment);

        print(documentationEmployee1, documentationDepartment);
        print(documentationEmployee2, documentationDepartment);
        print(documentationManager, documentationDepartment);
    }

    private static void print(Employee e, Department d) {
        System.out.println(
                "Fixed Salary: " + df.format(e.getFixedSalary()) +
                        " - Total Salary: " + df.format(e.calculateTotalSalary(d)) +
                        " - Bonus Amount: " + df.format(e.calculateBonus(d))
        );
    }
}
