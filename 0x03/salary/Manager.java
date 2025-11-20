public class Manager extends Employee {

    Manager(double fixedSalary) {
        super(fixedSalary);
    }

    public double calculateBonus(Department department) {
        double bonus = 0;
        if (department.reachedTarget()) {
            bonus = this.getFixedSalary() / 5;
        }
        return bonus;
    }
}
