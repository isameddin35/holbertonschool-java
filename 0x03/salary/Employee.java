public class Employee {
    private double fixedSalary;

    public double getFixedSalary() {
        return fixedSalary;
    }

    Employee(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    double calculateBonus(Department department) {
        double bonus = 0;
        if (department.reachedTarget()) {
            bonus = fixedSalary / 10;
        }
        return bonus;
    }

    double calculateTotalSalary(Department department) {
        return fixedSalary + calculateBonus(department);
    }
}
